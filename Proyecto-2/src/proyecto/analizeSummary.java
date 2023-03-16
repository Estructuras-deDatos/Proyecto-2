/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFrame;
import javax.swing.JTable;

/**
 *
 * @author andre
 */
public class analizeSummary {
    
    public static void analyze_summary(Summary sum){
        String[] keyWords = sum.getKeyw();
        Hash hash = new Hash(uploadSummary.get_capacity(keyWords.length));
        for (String keyWord : keyWords) {
            Object[] el = new Object[2];
            el[0]= keyWord;
            el[1]= calculate_frequency(keyWord, sum);
            hash.insert(keyWord, el); 
        } 
        JTable table = tabulate(hash, sum);
        JFrame jFrame = new JFrame();
        jFrame.add(table);
        jFrame.setSize(350, 300);
        jFrame.setVisible(true);
        
    }
    
    public static JTable tabulate(Hash hash, Summary sum){
        
        String[] column = {"Key Word", "Frequency"};
        String[] keys = sum.getKeyw();
        String[][] row = new String[keys.length][2];
        for(int i=0; i<keys.length;i++){
            int f = search(hash, keys[i]);
            row[i][0]=keys[i];
            row[i][1]=String.valueOf(f);
        }
                
        return new JTable(row, column);
    }
    
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
