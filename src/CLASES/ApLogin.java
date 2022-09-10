
package CLASES;
import CONEXION.Conectar;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class ApLogin {
    private String usuario;
    private String contraseña;
    private int rol;

    //Conexion
    private Conectar con;
    
   
    
    public ApLogin(){}
    
    public ApLogin(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }
    
     //Consulta de validez
    final String COMPROBAR = "SELECT Usuario, password1, ID_Rol FROM Usuario "
            + "WHERE ID_Rol = 1 and Usuario='"+usuario+"'";

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    public int Login(String user, String pass) throws SQLException{
        con = new Conectar();
        ApLogin login = new ApLogin();
        
        Connection conn = DriverManager.getConnection(con.getUrl(),con.getUsuario(),con.getPassword());
        
        int resultado=0;
        
        
        login.setUsuario(user);
        
        
        
        try{
            PreparedStatement ps = conn.prepareStatement("SELECT Usuario, password1, ID_Rol FROM Usuario WHERE (ID_Rol = 1 or ID_Rol=2) and Usuario='"+user+"'");
            ResultSet rs = ps.executeQuery();
            
            
            
            if(rs.next()){
                String u = rs.getString("Usuario");
                String p = rs.getString("password1");
                int rol = rs.getInt("ID_Rol");
                
                if(pass.equals(p)){
                    
                    if(rol == 1){
                        resultado = 1;
                    }else if(rol == 2){
                        resultado = 2;
                    }
                    
                }else{
                    JOptionPane.showMessageDialog(null, "LA CONTRASEÑA NO ES CORRECTA.");
                }
                
            }else{
                JOptionPane.showMessageDialog(null, "EL USUARIO NO EXISTE");
            }
            
            
        }catch(Exception e){
            System.out.println("Mensaje: "+e.getMessage());
        }
        return resultado;
    }
    
    
    
}
