
package CONEXION;

import java.sql.*;
import javax.swing.JOptionPane;


public class Conectar {
        
    private String url;
    private String usuario;
    private String password;
    
    public Conectar(){
        url = "jdbc:sqlserver://localhost:1433;databaseName=Panaderia_MrPan"
                + ";trustServerCertificate=true;";
        usuario = "sa";
        password = "josue1997";
    }
    
    public String getUrl() {
        return url;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getPassword() {
        return password;
    }
    
    
}
