
package Clases;

import CONEXION.Conectar;
import INTERFACES.ClienteDAO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Cliente extends Persona implements ClienteDAO{

    private String ID_cliente, RUC;
    
    private Conectar con;
    
    //Consultas de BD
    final String INSERT = "INSERT INTO Cliente(ID_Cliente, Nombre, Genero, DNI, RUC, Direccion, Telefono, Distrito) VALUES (?,?,?,?,?,?,?,?)";
    final String UPDATE = "UPDATE Cliente SET Nombre = ?, Genero = ?, DNI = ?, RUC = ?, Direccion = ?, Telefono = ?, Distrito = ? WHERE ID_Cliente = ?";
    final String DELETE = "DELETE FROM Cliente WHERE ID_Cliente = ?";
    final String GETALL = "SELECT ID_Cliente, Nombre, Genero, DNI, RUC, Direccion, Telefono, Distrito FROM Cliente";
    final String GETONE = "SELECT * FROM Cliente WHERE ID_Cliente = ?";
    
    public Cliente(){}

    public Cliente(String ID_cliente, String RUC, String nombre, String genero, String DNI, String telefono, String distrito, String direccion) {
        super(nombre, genero, DNI, telefono, distrito, direccion);
        this.ID_cliente = ID_cliente;
        this.RUC = RUC;        
    }    
    
    @Override
    public void insertar(Cliente c) throws SQLException{    
        con = new Conectar();
        PreparedStatement stat = null;       
        
        Connection conn = DriverManager.getConnection(con.getUrl(),con.getUsuario(),con.getPassword());  
        
        try{
            
            stat = conn.prepareStatement(INSERT);
            
            stat.setString(1, c.getID_cliente());
            stat.setString(2, c.getNombre()); 
            stat.setString(3, c.getGenero());
            stat.setString(4, c.getDNI());
            stat.setString(5, c.getRUC());
            stat.setString(6, c.getDireccion());
            stat.setString(7, c.getTelefono());
            stat.setString(8, c.getDistrito());
            JOptionPane.showMessageDialog(null, "Datos ingresados correctamente","Mensaje",JOptionPane.INFORMATION_MESSAGE);
            if(stat.executeUpdate() == 0){
                System.out.println("Es probable que no se haya guardado.");
            }
            
            
        }catch(Exception e){
            System.out.println("Error: "+e.getMessage());
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
    public void editar(Cliente c) throws SQLException{
        con = new Conectar();
        PreparedStatement stat = null;
        
        Connection conn = DriverManager.getConnection(con.getUrl(),con.getUsuario(),con.getPassword());
        
        try{
            stat = conn.prepareStatement(UPDATE);            
            stat.setString(1, c.getNombre()); 
            stat.setString(2, c.getGenero());
            stat.setString(3, c.getDNI());
            stat.setString(4, c.getRUC());
            stat.setString(5, c.getDireccion());
            stat.setString(6, c.getTelefono());
            stat.setString(7, c.getDistrito());            
            stat.setString(8, c.getID_cliente());
            
            int res = stat.executeUpdate();
            
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
    public void eliminar(Cliente c) throws SQLException{
        con = new Conectar();
        PreparedStatement stat = null;
        
        Connection conn = DriverManager.getConnection(con.getUrl(),con.getUsuario(),con.getPassword());
        
        try{
                stat = conn.prepareStatement(DELETE);
                stat.setString(1, c.getID_cliente());
                if(stat.executeUpdate()==0){
                    System.out.println("Puede que el cliente no se haya borrado");
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
    
    private Cliente convertir(ResultSet rs) throws SQLException{
        
        con = new Conectar();
        
        String id = rs.getString("ID_Cliente");        
        String nombre = rs.getString("Nombre");
        String genero = rs.getString("Genero");
        String dni = rs.getString("DNI");
        String ruc = rs.getString("RUC");
        String direccion = rs.getString("Direccion");
        String telefono = rs.getString("Telefono");
        String distrito = rs.getString("Distrito");
        
        Cliente cliente = new Cliente();// new Cliente(id, nombre, genero, dni, ruc, direccion, telefono, distrito);
        cliente.setID_cliente(id);
        cliente.setNombre(nombre);
        cliente.setGenero(genero);
        cliente.setDNI(dni);
        cliente.setRUC(ruc);
        cliente.setDireccion(direccion);
        cliente.setTelefono(telefono);
        cliente.setDistrito(distrito);
        
        return cliente;
    }
    
    @Override
    public List<Cliente> obtenerTodos() throws SQLException{
        con = new Conectar();
        PreparedStatement stat = null;
        ResultSet rs = null;
        List<Cliente> cliente = new ArrayList<>();
        
        
        Connection conn = DriverManager.getConnection(con.getUrl(),con.getUsuario(),con.getPassword()); 
        
        try{
            stat = conn.prepareStatement(GETALL);
            rs = stat.executeQuery();
            while(rs.next()){
                cliente.add(convertir(rs));
                
            }           
        }catch(Exception e){
            System.out.println("Mensaje: "+e.getMessage());
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
        return cliente;
    }
    
    public Cliente obtener(String id) throws SQLException{
        con = new Conectar();
        PreparedStatement stat = null;
        ResultSet rs = null;
        Cliente c = new Cliente();
        
        Connection conn = DriverManager.getConnection(con.getUrl(),con.getUsuario(),con.getPassword());
        
        try{
            stat = conn.prepareStatement(GETONE);
            stat.setString(1, id);
            rs = stat.executeQuery();
            if(rs.next()){
                //c.convertir(rs);                
                c.setID_cliente(rs.getString("ID_Cliente"));
                c.setNombre(rs.getString("Nombre"));
                c.setDNI(rs.getString("DNI"));
                c.setRUC(rs.getString("RUC"));
                c.setTelefono(rs.getString("Telefono"));
                c.setDireccion(rs.getString("Direccion"));
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
        return c;
    }

    public String getID_cliente() {
        return ID_cliente;
    }

    public void setID_cliente(String ID_cliente) {
        this.ID_cliente = ID_cliente;
    }

    public String getRUC() {
        return RUC;
    }

    public void setRUC(String RUC) {
        this.RUC = RUC;
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String getGenero() {
        return genero;
    }

    @Override
    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String getDNI() {
        return DNI;
    }

    @Override
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    @Override
    public String getTelefono() {
        return telefono;
    }

    @Override
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String getDistrito() {
        return distrito;
    }

    @Override
    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    @Override
    public String getDireccion() {
        return direccion;
    }

    @Override
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
}
