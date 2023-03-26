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
    
    //Campos de la clase
    private final int capacity;
    private int size;
    private final Object[] val;

    
     /**
     * Constructor para la clase Hash
     * @param capacity - Tamaño de la Hash Table
     */
    public Hash(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.val = new Object[capacity];
    } //Cierre del constructor
    
    /**
     * Método para insertar un nuevo elemento en la Hash Table
     * @param key - la llave del elemento
     * @param value - el valor a guardar
     */
    public void insert(String key, Object value){
        if(getSize()<getCapacity()){
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
    }
    
    /**
     * Método de hashing para los elementos que se van a guardar en la tabla, basado en string folding
     * @param s - llave del elemento
     * @param M - capacidad de la Hash table
     * @return el indice que corresponde a la llave en la Hash Table
     */
    
    public int sfold(String s, int M){
        long sum = 0, mul = 1;
        for (int i = 0; i < s.length(); i++) {
          mul = (i % 4 == 0) ? 1 : mul * 256;
          sum += s.charAt(i) * mul;
        }
        return (int)(Math.abs(sum) % M);
    }

    /**
     * @return el numero maximo de elementos que puede entrar en la Hash Table
     */
    public int getCapacity() {
        return capacity;
    }

    /**
     * @return el numero de elementos guardados en el elemento
     */
    public int getSize() {
        return size;
    }

    /**
     * @return el arreglo que contiene todos los elementos de la Hash Table
     */
    public Object[] getVal() {
        return val;
    }
    /**
     * Metodo para revisar si la Hash Table esta vacia
     * @return booleano correspondiente
     */
    public boolean isEmpty(){
        return size==0;
    }
    
} //Cierre de la clase
