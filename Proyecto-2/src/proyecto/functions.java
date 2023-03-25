/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 * Esta clase define funciones utiles para distintas instancias del proyecto
 * @author andre
 * @version 25/03/2023
 */
public class functions {
    
    /**
     * Metodo para obtener la cadena necesaria para imprimir los contenidos del HashTable
     * @param hash El HashTable que desea imprimirse
     * @return La cadena correspondiente a los contenidos del HashTable.
     */
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
    
    /**
     * Metodo para buscar un resumen en el sistema.
     * @param key Es la cadena (titulo del resumen) que corresponde a la llave en donde se almacena el resumen en el hash.
     * @param hash Es el HashTable en el que se buscara el resumen.
     * @return El resumen hallado.
     */
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
