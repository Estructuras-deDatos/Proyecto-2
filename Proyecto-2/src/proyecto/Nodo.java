/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 * Esta clase, define funciones y atributos necesarios para el uso del Nodo de la estructura.
 * @author: andre
 * @version: 22/03/2023
 */
public class Nodo {
    
    //Campos de la Clase
    private String key;
    private String index;

    /**
    * Constructor para la clase Nodo
    */
    public Nodo(String key) {
        this.key = key;
        this.index = "";
    } //Cierre del constructor

    /**
     * Metodo para obtener la llave que le corresponde a cada Nodo
     * @return the key
     */
    public String getKey() {
        return key;
    } //Cierre del la función

    /**
     * Metodo para obtener los indices de la Hash Table original que corresponden a la llave
     * @return the index
     */
    public String getIndex() {
        return index;
    } //Cierre del la función

    /**
     * Metodo para agregar un nuevo indice al nodo
     * @param index the index to set
     */
    public void setIndex(String index) {
        this.index += index+",";
    } //Cierre del la función

    
} //Cierre de la clase
