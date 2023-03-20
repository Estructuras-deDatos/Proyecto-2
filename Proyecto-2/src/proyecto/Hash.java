/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 * Esta clase define métodos y atributos del HashTable. 
 * @author: andre
 * @version: 22/03/2023
 */
public class Hash {
    
    
    private final int capacity;
    private int size;
    private final Object[] val;

    
     /**
     * Constructor para la clase Hash
     */
    public Hash(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.val = new Object[capacity];
    } //Cierre del constructor
    
    
    public void insert(String key, Object value){
        int in = sfold(key, getCapacity());
        if (getVal()[in]==null){
            getVal()[in]=value;
        }else{
            int i =1;
            int k=in;
            while(getVal()[k]!=null){
                k = (in + (i*i)) % getCapacity();
                i++;
            }
            if(getVal()[k]==null){
               getVal()[k]=value;
            }
        }
        size++;
    }
    
    public int sfold(String s, int M){
        long sum = 0, mul = 1;
        for (int i = 0; i < s.length(); i++) {
          mul = (i % 4 == 0) ? 1 : mul * 256;
          sum += s.charAt(i) * mul;
        }
        return (int)(Math.abs(sum) % M);
    }

    /**
     * @return the capacity
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @return the val
     */
    public Object[] getVal() {
        return val;
    }
    
    public boolean isEmpty(){
        return size==0;
    }
    
} //Cierre de la clase
