
package logica_programable;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;
import javax.swing.JOptionPane;

public class Carrito { //inicia clase 
    
    //declaracion de estructura de datos dinamica 
    private Stack<String> carrito;
    private Map <String,Integer> historialcompras;
    // base de conocimiento 
    private String [] recomendaciones={"leche","pan","huevo","tortilla","arroz","frijol","azúcar"};
    //contructor inicializar las estructuras de datos dinamicas 

    public Carrito() {
        
        carrito = new Stack();
        historialcompras= new HashMap<>();
    }
    //actividades de mantenimiento de informacion 
     
    public void agregarProducto(String producto){
    carrito.push(producto);
    historialcompras.put(producto,historialcompras.getOrDefault(producto,0)+1);
        JOptionPane.showInternalMessageDialog(null,"Agrego de prodcuto con exito");
    }
    
    
} // termina clase 
