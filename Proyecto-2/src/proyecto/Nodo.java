/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author andre
 */
public class Nodo {
    
    private String key;
    private String index;

    public Nodo(String key) {
        this.key = key;
        this.index = "";
    }

    /**
     * @return the key
     */
    public String getKey() {
        return key;
    }

    /**
     * @return the index
     */
    public String getIndex() {
        return index;
    }

    /**
     * @param index the index to set
     */
    public void setIndex(String index) {
        this.index += index+",";
    }
    
    
    
    
    
    
}
