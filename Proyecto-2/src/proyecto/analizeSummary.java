/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import java.awt.Color;
import java.awt.Font;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JLabel;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import proyecto.interfaces.windowAnalyzeResume;

/**
 * Esta clase define las funciones necesarias para analizar un resumen registrado en el sistema
 * @author andre
 * @version 25/03/2023
 */
public class analizeSummary {
    
    /**
     * Metodo para mostrar todos los elementos de la ventana cuando el usuario selecciona un resumen
     * @param sum El resumen que se desea analizar
     */
    public static void visualize(Summary sum){
        windowAnalyzeResume.sel_title.setVisible(true);
        windowAnalyzeResume.sel_title.setText(uploadSummary.capitalize(sum.getTitle()));
        windowAnalyzeResume.jLabel3.setVisible(true);
        windowAnalyzeResume.sel_authors.setText(uploadSummary.array_readable(sum.getAuthors()));
        windowAnalyzeResume.jLabel4.setVisible(true);
        windowAnalyzeResume.jLabel5.setVisible(true);
        
    }
    
    /**
     * Metodo para analizar el resumen seleccionado utilizando un Hash Table
     * @param sum El resumen que se desea analizar
     */
    public static void analyze_summary(Summary sum){
        visualize(sum);
        String[] keyWords = sum.getKeyw();
        Hash hash = new Hash(uploadSummary.get_capacity(keyWords.length));
        for (String keyWord : keyWords) {
            Object[] el = new Object[2];
            el[0]= keyWord;
            el[1]= calculate_frequency(keyWord, sum);
            hash.insert(keyWord, el); 
        } 
        tabulate(hash, sum);
    }
    /**
     * Metodo para esconder elementos de la ventana de analizar resumen
     */
    public static void hide(){
        windowAnalyzeResume.problem.setVisible(false);
        windowAnalyzeResume.jLabel5.setVisible(false);
        windowAnalyzeResume.jLabel3.setVisible(false);
        windowAnalyzeResume.jLabel4.setVisible(false);
        windowAnalyzeResume.jScrollPane3.setVisible(false);
    }
    
    /**
     * Metodo para obtener todos los titulos de los resumenes cargados 
     * @param hash - Hash Table de resumenes
     * @return arreglo con todos los titulos de los resumenes
     */
    public static String[] get_options(Hash hash){
        String t ="";
        Summary aux;
        for(int i=0;i<hash.getCapacity();i++){
            if(hash.getVal()[i]!= null){
                aux=(Summary)hash.getVal()[i];
                t+= aux.getTitle()+",";
            }
        } 
        return make_readable(t);
    }
    
    /**
     * Metodo para colocar en mayusculas todos los elementos de un string con los elementos separados por comas
     * @param s
     * @return arreglo con todos los titulos de los resumenes
     */
    public static String[] make_readable(String s){
        String[] content = s.split(",");
        for(int i=0; i<content.length;i++){
            String cap="";
            String[] Cs = content[i].split(" ");
            for(int j=0;j<Cs.length;j++){
                cap+= Cs[j].substring(0,1).toUpperCase() + Cs[j].substring(1).toLowerCase()+" ";
                
            }
            content[i]=cap;
        } 
        Arrays.sort(content);
        return content;
    }
    
    /**
     * Metodo para crear una JTable con la informacion de las palabras claves y sus frecuencias
     * @param hash - Hash table que contiene las palabras claves y sus frecuencias
     * @param sum - el resumen seleccionado
     */
    public static void tabulate(Hash hash, Summary sum){
        
        String[] column = {"Palabra Clave", "Frecuencia"};
        String[] keys = sum.getKeyw();
        String[][] row = new String[keys.length][2];
        for(int i=0; i<keys.length;i++){
            int f = search(hash, keys[i]);
            row[i][0]=uploadSummary.capitalize(keys[i]);
            row[i][1]=String.valueOf(f);
        }
        DefaultTableModel model = new DefaultTableModel(row, column);
        windowAnalyzeResume.table.setModel(model);
        windowAnalyzeResume.table.getTableHeader().setFont(new Font("Trebuchet MS", Font.BOLD, 14));
        windowAnalyzeResume.table.getTableHeader().setBackground(new Color(43,47,181));
        windowAnalyzeResume.table.getTableHeader().setForeground(Color.white);
        DefaultTableCellRenderer center = new DefaultTableCellRenderer();
        center.setHorizontalAlignment(JLabel.CENTER);
        for(int i=0;i<2;i++){
            windowAnalyzeResume.table.getColumnModel().getColumn(i).setCellRenderer(center);
        }
        windowAnalyzeResume.jScrollPane3.setVisible(true);
       
    }
    
    /**
     * Metodo para buscar la frequencia de cada palabra clave
     * @param hash - Hash table de frecuencia
     * @param key - palabra clave a buscar
     * @return 
     */
    public static int search(Hash hash, String key){
        int in = hash.sfold(key, hash.getCapacity());
        Object[] val = hash.getVal();
        int f  = 0;
        for(int i=0;i<val.length;i++){
            Object[] found =(Object[]) val[i];
            if(found!=null){
            if(found[0].equals(key)){
                f=(int) found[1];
            }
            }
        }
        
        return f;
    }
    
    /**
     * Metodo para encontrar la frecuencia en la que aparece la palabra clave en el resumen
     * @param key - Palabra clave
     * @param sum - Resumen seleccionado
     * @return el numero de frecuencia con la que aparece la palabra clave
     */
    
    public static int calculate_frequency(String key, Summary sum){
        String body = sum.getBody().toLowerCase();
        int count =0;
        Pattern p = Pattern.compile(key);
        Matcher m = p.matcher(body);
        while (m.find()){
            count +=1;
        }
        return count;
    }
    
}
