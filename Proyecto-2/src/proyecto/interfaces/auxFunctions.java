package proyecto.interfaces;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * Esta clase define los métodos empleados dentro de la interfaz gráfica del programa. 
 * @author: beatrizcardozo
 * @version: 17/03/2023
 */

public class auxFunctions {
    
//    /**
//     * Método que genera un arreglo de Strings con los nombres de los almacenes existentes.
//     * @return Arreglo de Strings que consta de los identificadores de los almacenes.
//     */
//    public String [] arrayWarehouseNames(){
//        String[] names = new String[windowMain.grafo.getList().getSize()];
//        Nodo temporal = windowMain.grafo.getList().getpFirst();
//        for (int i = 0; i < windowMain.grafo.getList().getSize(); i++) {
//            names[i] = (String)temporal.getData();
//            temporal = temporal.getNext();
//        }
//        return names;
//    } //Cierre del método
    
    /**
     * Método que valida que los caracteres que el usuario puede ingresar en un determinado JTextField sean letras. 
     * @param evt El parámetro evt contiene la información del evento llevado a cabo por el usuario.
     * * @param txtField El parámetro txtField define un objeto JTextField.
     * * @param caracters El parámetro caracters define un Integer que condiciona la cantidad de caracteres a ingresar.
     */
    public static void verifyString(java.awt.event.KeyEvent evt, JTextField txtField, int caracters){
        int key = evt.getKeyChar();
        boolean capletters = key >= 65 && key <= 90;
        boolean lowerletters = key >= 97 && key <= 122;
        boolean space = key == 32;
         if (!(lowerletters || capletters || space)){
            evt.consume();}
         
        if (txtField.getText().trim().length() == caracters) {
            evt.consume();
        }
    } //Cierre del método
    
    
    /**
     * Método que valida que los caracteres que el usuario puede ingresar en un determinado JTextField sean números. 
     * @param evt El parámetro evt contiene la información del evento llevado a cabo por el usuario.
     * * @param txtField El parámetro txtField define un objeto JTextField.
     * * @param caracters El parámetro caracters define un Integer que condiciona la cantidad de caracteres a ingresar.
     */
    public static void verifyInt(java.awt.event.KeyEvent evt, JTextField txtField, int caracters){
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if (!numeros){
            evt.consume();
        }
        if (txtField.getText().trim().length() == caracters) {
            evt.consume();
        }
    } //Cierre del método
    
   
    
    /**
     * Método que devuelve un String con la primera letra en mayúscula. 
     * @param str El parámetro str define el String que cambiara su primer carácter a mayúscula.
     * @return El String modificado con su primer caracter en mayúscula
     */
    public static String UpperFirstLetter(String str){
        String res = str.substring(0, 1).toUpperCase() + str.substring(1); 
        return res;
    } //Cierre del método
    
    
    /**
     * Método que modifica un label, según lo ingresado en un JTextField. 
     * @param txtfield El parámetro txtfield define el campo de texto del que se toman los caracteres.
     * @param label El parámetro label define el JLabel a modificar.
     */
    public static void textFieldDidChange(JTextField txtfield, JLabel label) {
        label.setText(txtfield.getText());
    } //Cierre del método
    
    
    /**
     * Método que modifica un label según el elemento seleccionado en un jComboBox. 
     * @param comboBox El parámetro comboBox define del JComboBox del que se tomara el elemento seleccionado.
     * @param label El parámetro label define el JLabel del que se modificará el texto.
     * @param txtArea El parámetro txtArea define donde se imprimiran los datos del elemento seleccionado.
     * @param setString El parámetro setString define un dato tipo String.
     */
//    public void setDefault(JComboBox comboBox, JLabel label, JTextArea txtArea, String setString){
//        String string = String.valueOf(comboBox.getSelectedItem());
//        label.setText("Productos Disponibles en Almacen " + string + ":");
//        windowStock.NodoWh = windowMain.grafo.getList().Search(string);
//        txtArea.setText(windowStock.NodoWh.getStock().Print());
//    }
//    //Cierre del método
    
    /**
     * Método que devuelve el objeto ImageIcon para asignar a un JOptionPane. 
     * @param image El parámetro image define un String con la dirección donde se guarda el archivo de la imagen.
     * @return objeto ImageIcon del icono en la dirección de archivo.
     */
    public static ImageIcon setJOptionPaneImage(String image){
        final ImageIcon icon = new ImageIcon(image);
        return icon;
    } //Cierre del método
    
    /**
     * Método que verifica si el textField tiene texto. 
     * @param textfield El parámetro textfield define un JTextField que se comprobará si está vacio.
     * @return boolean Dato tipo boolean que será el que indique el estado del textfield.
     */
    public static boolean checkTextField(JTextField textfield){
        if(textfield.getText().equals("")){
            return true;
        } else {
            return false;
        }
    }

    
    /**
     * Método que verifica si selecciono un elemento de la lista. 
     * @param lista El parámetro list define la lista donde se verificará si existe un elemento seleccionado.
     * @return boolean, true si un elemento ha sido seleccionado y false en caso contrario.
     */
    public static boolean checkListSelec(JList list){
        boolean selected = false;
        if(list.isSelectionEmpty()){
            JOptionPane.showMessageDialog(null, "Importante: Debes seleccionar un elemento de la lista!.", "Alerta!",JOptionPane.INFORMATION_MESSAGE, auxFunctions.setJOptionPaneImage("/Users/beatrizcardozo/Desktop/Proyecto 2/Proyecto-2/Proyecto-2/src/proyecto/interfaces/images/searchKeyWords.png")); 
            selected = false;
        } else{
            selected = true;
        }
        
        return selected;  
    } //Cierre del método
} //Cierre de la clase
