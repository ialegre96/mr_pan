
package Clases;

import CONEXION.Conectar;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Boleta{
    
    //Atributos
    
    //Fecha con formato
    
    
    
    
    private String ID_Boleta;
    private String nroBoleta;
    private double IGV;
    private int cantidad;
    private double precioU;
    private double precioF;
    private Date fechaEntrega;
    private String ID_Cliente;
    private String ID_Empleado;
    private String ID_Producto;
    
    //Conexion
    private Conectar con;
    
    //Consultas de BD
    final String INSERT = "INSERT INTO Boleta(ID_Boleta, NumBoleta, IGV, Cantidad, Precio_U, Precion_final, Fecha_Entrega, ID_Cliente, ID_Empleado, ID_Producto) "
            + "VALUES (?,?,?,?,?,?,?,?,?,?)";
    final String UPDATE = "UPDATE Boleta SET NumBoleta = ?, IGV = ?, Cantidad = ?, Precio_U = ?, Precion_final = ?, ID_Cliente = ?,"
            + "ID_Empleado = ?, ID_Producto = ? WHERE ID_Boleta = ?";
    final String DELETE = "DELETE FROM Boleta WHERE ID_Boleta = ?";
    final String GETALL = "SELECT ID_Boleta, NumBoleta, IGV, Cantidad, Precio_U, Precion_final, Fecha_Entrega, ID_Cliente, ID_Empleado, ID_Producto FROM Boleta";
    final String GETONE = "SELECT ID_Boleta, NumBoleta, IGV, Cantidad, Precio_U, Precion_final, Fecha_Entrega, ID_Cliente, ID_Empleado, ID_Producto WHERE ID_Boleta = ?";
    
    //Constructor
    
    public Boleta(){}

    public Boleta(String ID_Boleta, String nroBoleta, double IGV, int cantidad, double precioU, double precioF, Date fechaEntrega, String ID_Cliente, String ID_Empleado, String ID_Producto, Conectar con) {
        this.ID_Boleta = ID_Boleta;
        this.nroBoleta = nroBoleta;
        this.IGV = IGV;
        this.cantidad = cantidad;
        this.precioU = precioU;
        this.precioF = precioF;
        this.fechaEntrega = fechaEntrega;
        this.ID_Cliente = ID_Cliente;
        this.ID_Empleado = ID_Empleado;
        this.ID_Producto = ID_Producto;
        this.con = con;
    }
    
    //Fecha x-x
    java.util.Date utilPackageDate
            = new java.util.Date();
    java.sql.Date sqlPackageDate
            = new java.sql.Date(utilPackageDate.getTime());
    
    
    
    public void insertar(Boleta b) throws SQLException{    
        con = new Conectar();
        PreparedStatement stat = null;       
        
        Connection conn = DriverManager.getConnection(con.getUrl(),con.getUsuario(),con.getPassword());  
        
       
        
        try{
            
            stat = conn.prepareStatement(INSERT);
            
            b.setPrecioF(b.getCantidad()*b.getPrecioU());
            
            b.setFechaEntrega(sqlPackageDate);
            
            stat.setString(1, b.getID_Boleta());
            stat.setString(2, b.getNroBoleta()); 
            stat.setDouble(3, b.getIGV());
            stat.setInt(4, b.getCantidad());
            stat.setDouble(5, b.getPrecioU());
            stat.setDouble(6, b.getPrecioF());
            stat.setDate(7, (java.sql.Date) b.getFechaEntrega());
            stat.setString(8, b.getID_Cliente());
            stat.setString(9, b.getID_Empleado());
            stat.setString(10, b.getID_Producto());
            
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
    
    public void editar(Boleta b) throws SQLException{
        con = new Conectar();
        PreparedStatement stat = null;
        
        Connection conn = DriverManager.getConnection(con.getUrl(),con.getUsuario(),con.getPassword());
        
        try{
            
            stat = conn.prepareStatement(UPDATE);   
            
            b.setPrecioF(b.getCantidad()*b.getPrecioU());
            
            b.setFechaEntrega(sqlPackageDate);
            
            stat.setString(1, b.getNroBoleta()); 
            stat.setDouble(2, b.getIGV());
            stat.setInt(3, b.getCantidad());
            stat.setDouble(4, b.getPrecioU());
            stat.setDouble(5, b.getPrecioF());
            //stat.setDate(6, (java.sql.Date) b.getFechaEntrega());
            stat.setString(6, b.getID_Cliente());
            stat.setString(7, b.getID_Empleado());
            stat.setString(8, b.getID_Producto());
            stat.setString(9, b.getID_Boleta());
            
            
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
    
    public void eliminar(Boleta b) throws SQLException{
        con = new Conectar();
        PreparedStatement stat = null;
        
        Connection conn = DriverManager.getConnection(con.getUrl(),con.getUsuario(),con.getPassword());
        
        try{
                stat = conn.prepareStatement(DELETE);
                stat.setString(1, b.getID_Boleta());
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
    
    private Boleta convertir(ResultSet rs) throws SQLException{
        
        con = new Conectar();
        
        String id = rs.getString("ID_Boleta");        
        String numboleta = rs.getString("NumBoleta");
        double igv = rs.getDouble("IGV");
        int cantidad = rs.getInt("Cantidad");
        double precioU = rs.getDouble("Precio_U");
        double precioF = rs.getDouble("Precion_final");
        Date fechaEntrega = rs.getDate("Fecha_Entrega");
        String id_cliente = rs.getString("ID_Cliente");
        String id_empleado = rs.getString("ID_Empleado");
        String id_producto = rs.getString("ID_Producto");
        
        Boleta boleta = new Boleta();// new Cliente(id, nombre, genero, dni, ruc, direccion, telefono, distrito);
        boleta.setID_Boleta(id);
        boleta.setNroBoleta(numboleta);
        boleta.setIGV(igv);
        boleta.setCantidad(cantidad);
        boleta.setPrecioU(precioU);
        boleta.setPrecioF(precioF);
        boleta.setFechaEntrega(fechaEntrega);
        boleta.setID_Cliente(id_cliente);
        boleta.setID_Empleado(id_empleado);
        boleta.setID_Producto(id_producto);
        
        
        
        return boleta;
    }
    
    public List<Boleta> obtenerTodos() throws SQLException{
        con = new Conectar();
        PreparedStatement stat = null;
        ResultSet rs = null;
        List<Boleta> boleta = new ArrayList<>();
        
        
        Connection conn = DriverManager.getConnection(con.getUrl(),con.getUsuario(),con.getPassword()); 
        
        try{
            stat = conn.prepareStatement(GETALL);
            rs = stat.executeQuery();
            while(rs.next()){
                boleta.add(convertir(rs));
                
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
        return boleta;
    }
    
    public Boleta obtener(String id) throws SQLException{
        con = new Conectar();
        PreparedStatement stat = null;
        ResultSet rs = null;
        Boleta b = null;
        
        Connection conn = DriverManager.getConnection(con.getUrl(),con.getUsuario(),con.getPassword());
        
        try{
            stat = conn.prepareStatement(GETONE);
            stat.setString(1, id);
            rs = stat.executeQuery();
            if(rs.next()){
                b.convertir(rs);
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
        return b;
    }


    public String getID_Boleta() {
        return ID_Boleta;
    }

    public void setID_Boleta(String ID_Boleta) {
        this.ID_Boleta = ID_Boleta;
    }

    public String getNroBoleta() {
        return nroBoleta;
    }

    public void setNroBoleta(String nroBoleta) {
        this.nroBoleta = nroBoleta;
    }

    public double getIGV() {
        return IGV;
    }

    public void setIGV(double IGV) {
        this.IGV = IGV;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecioU() {
        return precioU;
    }

    public void setPrecioU(double precioU) {
        this.precioU = precioU;
    }

    public double getPrecioF() {
        return precioF;
    }

    public void setPrecioF(double precioF) {
        this.precioF = precioF;
    }

    public Date getFechaEntrega() {
        return fechaEntrega;
    }

    public void setFechaEntrega(Date fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    public String getID_Cliente() {
        return ID_Cliente;
    }

    public void setID_Cliente(String ID_Cliente) {
        this.ID_Cliente = ID_Cliente;
    }

    public String getID_Empleado() {
        return ID_Empleado;
    }

    public void setID_Empleado(String ID_Empleado) {
        this.ID_Empleado = ID_Empleado;
    }

    public String getID_Producto() {
        return ID_Producto;
    }

    public void setID_Producto(String ID_Producto) {
        this.ID_Producto = ID_Producto;
    }

    public Conectar getCon() {
        return con;
    }

    public void setCon(Conectar con) {
        this.con = con;
    }

   

    
    
}
