/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 * Clase que define los resumenes que se almacenaran en el sistema
 * @author andre 
 * @version 25/03/2023
 */
public class Summary {
    
    //Campos de la clase
    private String title;
    private String[] authors;
    private String body;
    private String[] keyw;

    /**
     * Constructor de la clase
     */
    public Summary() {
        this.title = "";
        this.authors = null;
        this.body = "";
        this.keyw = null;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the authors
     */
    public String[] getAuthors() {
        return authors;
    }

    /**
     * @param authors the authors to set
     */
    public void setAuthors(String[] authors) {
        this.authors = authors;
    }

    /**
     * @return the body
     */
    public String getBody() {
        return body;
    }

    /**
     * @param body the body to set
     */
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * @return the keyw
     */
    public String[] getKeyw() {
        return keyw;
    }

    /**
     * @param keyw the keyw to set
     */
    public void setKeyw(String[] keyw) {
        this.keyw = keyw;
    }
    
    
}
