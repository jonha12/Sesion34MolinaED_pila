
package Sesion36Molina_Cola1;

import javax.swing.JOptionPane;


public class OperacionesColas {
    
    private int frente;
    private int fin;
    protected Object[] listaCola;

    public OperacionesColas(int tamMax) {
        frente = 0;
        fin = -1;
        listaCola = new Object[tamMax];
                JOptionPane.showMessageDialog(null, "Operaciones colas");
    }
       
      public void insertar(Object dato) throws Exception {
        if (!colaLlena()) {
            fin++;
            listaCola[fin] = dato;
                        JOptionPane.showMessageDialog(null, "Insertar ");
        } else {
            throw new Exception("Error en la cola: Cola LLena");
        }
    }  
        public int tamMax() { // determina  el tamaño de los elementos en la cola 
        return listaCola.length;
    } // termine meotodo para el numero de elementos 

        public boolean colaLlena() { // metodo que incdica que la cola esta llena 
        return fin == tamMax() - 1;
    } // termina meotodo que la cola esta llena 
public boolean colaVacia() {
        return frente > fin; // metodo que indica que la cola esta vacia 
    } // termian metodo para indicar que la cola esta vacia 
        public void imprimir() { // metodo para imprimir 
        for (int i = 0; i < tamMax(); i++) {
            Object datoActual = listaCola[i];

            if (datoActual != null) {
                 JOptionPane.showMessageDialog(null, "Cola esta LLena de valores\n"+(datoActual)+ ", ");
            }
        }
    } // termina metoodo para imprimir 
       
       
        public int contarDatos() { // metodo contar datos en cola 
         int contador = 0;

        for (int i = 0; i < tamMax(); i++) {
            if (listaCola[i] != null) {
                contador++;
            }
        }

        return contador;
    } // termina metodo  contyar datos 
    
} // termina clase 
