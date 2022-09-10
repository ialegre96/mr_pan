
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
import java.util.Date;

public class Factura{
    
    private String ID_Factura;
    private String nroFactura;
    private String razonSocial;
    private double IGV;
    private int Cantidad;
    private double precioU;
    private double precioF;
    private Date fechaEntrega;
    private String ID_Cliente;
    private String ID_Empleado;
    private String ID_Producto;
    
     //Conexion
    private Conectar con;
    
    //Consultas de BD
    final String INSERT = "INSERT INTO Factura(ID_Factura, NumFactura, RazonSocial, IGV, Cantidad, Precio_U, Precio_final, Fecha_Entrega, ID_Cliente, ID_Empleado, ID_Producto) "
            + "VALUES (?,?,?,?,?,?,?,?,?,?,?)";
    final String UPDATE = "UPDATE Factura SET NumFactura = ?, RazonSocial = ?, IGV = ?, Cantidad = ?, Precio_U = ?, Precio_final = ?,"
            + "ID_Cliente = ?, ID_Empleado = ?, ID_Producto = ? WHERE ID_Factura = ?";
    final String DELETE = "DELETE FROM Factura WHERE ID_Factura = ?";
    final String GETALL = "SELECT ID_Factura, NumFactura, RazonSocial, IGV, Cantidad, Precio_U, Precio_final, Fecha_Entrega, ID_Cliente, ID_Empleado, ID_Producto FROM Factura";
    final String GETONE = "SELECT * FROM Factura WHERE ID_Factura = ?";

    //Constructor
    public Factura(){}
    
    public Factura(String ID_Factura, String nroFactura, String razonSocial, double IGV, int Cantidad, double precioU, double precioF, Date fechaEntrega, String ID_Cliente, String ID_Empleado, String ID_Producto) {
        this.ID_Factura = ID_Factura;
        this.nroFactura = nroFactura;
        this.razonSocial = razonSocial;
        this.IGV = IGV;
        this.Cantidad = Cantidad;
        this.precioU = precioU;
        this.precioF = precioF;
        this.fechaEntrega = fechaEntrega;
        this.ID_Cliente = ID_Cliente;
        this.ID_Empleado = ID_Empleado;
        this.ID_Producto = ID_Producto;
    }
    
    //Fecha x-x
    private Date fechaActual(){
        java.util.Date utilPackageDate
            = new java.util.Date();
        java.sql.Date sqlPackageDate
            = new java.sql.Date(utilPackageDate.getTime());
        
        return sqlPackageDate;
    }
    
    
    public void insertar(Factura f) throws SQLException{    
        con = new Conectar();
        PreparedStatement stat = null;       
        
        Connection conn = DriverManager.getConnection(con.getUrl(),con.getUsuario(),con.getPassword());  
        
       
        
        try{
            
            stat = conn.prepareStatement(INSERT);
            
            f.setPrecioF(f.getCantidad()*f.getPrecioU());
            
            f.setFechaEntrega(fechaActual());
            
            stat.setString(1, f.getID_Factura());
            stat.setString(2, f.getNroFactura()); 
            stat.setString(3, f.getRazonSocial());
            stat.setDouble(4, f.getIGV());
            stat.setDouble(5, f.getCantidad());
            stat.setDouble(6, f.getPrecioU());
            stat.setDouble(7, f.getPrecioF());
            stat.setDate(8, (java.sql.Date) f.getFechaEntrega());
            stat.setString(9, f.getID_Cliente());
            stat.setString(10, f.getID_Empleado());
            stat.setString(11, f.getID_Producto());
            
            
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
    
    public void editar(Factura f) throws SQLException{
        con = new Conectar();
        PreparedStatement stat = null;
        
        Connection conn = DriverManager.getConnection(con.getUrl(),con.getUsuario(),con.getPassword());
        
        try{
            
            stat = conn.prepareStatement(UPDATE);   
            
            f.setPrecioF(f.getCantidad()*f.getPrecioU());
            
            f.setFechaEntrega(fechaActual());
            
            
            stat.setString(1, f.getNroFactura()); 
            stat.setString(2, f.getRazonSocial());
            stat.setDouble(3, f.getIGV());
            stat.setDouble(4, f.getCantidad());
            stat.setDouble(5, f.getPrecioU());
            stat.setDouble(6, f.getPrecioF());
            //stat.setDate(7, (java.sql.Date) f.getFechaEntrega());
            stat.setString(7, f.getID_Cliente());
            stat.setString(8, f.getID_Empleado());
            stat.setString(9, f.getID_Producto());
            stat.setString(10, f.getID_Factura());
            
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
    
    public void eliminar(Factura f) throws SQLException{
        con = new Conectar();
        PreparedStatement stat = null;
        
        Connection conn = DriverManager.getConnection(con.getUrl(),con.getUsuario(),con.getPassword());
        
        try{
                stat = conn.prepareStatement(DELETE);
                stat.setString(1, f.getID_Factura());
                if(stat.executeUpdate()==0){
                    System.out.println("Puede que la factura no se haya borrado");
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
    
    private Factura convertir(ResultSet rs) throws SQLException{
        
        con = new Conectar();
        
        String id = rs.getString("ID_Factura");        
        String numfactura = rs.getString("NumFactura");
        String razonSocial = rs.getString("RazonSocial");
        double igv = rs.getDouble("IGV");
        int cantidad = rs.getInt("Cantidad");
        double precioU = rs.getDouble("Precio_U");
        double precioF = rs.getDouble("Precio_final");
        Date fechaEntrega = rs.getDate("Fecha_Entrega");
        String id_cliente = rs.getString("ID_Cliente");
        String id_empleado = rs.getString("ID_Empleado");
        String id_producto = rs.getString("ID_Producto");
        
        Factura factura = new Factura();// new Cliente(id, nombre, genero, dni, ruc, direccion, telefono, distrito);
        factura.setID_Factura(id);
        factura.setNroFactura(numfactura);
        factura.setRazonSocial(razonSocial);
        factura.setIGV(igv);
        factura.setCantidad(cantidad);
        factura.setPrecioU(precioU);
        factura.setPrecioF(precioF);
        factura.setFechaEntrega(fechaEntrega);
        factura.setID_Cliente(id_cliente);
        factura.setID_Empleado(id_empleado);
        factura.setID_Producto(id_producto);
        
        
        
        return factura;
    }
    
    public List<Factura> obtenerTodos() throws SQLException{
        con = new Conectar();
        PreparedStatement stat = null;
        ResultSet rs = null;
        List<Factura> factura = new ArrayList<>();
        
        
        Connection conn = DriverManager.getConnection(con.getUrl(),con.getUsuario(),con.getPassword()); 
        
        try{
            stat = conn.prepareStatement(GETALL);
            rs = stat.executeQuery();
            while(rs.next()){
                factura.add(convertir(rs));
                
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
        return factura;
    }

    public Factura obtener(String id) throws SQLException{
        con = new Conectar();
        PreparedStatement stat = null;
        ResultSet rs = null;
        Factura f = new Factura();
        
        Connection conn = DriverManager.getConnection(con.getUrl(),con.getUsuario(),con.getPassword());
        
        try{
            stat = conn.prepareStatement(GETONE);
            stat.setString(1, id);
            rs = stat.executeQuery();
            if(rs.next()){
                //e.convertir(rs);                
                f.setRazonSocial(rs.getString("RazonSocial"));
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
        return f;
    }
    
    public String getNroFactura() {
        return nroFactura;
    }

    public void setNroFactura(String nroFactura) {
        this.nroFactura = nroFactura;
    }

    public String getID_Factura() {
        return ID_Factura;
    }

    public void setID_Factura(String ID_Factura) {
        this.ID_Factura = ID_Factura;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public double getIGV() {
        return IGV;
    }

    public void setIGV(double IGV) {
        this.IGV = IGV;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
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

    
    
    
    
    
    
}
