/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author andre
 */
public class functions {
    
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
    
    public Summary search(String key, Hash hash){
        Summary found = null;
        int in = hash.sfold(key, hash.getCapacity());
        Summary aux = (Summary) hash.getVal()[in];
        if(aux.getTitle().equals(key)){
            found = (Summary) hash.getVal()[in];
        }else{
            int i =1;
            int k=in;
            while(i<hash.getCapacity()){
                k = (in + (i*i)) % hash.getCapacity();
                i++;
                aux=(Summary) hash.getVal()[k];
                    if(aux.getTitle().equals(key)){
                        found = (Summary) hash.getVal()[k];
                    }
            }
        }
        
        return found;
    }
    
}
