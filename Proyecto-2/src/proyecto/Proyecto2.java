/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto;

/**
 *
 * @author andre
 */
public class Proyecto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Hash hash = uploadSummary.create_hash();
        uploadSummary.load_summary(hash);
        System.out.println(uploadSummary.print_hashS(hash));
        System.out.println(hash.getCapacity());
        
    }
    
}
