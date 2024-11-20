
package conexion;


import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ConectarBD {
    
     public Connection cn;
    public Statement stmt;
    public ResultSet rs;
    
    //metodo para conectar a la base de datos
    
    public void conectarBDOracle() throws SQLException{
    
        DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
    cn=DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:XE","sistemaventa","uacm123");
        stmt= cn.createStatement();
    }
    
    public Connection getConnection() {
        return cn;
    }

    public void rs() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

