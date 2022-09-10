
package CLASES;

import CONEXION.Conectar;
import INTERFACES.ProveedorDAO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Proveedor implements ProveedorDAO{
    
    private String ID_Proveedor;
    private String nomProveedor;   
    private String direccion;
    private String correo;
    private String distrito;
    
    private Conectar con;
    
    //Consultas de BD
    final String INSERT = "INSERT INTO Proveedor(ID_Proveedor, NomProveedor, Direccion, Correo, Distrito) VALUES (?,?,?,?,?)";
    final String UPDATE = "UPDATE Proveedor SET NomProveedor = ?, Direccion = ?, Correo = ?, Distrito = ? WHERE ID_Proveedor = ?";
    final String DELETE = "DELETE FROM Proveedor WHERE ID_Proveedor = ?";
    final String GETALL = "SELECT ID_Proveedor, NomProveedor, Direccion, Correo, Distrito FROM Proveedor";
    final String GETONE = "SELECT ID_Proveedor, NomProveedor, Direccion, Correo, Distrito WHERE ID_Proveedor = ?";
    
    public Proveedor(){}
    
    public Proveedor(String ID_Proveedor, String nomProveedor, String direccion, String correo, String distrito) {
        this.ID_Proveedor = ID_Proveedor;
        this.nomProveedor = nomProveedor;        
        this.direccion = direccion;
        this.correo = correo;
        this.distrito = distrito;
    }
    
    @Override
    public void insertar(Proveedor p) throws SQLException{
        con = new Conectar();
        PreparedStatement stat = null;       
        
        Connection conn = DriverManager.getConnection(con.getUrl(),con.getUsuario(),con.getPassword());  
        
        try{
            
            stat = conn.prepareStatement(INSERT);
            
            stat.setString(1,p.getID_Proveedor());
            stat.setString(2, p.getNomProveedor());             
            stat.setString(3, p.getDireccion());
            stat.setString(4, p.getCorreo());
            stat.setString(5, p.getDistrito());
            
            JOptionPane.showMessageDialog(null, "Datos ingresados correctamente","Mensaje",JOptionPane.INFORMATION_MESSAGE);
            if(stat.executeUpdate() == 0){
                System.out.println("Es probable que no se haya guardado.");
            }
            
            
        }catch(Exception e){
            System.out.println("Error Insertar: "+e.getMessage());
        }finally{
            if(stat != null){
                try{
                    stat.close();
                }catch(Exception e){
                    System.out.println(""+e.getMessage());
                }
            }
        }
    }
    
    @Override
    public void editar(Proveedor p) throws SQLException{
        con = new Conectar();
        PreparedStatement stat = null;
        
        Connection conn = DriverManager.getConnection(con.getUrl(),con.getUsuario(),con.getPassword());
        
        try{
            stat = conn.prepareStatement(UPDATE);           
            stat.setString(1, p.getNomProveedor());             
            stat.setString(2, p.getDireccion());
            stat.setString(3, p.getCorreo());
            stat.setString(4, p.getDistrito());
            stat.setString(5,p.getID_Proveedor());
            
            int res = stat.executeUpdate();
            System.out.println(p);
            
            if(res>0){
                JOptionPane.showMessageDialog(null,"Datos editados.");
            }else{
                JOptionPane.showMessageDialog(null, "Error al editar.");
            }
            
        }catch(SQLException e){
            System.out.println("Error Editar: "+e.getMessage());
        }
        
        
    }
    
    @Override
    public void eliminar(Proveedor p) throws SQLException{
        con = new Conectar();
        PreparedStatement stat = null;
        
        Connection conn = DriverManager.getConnection(con.getUrl(),con.getUsuario(),con.getPassword());
        
        try{
                stat = conn.prepareStatement(DELETE);
                stat.setString(1, p.getID_Proveedor());
                if(stat.executeUpdate()==0){
                    System.out.println("Puede que el proveedor no se haya borrado");
                }else{
                    JOptionPane.showMessageDialog(null, "Se eliminó con éxito.");
                }
        }catch(Exception e){
            System.out.println("Mensaje: "+e.getMessage());
        } finally{
            if(stat != null){
                try{
                    stat.close();
                }catch(Exception e){
                    System.out.println("Mensaje: "+e.getMessage());
                }
            }
        }
    }
    
    private Proveedor convertir(ResultSet rs) throws SQLException{
        
        con = new Conectar();        
        
        
        String id = rs.getString("ID_Proveedor");  
        String nombre = rs.getString("NomProveedor");        
        String direccion = rs.getString("Direccion");
        String correo = rs.getString("Correo");
        String distrito = rs.getString("Distrito");
        
        
        Proveedor prov = new Proveedor();// new Cliente(id, nombre, genero, dni, ruc, direccion, telefono, distrito);
        
        prov.setID_Proveedor(id);
        prov.setNomProveedor(nombre);        
        prov.setDireccion(direccion);
        prov.setCorreo(correo);
        prov.setDistrito(distrito);        
        
        
        
        return prov;
    }
    
    @Override
    public List<Proveedor> obtenerTodos() throws SQLException{
        con = new Conectar();
        PreparedStatement stat = null;
        ResultSet rs = null;
        List<Proveedor> proveedor = new ArrayList<>();
        
        
        Connection conn = DriverManager.getConnection(con.getUrl(),con.getUsuario(),con.getPassword()); 
        
        try{
            stat = conn.prepareStatement(GETALL);
            rs = stat.executeQuery();
            while(rs.next()){
                proveedor.add(convertir(rs));                
            }           
        }catch(Exception e){
            System.out.println("Mensaje ObtenerTodos: "+e.getMessage());
        }finally{
            if(rs != null){
                try{
                    rs.close();
                }catch(Exception e){
                    System.out.println("Mensaje: "+e.getMessage());
                }
            }
            if(stat != null){
                try{
                    stat.close();
                }catch(Exception e){
                    System.out.println("Menasje: "+e.getMessage());
                }
            }
        }
        return proveedor;
    }
    
    public Proveedor obtener(String id) throws SQLException{
        con = new Conectar();
        PreparedStatement stat = null;
        ResultSet rs = null;
        Proveedor p = null;
        
        Connection conn = DriverManager.getConnection(con.getUrl(),con.getUsuario(),con.getPassword());
        
        try{
            stat = conn.prepareStatement(GETONE);
            stat.setString(1, id);
            rs = stat.executeQuery();
            if(rs.next()){
                p.convertir(rs);
            }else{
                System.out.println("No se ha encontrado ese registro.");
            }
        }catch(Exception e){
            System.out.println("Mensaje: OBTENER "+e.getMessage());
        } finally{
            if(rs != null){
                try{
                    rs.close();
                }catch(Exception e){
                    System.out.println("Mensaje: "+e.getMessage());
                }
            }
            if(stat != null){
                try{
                    stat.close();
                }catch(Exception e){
                    System.out.println("Mensaje: "+e.getMessage());
                }
            }
        }
        return p;
    }

    public String getID_Proveedor() {
        return ID_Proveedor;
    }

    public void setID_Proveedor(String ID_Proveedor) {
        this.ID_Proveedor = ID_Proveedor;
    }

    public String getNomProveedor() {
        return nomProveedor;
    }

    public void setNomProveedor(String nomProveedor) {
        this.nomProveedor = nomProveedor;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }
    
    
    
    
    
}
