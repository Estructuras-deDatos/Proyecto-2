/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import proyecto.interfaces.windowResumeDetails;
import proyecto.interfaces.windowSearchByKeywords;

/**
 * Esta clase, define funciones necesarias para el registro de las palabras clave almacenadas en cada resumen.
 * @author: andre
 * @version: 22/03/2023
 */
public class searchByKey {
    /**
     * Metodo para esconder los elementos de la interfaz grafica
     */
    public static void hide(){
        windowSearchByKeywords.fail_message.setVisible(false);
        windowSearchByKeywords.fail_select.setVisible(false);
        windowSearchByKeywords.investLabel.setVisible(false);
        windowSearchByKeywords.resumeFoundList.setVisible(false);
        windowSearchByKeywords.select.setVisible(false);
        windowSearchByKeywords.jScrollPane1.setVisible(false);
        
    }
    /**
     * Metodo para mostrar los elementos de la interfaz grafica
     */
    public static void show_options(){
        windowSearchByKeywords.investLabel.setVisible(true);
        windowSearchByKeywords.resumeFoundList.setVisible(true);
        windowSearchByKeywords.select.setVisible(true);
        windowSearchByKeywords.jScrollPane1.setVisible(true);
    }
    /**
     * Metodo para mostrar los detalles del resumen seleccionado
     * @param title - el titulo del resumen seleccionado
     * @param sumHash - HashTable que guarda los resumenes 
     */
    public static void make_details_visible(String title, Hash sumHash){
        Summary sum =(Summary) uploadSummary.search_sum(title.trim(), sumHash);
        
        windowResumeDetails.summary_title.setText(uploadSummary.capitalize(sum.getTitle()));
        windowResumeDetails.summary_authors.setText(uploadSummary.array_readable(sum.getAuthors()));
        windowResumeDetails.summary_keyw.setText(uploadSummary.array_readable(sum.getKeyw()));
        windowResumeDetails.summary_body.setText(sum.getBody());
    }
    
    
    /**
     * Metodo para mostrar las opciones de resumenes relacionados con la palabra clave buscada
     * @param keyHash - Hash Table de las palabras claves
     * @param sumHash - Hash Table que contiene a los resumenes
     */
    public static void set_options(Hash keyHash, Hash sumHash){
        String key = windowSearchByKeywords.keywordTextField.getText();
        String titles = get_titles(keyHash, key, sumHash);
        if(!titles.isEmpty()){
            show_options();
            windowSearchByKeywords.investLabel.setText("Investigaciones encontradas con " + windowSearchByKeywords.keywordTextField.getText() + ": ");
            windowSearchByKeywords.resumeFoundList.setListData(titles.split(","));
        }else{
            hide();
            windowSearchByKeywords.fail_message.setVisible(true);
            windowSearchByKeywords.fail_message.setText("No hay resumenes con esta palabra clave");
        }
    }
    
    /**
     * Metodo para obtener los titulos de los resumenes que corresponden a la palabra clave
     * @param keyHash
     * @param key
     * @param sumHash
     * @return 
     */
    public static String get_titles(Hash keyHash, String key, Hash sumHash){
        Object[] result = search_exists(keyHash, key);
        boolean exists = (boolean) result[0];
        Nodo n;
        if(exists){
            n=(Nodo) result[1];
            String indexes = n.getIndex();
            String[] index = indexes.split(",");
            Summary aux;
            if(index.length==1){
                 aux = (Summary) sumHash.getVal()[Integer.parseInt(index[0])];
                return uploadSummary.capitalize(aux.getTitle());
            }else{
                String titles="";
                for(String i : index){
                    aux = (Summary) sumHash.getVal()[Integer.parseInt(i)];
                    titles+= uploadSummary.capitalize(aux.getTitle())+",";
            }  
                return titles;
            }
        }else{
            return"";
        }
    }
    
    /**
     * Metodo para agregar una nueva palabra clave en el hash table
     * @param sumHash
     * @param keyHash
     * @param newSum 
     */
    
  
    public static void insert_new(Hash sumHash,Hash keyHash, Summary newSum){
        String[] keyW = newSum.getKeyw();
        for(String key: keyW){
            int in = search_in(newSum.getTitle(), sumHash);
            insert_key(keyHash, key, in);
        }
    }
    
   /**
    * Metodo para obtener el indice del resumen en el Hash Table principal
    * @param key -  llave
    * @param hash - Hash table de Resumenes
    * @return indice de la llave dada
    */
    public static int search_in(String key, Hash hash){
        int found = -1;
        if(!hash.isEmpty()){
            int in = hash.sfold(key.toLowerCase(), hash.getCapacity());
            Summary aux = (Summary) hash.getVal()[in];
            if(aux!=null){
            if(aux.getTitle().equalsIgnoreCase(key.toLowerCase())){
                found = in;
            }
            else{
                int i =1;
                int k=in;
                while(i<hash.getCapacity()){
                    k = (in + (i*i)) % hash.getCapacity();
                    i++;
                    aux=(Summary) hash.getVal()[k];
                    if(aux!=null){
                        if(aux.getTitle().equalsIgnoreCase(key.toLowerCase())){
                            found =k;
                        }
                }
            }
        }
 
    }}
    return found;
    }
    
    /**
     * Metodo para crear una Hash Table que contiene como llaves las palabras claves de cada resumen
     * @param sumH Hash Table de los resumenes
     * @return la Hash Table creada
     */
    public static Hash create_hash(Hash sumH){
        int capacity = uploadSummary.get_capacity((sumH.getCapacity()*5));
        Hash keyHash = new Hash(capacity);
        for(int i=0; i<sumH.getCapacity();i++){
            Summary aux = (Summary) sumH.getVal()[i];
            if(aux!=null){
                String[] keyW = aux.getKeyw();
                for(String key : keyW){
                    insert_key(keyHash, key, i);
                }
            }
        }
        
        return keyHash;
    }
    
    /**
     * Metodo para revisar si la palabra clave ya esta incluida en el Hash Table
     * @param keyHash - Hash Table de las palabras claves
     * @param keyW - llave de la palabra clave
     * @return 
     */
    public static Object[] search_exists(Hash keyHash, String keyW){
        keyW = uploadSummary.replace_accents(keyW);
        Object[] result= new Object[2];
        result[0]=false;
        for(int i=0; i<keyHash.getCapacity();i++){
            Nodo aux = (Nodo) keyHash.getVal()[i];
            if(aux!=null){
                String name = uploadSummary.replace_accents(aux.getKey());
                if(name.equalsIgnoreCase(keyW)){
                    result[0]=true;
                    result[1]=aux;
                }
            }
        }
        return result;
    }
    
    /**
     * Metodo para insertar un indice en el Hash Table
     * @param keyHash
     * @param keyW
     * @param in 
     */
    public static void insert_key(Hash keyHash, String keyW, int in){
        Object[] result =search_exists(keyHash,keyW);
        boolean exists = (boolean) result[0];
        Nodo node;
        if(!exists){
            node = new Nodo(keyW);
            node.setIndex(String.valueOf(in));
            keyHash.insert(keyW, node);
        }else{
            node= (Nodo) result[1];
            node.setIndex(String.valueOf(in));
        }
    }
} //Cierre de la clase
