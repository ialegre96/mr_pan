
package Clases;

import CONEXION.Conectar;
import INTERFACES.EmpleadoDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Empleado extends Persona implements EmpleadoDAO{
    
    private String ID_Empleado;
    private String correo;
    private double sueldo;  
    
    private Conectar con;
    
    //Consultas de BD
    final String INSERT = "INSERT INTO Empleado(ID_Empleado, Nombre, Genero, DNI, Correo, Direccion, Sueldo, Telefono, Distrito) VALUES (?,?,?,?,?,?,?,?,?)";
    final String UPDATE = "UPDATE Empleado SET Nombre = ?, Genero = ?, DNI = ?, Correo = ?, Direccion = ?, Sueldo = ?, Telefono = ?, Distrito = ? WHERE ID_Empleado = ?";
    final String DELETE = "DELETE FROM Empleado WHERE ID_Empleado = ?";
    final String GETALL = "SELECT ID_Empleado, Nombre, Genero, DNI, Correo, Direccion, Sueldo, Telefono, Distrito FROM Empleado";
    final String GETONE = "SELECT * FROM Empleado WHERE ID_Empleado = ?";
    
    public Empleado(){}
    
    public Empleado(String ID_Empleado, String correo, double sueldo, String nombre, String genero, String DNI, String telefono, String distrito, String direccion) {
        super(nombre, genero, DNI, telefono, distrito, direccion);
        this.ID_Empleado = ID_Empleado;
        this.correo = correo;
        this.sueldo = sueldo;
    }
    
    @Override
    public void insertar(Empleado e) throws SQLException{    
        con = new Conectar();
        PreparedStatement stat = null;       
        
        Connection conn = DriverManager.getConnection(con.getUrl(),con.getUsuario(),con.getPassword());  
        
        try{
            
            stat = conn.prepareStatement(INSERT);
            
            stat.setString(1, e.getID_Empleado());
            stat.setString(2, e.getNombre()); 
            stat.setString(3, e.getGenero());
            stat.setString(4, e.getDNI());
            stat.setString(5, e.getCorreo());
            stat.setString(6, e.getDireccion());
            stat.setDouble(7, e.getSueldo());
            stat.setString(8, e.getTelefono());
            stat.setString(9, e.getDistrito());
            JOptionPane.showMessageDialog(null, "Datos ingresados correctamente","Mensaje",JOptionPane.INFORMATION_MESSAGE);
            if(stat.executeUpdate() == 0){
                System.out.println("Es probable que no se haya guardado.");
            }
            
            
        }catch(Exception ex){
            System.out.println("Error: "+ex.getMessage());
        }finally{
            if(stat != null){
                try{
                    stat.close();
                }catch(Exception ex){
                    System.out.println(""+ex.getMessage());
                }
            }
        }
    }
    
    @Override
    public void editar(Empleado e) throws SQLException{
        con = new Conectar();
        PreparedStatement stat = null;
        
        Connection conn = DriverManager.getConnection(con.getUrl(),con.getUsuario(),con.getPassword());
        
        try{
            stat = conn.prepareStatement(UPDATE);          
            stat.setString(1, e.getNombre()); 
            stat.setString(2, e.getGenero());
            stat.setString(3, e.getDNI());
            stat.setString(4, e.getCorreo());
            stat.setString(5, e.getDireccion());
            stat.setDouble(6, e.getSueldo());
            stat.setString(7, e.getTelefono());
            stat.setString(8, e.getDistrito());
            stat.setString(9, e.getID_Empleado());
            
            int res = stat.executeUpdate();
            
            if(res>0){
                JOptionPane.showMessageDialog(null,"Datos editados.");
            }else{
                JOptionPane.showMessageDialog(null, "Error al editar.");
            }
            
        }catch(SQLException ex){
            System.out.println("Error Editar: "+ex.getMessage());
        }
        
        
    }
    
    @Override
    public void eliminar(Empleado e) throws SQLException{
        con = new Conectar();
        PreparedStatement stat = null;
        
        Connection conn = DriverManager.getConnection(con.getUrl(),con.getUsuario(),con.getPassword());
        
        try{
                stat = conn.prepareStatement(DELETE);
                stat.setString(1, e.getID_Empleado());
                if(stat.executeUpdate()==0){
                    System.out.println("Puede que el empleado no se haya borrado");
                }else{
                    JOptionPane.showMessageDialog(null, "Se eliminó con éxito.");
                }
        }catch(Exception ex){
            System.out.println("Mensaje: "+ex.getMessage());
        } finally{
            if(stat != null){
                try{
                    stat.close();
                }catch(Exception ex){
                    System.out.println("Mensaje: "+ex.getMessage());
                }
            }
        }
    }
    
    private Empleado convertir(ResultSet rs) throws SQLException{
        
        con = new Conectar();
        
        String id = rs.getString("ID_Empleado");        
        String nombre = rs.getString("Nombre");
        String genero = rs.getString("Genero");
        String dni = rs.getString("DNI");
        String correo = rs.getString("Correo");
        String direccion = rs.getString("Direccion");
        double sueldo = rs.getDouble("Sueldo");        
        String telefono = rs.getString("Telefono");
        String distrito = rs.getString("Distrito");
        
        Empleado empleado = new Empleado();// new Cliente(id, nombre, genero, dni, ruc, direccion, telefono, distrito);
        empleado.setID_Empleado(id);
        empleado.setNombre(nombre);
        empleado.setGenero(genero);
        empleado.setDNI(dni);
        empleado.setCorreo(correo);
        empleado.setDireccion(direccion);
        empleado.setSueldoBase(sueldo);
        empleado.setTelefono(telefono);
        empleado.setDistrito(distrito);
        
        
        return empleado;
    }
    
    @Override
    public List<Empleado> obtenerTodos() throws SQLException{
        con = new Conectar();
        PreparedStatement stat = null;
        ResultSet rs = null;
        List<Empleado> empleado = new ArrayList<>();
        
        
        Connection conn = DriverManager.getConnection(con.getUrl(),con.getUsuario(),con.getPassword()); 
        
        try{
            stat = conn.prepareStatement(GETALL);
            rs = stat.executeQuery();
            while(rs.next()){
                empleado.add(convertir(rs));
                
            }           
        }catch(Exception ex){
            System.out.println("Mensaje obtener Todos: "+ex.getMessage());
        }finally{
            if(rs != null){
                try{
                    rs.close();
                }catch(Exception ex){
                    System.out.println("Mensaje: "+ex.getMessage());
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
        return empleado;
    }
    
    public Empleado obtener(String id) throws SQLException{
        con = new Conectar();
        PreparedStatement stat = null;
        ResultSet rs = null;
        Empleado e = new Empleado();
        
        Connection conn = DriverManager.getConnection(con.getUrl(),con.getUsuario(),con.getPassword());
        
        try{
            stat = conn.prepareStatement(GETONE);
            stat.setString(1, id);
            rs = stat.executeQuery();
            if(rs.next()){
                //e.convertir(rs);                
                e.setNombre(rs.getString("Nombre"));
            }else{
                System.out.println("No se ha encontrado ese registro.");
            }
        }catch(Exception ex){
            System.out.println("Mensaje: OBTENER "+ex.getMessage());
        } finally{
            if(rs != null){
                try{
                    rs.close();
                }catch(Exception ex){
                    System.out.println("Mensaje: "+ex.getMessage());
                }
            }
            if(stat != null){
                try{
                    stat.close();
                }catch(Exception ex){
                    System.out.println("Mensaje: "+ex.getMessage());
                }
            }
        }
        return e;
    }

    @Override
    public String toString() {
        return "Empleado{" + "ID_Empleado=" + ID_Empleado + ", correo=" + correo + ", sueldo=" + sueldo + '}';
    } 
    
    //Setter y getter
    public String getID_Empleado() {
        return ID_Empleado;
    }

    public void setID_Empleado(String ID_Empleado) {
        this.ID_Empleado = ID_Empleado;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldoBase(double sueldo) {
        this.sueldo = sueldo;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    
    
    
    
    
    
}
