/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.text.Normalizer;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import proyecto.interfaces.windowAddResume;

/**
 * Esta clase define los métodos necesarios para cargar un txt con un resumen específico. 
 * @author: andre
 * @version: 22/03/2023
 */
public class uploadSummary {
    
   /**
    * Metodo para crear el HashTable que contiene los resumenes
    * @return El HashTable creado
    */
   public static Hash create_hash(){
        
        File[] f_list = get_directory();
        
        if(f_list!=null){
            int capacity = get_capacity(f_list.length);
            Hash hash = new Hash(capacity);
            for(File f : f_list){
                String read = read_txt(f);
                String[] content = check_txt(read);
                Summary newSum = create_summary(content);
                hash.insert(newSum.getTitle(), newSum);
  
            }
            return hash;
        }
        else{
            return new Hash(7);
        }
           
    }
   /**
    * Metodo para obtener el siguiente numero primo correspondiente al numero dado
    * @param len - numero base 
    * @return siguiente numero primo
    */
    public static int get_capacity(int len){
        if(len!=0){
        int size = (int) (len*2.5);
        size++;
        for (int i = 2; i < size; i++) {
         if(size%i == 0) {
            size++;
            i=2;
         } else {
         }
        }
        return size;
        }else{
            return 11;
        }
    }
    
    /**
     * Metodo para obtener los archivos de la carpeta de archivos precargados del sistema
     * @return Arreglo de archivos que se encuentran en el directorio
     */
    
   public static File[] get_directory(){
       String OS = System.getProperty("os.name").toLowerCase();
       File file=null;
       if(OS.contains("win")){
                String dir = System.getProperty("user.dir");
                file = new File(dir+"\\initialize");
       }else{
          if(OS.contains("mac")||OS.contains("nux")){
              String dir = System.getProperty("user.dir");
              file = new File(dir+"//initialize");
          }
       }
       File f_list[] = null;
       if(file!=null){
       if(!file.exists()){
           file.mkdirs();
       }else{
           f_list= file.listFiles();
       }}
       return f_list;
   }
    
   /**
    * Metodo para revisar si el archivo dado es valido
    * @param file
    * @return Objeto resumen creado a partir del texto
    */
   public static Summary validate_txt(File file){
       if(file!=null){
           String read = read_txt(file);
           String[] content = check_txt(read);
           if(content!=null){
               Summary newSum = create_summary(content);
               return newSum;
           }else{
               return null;
           }
       }
       return null;
   }
   /**
    * Metodo para mostrar los detalles del resumen que se quiere cargar en el sistema
    * @param newSum 
    */
   public static void make_visible(Summary newSum){
       windowAddResume.fail_message.setVisible(false);
       windowAddResume.jLabel5.setVisible(true);
       windowAddResume.jLabel6.setVisible(true);
       windowAddResume.Resumen.setVisible(true);
       windowAddResume.summary_title.setVisible(true);
       windowAddResume.summary_title.setText(capitalize(newSum.getTitle()));
       windowAddResume.summary_keyw.setText(array_readable(newSum.getKeyw()));
       windowAddResume.summary_authors.setText(array_readable(newSum.getAuthors()));
       windowAddResume.summary_authors.setVisible(true);
       windowAddResume.summary_body.setVisible(true);
       windowAddResume.jScrollPane3.setVisible(true);
       windowAddResume.summary_body.setText(newSum.getBody());
       windowAddResume.confirm_message.setVisible(true);
   }
   /**
    * Metodo para esconder componentes de la interfaz grafica
    */
   public static void hide(){
       windowAddResume.summary_title.setVisible(false);
        windowAddResume.jLabel5.setVisible(false);
        windowAddResume.jLabel6.setVisible(false);
        windowAddResume.Resumen.setVisible(false);
        windowAddResume.jScrollPane3.setVisible(false);
        windowAddResume.summary_authors.setText("");
        windowAddResume.confirm.setVisible(false);
        windowAddResume.confirm_message.setVisible(false);
        windowAddResume.summary_keyw.setText("");
        windowAddResume.summary_body.setText("");
   }
   
   /**
    * Metodo para agregar un nuevo resumen a la Hash Table y guardar el archivo en el directorio de precargados
    * @param hash
    * @param sum
    * @param file 
    */
   public static void add_summary(Hash hash, Summary sum, File file){
       hash.insert(sum.getTitle(), sum);
       save_file(file, hash.getSize()); 
   }
   /**
    * Metodo para cargar un nuevo resumen a la Hash Table
    * @param hash
    * @param file
    * @return arreglo con un booleano y el objeto de resumen 
    */
    public static Object[] load_summary(Hash hash, File file){
        Object[] result = new Object[2];
        if(file!=null){
            String read = read_txt(file);
            String[] content = check_txt(read);
            if(content!=null){
                  Summary newSum = create_summary(content);
                  make_visible(newSum);
                  if(hash.getSize()<hash.getCapacity()){
                  if(!check_if_loaded(newSum, hash)){
                      result[0]=true;
                      result[1]=newSum;
                  } else{
                      windowAddResume.fail_message.setVisible(true);
                      windowAddResume.fail_message.setText("Resumen ya disponible en el sistema");
                      result[0]=false;
                  }}
                  else{
                      windowAddResume.fail_message.setVisible(true);
                      windowAddResume.fail_message.setText("Almacenamiento del Sistema Lleno");
                      result[0]=false;
                  }
            }else{
                windowAddResume.fail_message.setVisible(true);
                windowAddResume.fail_message.setText("Archivo Invalido");
                result[0]=false;
            }
        }else{
           result[0]=false;
        }
        return result;
    }
    /**
     * Metodo para hacer mayuscula todos los elementos de un arreglo
     * @param array
     * @return String con todas los elementos de un arreglo en mayusculas
     */
    public static String array_readable(String[] array){
        String printable="";
        for(String word:array){
            String[] w = word.split(" ");
            for (String l : w){
                printable+=l.substring(0,1).toUpperCase() + l.substring(1).toLowerCase()+" ";
            }
            printable+= "\n";
        } 
        return printable;
    }
    /**
     * Metodo para hacer un string en mayusculas como un titulo
     * @param s
     * @return 
     */
    public static String capitalize(String s){
        String[] split = s.split(" ");
        String print ="";
        for(String word : split){
            print+= word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase()+" ";
        }
        return print;
    }
    /**
     * Metodo para guardar el archivo dado en la carpeta de archivos precargados
     * @param attached
     * @param num 
     */
    public static void save_file(File attached, int num){
        String f_name = "sum"+String.valueOf(num)+".txt";
        String dir = System.getProperty("user.dir");
        String OS = System.getProperty("os.name").toLowerCase();
        File file=null;
        if(OS.contains("win")){
               file = new File(dir+"\\initialize\\"+f_name);
        }else{
          if(OS.contains("mac")||OS.contains("nux")){
              file = new File(dir+"//initialize//"+f_name);
          }
       }
        File f_list[] = null;
         try {
             FileInputStream in = new FileInputStream(attached);
             FileOutputStream out = new FileOutputStream(file);
             int n;
             while((n=in.read())!=-1){
                 out.write(n);
             }
             if(in!=null){
                 in.close();
             }
             if (out != null) {
                out.close();
            }
         } 
         catch (FileNotFoundException ex) {
             Logger.getLogger(uploadSummary.class.getName()).log(Level.SEVERE, null, ex);
         } catch (IOException ex) {
             Logger.getLogger(uploadSummary.class.getName()).log(Level.SEVERE, null, ex);
         }
        
        
    }
    
    /**
     * Metodo para adjuntar un archivo para cargar el archivo
     * @return 
     */
    public static File attach_file(){
        JFileChooser chooser = new JFileChooser();
        File file=null;
        try{
        if(chooser.showOpenDialog(null)==JFileChooser.APPROVE_OPTION){
            file=chooser.getSelectedFile();
        }
        else{
            windowAddResume.fail_message.setText("Seleccione un archivo");
            
        }}
        catch(Exception e){
           windowAddResume.fail_message.setText("Error adjuntando archivo");
        }
        return file;
    }
    
    /**
     * Metodo para leer el archivo que contiene la nueva informacion
     * @param file
     * @return un String con toda la informacion del archivo
     */
    public static String read_txt(File file){
        String read = "";
        String line;
        try{
        if(!file.exists()){
                file.createNewFile();
            }
            else{
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                while((line=br.readLine())!=null){
                    if(!line.isEmpty()){
                        read+=line+"\n";}
                }
            }
        }catch(Exception e){
                JOptionPane.showMessageDialog(null, "FAIL");
                }
         return read;
        }
        
    /**
     * Metodo para reemplazar los acentos de las palabras
     * @param s
     * @return String con los arreglos hechos
     */
    public static String replace_accents(String s){
       String normalizedWord = Normalizer.normalize(s, Normalizer.Form.NFD);
       s = normalizedWord.replaceAll("\\p{M}", "");
       return s;
    }
    /**
     * Metodo para crear un objeto resumen
     * @param content
     * @return Objeto Resumen
     */
    public static Summary create_summary(String[] content){
      Summary newSum = new Summary();
      String[] authors = content[1].split(",");
      for (int i=0; i<authors.length;i++){
          authors[i]=authors[i].trim();
      }
      String[] keyW = content[3].split(",");
      for (int i=0; i<keyW.length;i++){
          keyW[i]=keyW[i].trim();
      }
      newSum.setTitle(content[0]);
      newSum.setAuthors(authors);
      newSum.setBody(content[2]);
      newSum.setKeyw(keyW);
      
      return newSum;
    }
    /**
     * Metodo para revisar que el texto en el archivo corresponde a un resumen valido
     * @param s
     * @return arreglo de Strings que contiene todos los elementos 
     */
    public static String[] check_txt(String s){
        String[] content = null;
        if(!s.isEmpty()){
            String[] split_lines = s.split("\n");
            if(check_if_writing(split_lines[0])){
                String title = split_lines[0].toLowerCase();
                int opt = 0;
                String authors="";
                String body=" ",keyW=" ";
                for(int i=1; i<split_lines.length;i++){
                    String aux = split_lines[i].toLowerCase();
                    if(aux.contains("palabras claves")){
                        opt=3;
                        keyW=aux.replace("palabras claves", "");
                        keyW=keyW.replace(":", "");
                    }
                    if(aux.contains("autores")){
                        opt=1;
                    }
                    if(aux.contains("resumen")){
                        opt=2;
                    }
                    if (opt==1){
                        authors+=aux+",";
                    }
                    
                    if(opt==2){
                        body = split_lines[i];
                    }
                }
                authors=authors.replace("autores,", "");
                body=body.replace("resumen", "");
                if(!authors.isEmpty()&&!body.isEmpty()&&!keyW.isEmpty()){
                    content= new String[4];
                    content[0]=title;
                    content[1]=authors;
                    content[2]=body;
                    content[3]=keyW;
                }
                
            }
             
        }
        return content;
    }
    /**
     * Metodo para revisar si existe un archivo con el mismo titulo y autores 
     * @param sum
     * @param hash
     * @return booleano correspondiente
     */
    public static boolean check_if_loaded(Summary sum, Hash hash){
        Summary match = search_sum(sum.getTitle(), hash);
        if(match!=null){
            return Arrays.equals(match.getAuthors(), sum.getAuthors());
        }else{
            return false;
        }
    }
    /**
     * Revisa si un archivo tiene informacion valida
     * @param s
     * @return booleano si cumple con la condicion
     */
    
    public static boolean check_if_writing(String s){
        String reg= "[^a-zA-Z0-9]+";
        String regex="[0-9]+";
        Pattern p = Pattern.compile(reg);
        Pattern pC = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        Matcher mC = pC.matcher(s);
        
        return !m.matches() && !mC.matches();
        
    }
    
    /**
     * Metodo para buscar un resumen a partir de la llave dada
     * @param key
     * @param hash
     * @return el objeto resumen que corresponde
     */
    public static Summary search_sum(String key, Hash hash){
        Summary found = null;
        if(!hash.isEmpty()){
            int in = hash.sfold(key.toLowerCase(), hash.getCapacity());
            Summary aux = (Summary) hash.getVal()[in];
            if(aux!=null){
                if(aux.getTitle().equalsIgnoreCase(key.toLowerCase())){
                    found = (Summary) hash.getVal()[in];
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
                                found = (Summary) hash.getVal()[k];
                            }
                        }
                    }
                }       
 
        }
    }
    return found;
    }
} //Cierre de la clase
