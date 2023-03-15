/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto;

/**
 *
 * @author andre
 */
public class Summary {
    
    private String title;
    private String[] authors;
    private String body;
    private String[] keyw;

    public Summary(String title, String[] authors, String body, String[] keyw) {
        this.title = title;
        this.authors = authors;
        this.body = body;
        this.keyw = keyw;
    }

    public String print(){
        String toPrint=getTitle()+"\n";
        for(int i =0;i<getAuthors().length;i++){
            toPrint+=getAuthors()[i]+"\n";
        }
        return toPrint;
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
