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
 *
 * @author andre
 */
public class uploadSummary {
    
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
    
    public static int get_capacity(int len){
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
    }
    
   public static File[] get_directory(){
       File file = new File("C:\\Users\\andre\\OneDrive\\Desktop\\uni stuff\\Estructuras\\Proyecto-2\\Proyecto-2\\initialize");
       File f_list[] = null;
       if(!file.exists()){
           file.mkdirs();
       }else{
           f_list= file.listFiles();
       }
       return f_list;
   }
    
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
   
   public static void add_summary(Hash hash, Summary sum, File file){
       hash.insert(sum.getTitle(), sum);
       save_file(file, hash.getSize()); 
   }
   
    public static Object[] load_summary(Hash hash, File file){
        Object[] result = new Object[2];
        if(file!=null){
            String read = read_txt(file);
            String[] content = check_txt(read);
            if(content!=null){
                  Summary newSum = create_summary(content);
                  make_visible(newSum);
                  if(!check_if_loaded(newSum, hash)){
                      result[0]=true;
                      result[1]=newSum;
                  } else{
                      windowAddResume.fail_message.setVisible(true);
                      windowAddResume.fail_message.setText("Resumen ya disponible en el sistema");
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
    public static String capitalize(String s){
        String[] split = s.split(" ");
        String print ="";
        for(String word : split){
            print+= word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase()+" ";
        }
        return print;
    }
    
    public static void save_file(File attached, int num){
        String f_name = "sum"+String.valueOf(num)+".txt";
        File copy = new File("C:\\Users\\andre\\OneDrive\\Desktop\\uni stuff\\Estructuras\\Proyecto-2\\Proyecto-2\\initialize\\"+f_name);
         try {
             FileInputStream in = new FileInputStream(attached);
             FileOutputStream out = new FileOutputStream(copy);
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
        
    public static String replace_accents(String s){
       String normalizedWord = Normalizer.normalize(s, Normalizer.Form.NFD);
       s = normalizedWord.replaceAll("\\p{M}", "");
       return s;
    }
    
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
                        body = aux;
                    }
                }
                if(!authors.isEmpty()&&!body.isEmpty()&&!keyW.isEmpty()){
                    content= new String[4];
                    content[0]=title;
                    content[1]=authors.replace("autores,", "");
                    content[2]=body;
                    content[3]=keyW;
                }
                
            }
             
        }
        return content;
    }
    
    public static boolean check_if_loaded(Summary sum, Hash hash){
        Summary match = search(sum.getTitle(), hash);
        if(match!=null){
            return Arrays.equals(match.getAuthors(), sum.getAuthors());
        }else{
            return false;
        }
    }
    
    public static boolean check_if_writing(String s){
        String reg= "[^a-zA-Z0-9]+";
        String regex="[0-9]+";
        Pattern p = Pattern.compile(reg);
        Pattern pC = Pattern.compile(regex);
        Matcher m = p.matcher(s);
        Matcher mC = pC.matcher(s);
        
        return !m.matches() && !mC.matches();
        
    }
    
    public static String print_hashS(Hash hash){
        String toPrint="";
        for (int i=0; i<hash.getCapacity();i++){
            if(hash.getVal()[i]!=null){
            Summary sum= (Summary)hash.getVal()[i];
            toPrint+=sum.print()+"\n";
            }
        }
        return toPrint;
    }
    
    public static Summary search(String key, Hash hash){
        Summary found = null;
        if(!hash.isEmpty()){
            int in = hash.sfold(key.toLowerCase(), hash.getCapacity());
            Summary aux = (Summary) hash.getVal()[in];
            if(aux!=null){
            if(aux.getTitle().equals(key.toLowerCase())){
                found = (Summary) hash.getVal()[in];
            }}else{
                int i =1;
                int k=in;
                while(i<hash.getCapacity()){
                    k = (in + (i*i)) % hash.getCapacity();
                    i++;
                    aux=(Summary) hash.getVal()[k];
                    if(aux!=null){
                        if(aux.getTitle().equals(key.toLowerCase())){
                            found = (Summary) hash.getVal()[k];
                        }
                }
            }
        }
 
    }
    return found;
    }
}
