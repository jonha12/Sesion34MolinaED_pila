package sesion34molinaed_pila;

import java.util.Stack;
import javax.swing.JOptionPane;

public class Sesion34MolinaED_pila {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaracion de pila 

        Stack<Integer> pilaMolina = new Stack<>();

        pilaMolina.push(1000);
        pilaMolina.push(1002);
        pilaMolina.push(1087);
        pilaMolina.push(10);
        pilaMolina.push(100);
        JOptionPane.showInternalMessageDialog(null,"Datos de la pila ordenada son: "+pilaMolina);
    }

}
