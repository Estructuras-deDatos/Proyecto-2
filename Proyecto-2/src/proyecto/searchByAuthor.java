/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import static proyecto.interfaces.auxFunctions.convertToTitleCase;
import static proyecto.interfaces.windowMain.authorHash;
import proyecto.interfaces.windowResumeDetails;
import proyecto.interfaces.windowSearchByAuthors;
import static proyecto.interfaces.windowSearchByAuthors.authorsComboBox;
import static proyecto.interfaces.windowSearchByAuthors.fail_select;
import static proyecto.interfaces.windowSearchByAuthors.resumeFoundList;


/**
 * Esta clase define las funciones necesarias para el registro de los autores almacenadas en cada resumen y su busqueda.
 * @author Haidar Bazzi
 * @version: 25/03/2023
 */
public class searchByAuthor {
     
    /**
     * Metodo que permite que se visualicen las opciones (autores) en el JComboBox para elegir
     */
    public static void show_options(){
        authorsComboBox.removeAllItems();
        for (int i = 0; i <authorHash.getCapacity(); i++){
            if(authorHash.getVal()[i] != null){
                Nodo x = (Nodo) authorHash.getVal()[i];
                authorsComboBox.addItem(convertToTitleCase(x.getKey()));
            }
        }
        authorsComboBox.addActionListener(authorsComboBox);
    }
    
    
    public void hide(){
        fail_select.setVisible(false);
        resumeFoundList.setVisible(false);
    }
    /**
     * Metodo utilizado para visualizar los detalles del resumen seleccionado.
     * @param title El titulo del resumen seleccionado.
     * @param sumHash El HashTable que contiene los resumenes registrados.
     */
    public static void make_details_visible(String title, Hash sumHash){
        Summary sum =(Summary) uploadSummary.search_sum(title.trim(), sumHash);
        
        windowResumeDetails.summary_title.setText(uploadSummary.capitalize(sum.getTitle()));
        windowResumeDetails.summary_authors.setText(uploadSummary.array_readable(sum.getAuthors()));
        windowResumeDetails.summary_keyw.setText(uploadSummary.array_readable(sum.getKeyw()));
        windowResumeDetails.summary_body.setText(sum.getBody());
    }

    /**
     * Metodo para  mostrar las opciones en la JList para que el usuario pueda escoger el resumen
     * @param authorHash HashTable de los resumenes
     * @param sumHash HashTable con los resumenes
     */
    public static void set_options(Hash authorHash, Hash sumHash){
       String key = windowSearchByAuthors.selectedAuthor;
        String titles = get_titles(authorHash, key, sumHash);
        if(!titles.isEmpty()){
            windowSearchByAuthors.resumeFoundList.setVisible(true);
            windowSearchByAuthors.LabelAuthor.setText("Investigaciones de " + windowSearchByAuthors.selectedAuthor + ": ");
            windowSearchByAuthors.resumeFoundList.setListData(titles.split(","));
        }
    }
    
    /**
     * Metodo para obtener los titulos de los resumenes.
     * @param authorHash HashTable de los autores.
     * @param author El nombre del autor.
     * @param sumHash HashTable principal con los resumenes.
     * @return La cadena que contiene los titulos.
     */
    public static String get_titles(Hash authorHash, String author, Hash sumHash){
        Object[] result = search_exists(authorHash, author);
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
     * Metodo para insertar un nuevo autor en el HashTable de los autores.
     * @param sumHash HashTable de los resumenes.
     * @param authorHash HashTable que almacena los autores.
     * @param newSum El resumen nuevo que se esta anadiendo al sistema.
     */
    public static void insert_new(Hash sumHash, Hash authorHash, Summary newSum){
        String[] authors = newSum.getAuthors();
        for(String author: authors){
            int in = search_in(newSum.getTitle(), sumHash);
            insert_key_author(authorHash, author, in);
        }
    }
    
    /**
     * Metodo para obtener el entero correspondiente a la llave en la que se transformo la cadena con la funcion Hash.
     * @param key La cadena correspondiente a la llave buscada en la HashTable.
     * @param hash El HashTable que almacena el objeto correspondiente a la llave.
     * @return El entero correspondiente a la llave.
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
     * Metodo para crear un HashTable de autores.
     * @param sumH El HashTable de los resumenes.
     * @return El HashTable de autores creado.
     */
    public static Hash create_hash(Hash sumH){
        int capacity = uploadSummary.get_capacity((sumH.getCapacity()*5));
        Hash keyHash = new Hash(capacity);
        for(int i=0; i<sumH.getCapacity();i++){
            Summary aux = (Summary) sumH.getVal()[i];
            if(aux!=null){
                String[] authors = aux.getAuthors();
                for(String author : authors){
                    insert_key_author(keyHash, author, i);
                }
            }
        }
        
        return keyHash;
    }
    
    /**
     * Metodo para verificar si esta registrado un autor en el sistema.
     * @param authorHash El HashTable de los autores.
     * @param authorKey El Nombre del autor que se utiliza como key en el HashTable.
     * @return arreglo de Objetos que contiene el valor logico indicando si existe o no el autor.
     */
    public static Object[] search_exists(Hash authorHash, String authorKey){
        authorKey = uploadSummary.replace_accents(authorKey);
        Object[] result= new Object[2];
        result[0]=false;
        for(int i=0; i<authorHash.getCapacity();i++){
            Nodo aux = (Nodo) authorHash.getVal()[i];
            if(aux!=null){
                String name = uploadSummary.replace_accents(aux.getKey());
                if(name.equalsIgnoreCase(authorKey)){
                    result[0]=true;
                    result[1]=aux;
                }
            }
        }
        return result;
    }
    
    /**
     * Metodo para insertar las llaves que corresponden a los resumenes de un autor en su Nodo correspondiente en el HashTable de autores.
     * @param authorHash El HashTable de autores
     * @param author El nombre del autor
     * @param in 
     */
    public static void insert_key_author(Hash authorHash, String author, int in){
        Object[] result = search_exists(authorHash,author);
        boolean exists = (boolean) result[0];
        Nodo node;
        if(!exists){
            node = new Nodo(author);
            node.setIndex(String.valueOf(in)); 
            authorHash.insert(author, node);
        }else{
            node= (Nodo) result[1];
            node.setIndex(String.valueOf(in));
        }
    }
}
