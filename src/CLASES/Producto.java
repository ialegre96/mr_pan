
package Clases;

import CONEXION.Conectar;
import INTERFACES.ProductoDAO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Producto implements ProductoDAO{
    
    //Atributos
    private String ID_Producto;
    private String nombre;    
    private int stock;
    private double precio_unitario;
    private double gastoTotal;
    private String ID_Proveedor;
    
    private Conectar con;
    
    //Consultas de BD
    final String INSERT = "INSERT INTO Producto(ID_Producto, NomProducto, Precio, Stock, GastoTotal, ID_Proveedor) VALUES (?,?,?,?,?,?)";
    final String UPDATE = "UPDATE Producto SET NomProducto = ?, Precio = ?, Stock = ?, GastoTotal = ?, ID_Proveedor = ? WHERE ID_Producto = ?";
    final String DELETE = "DELETE FROM Producto WHERE ID_Producto = ?";
    final String GETALL = "SELECT ID_Producto, NomProducto, Precio, Stock, GastoTotal, ID_Proveedor FROM Producto";
    final String GETONE = "SELECT * FROM Producto WHERE ID_Producto = ?";
    
    //Constructor
    public Producto(){}
    
    public Producto(String ID_Producto, String nombre, int stock, double precio_unitario, double gastoTotal, String ID_Proveedor) {
        this.ID_Producto = ID_Producto;
        this.nombre = nombre;
        this.stock = stock;
        this.precio_unitario = precio_unitario;
        this.gastoTotal = gastoTotal;
        this.ID_Proveedor = ID_Proveedor;
    }
    
   //Métodos
    @Override
    public void insertar(Producto pr) throws SQLException{    
        con = new Conectar();
        PreparedStatement stat = null;       
        
        Connection conn = DriverManager.getConnection(con.getUrl(),con.getUsuario(),con.getPassword());  
        
        
        
        try{
            
            stat = conn.prepareStatement(INSERT);
            
            
            
            stat.setString(1, pr.getID_Producto());
            stat.setString(2, pr.getNombre()); 
            stat.setDouble(3, pr.getPrecio_unitario());
            stat.setInt(4, pr.getStock());
            pr.setGastoTotal(pr.getStock()*pr.getPrecio_unitario());
            stat.setDouble(5 , pr.getGastoTotal());
            stat.setString(6, pr.getID_Proveedor());
            
            
            JOptionPane.showMessageDialog(null, "Datos ingresados correctamente","Mensaje",JOptionPane.INFORMATION_MESSAGE);
            if(stat.executeUpdate() == 0){
                System.out.println("Es probable que no se haya guardado.");
            }
            
            
        }catch(Exception e){
            System.out.println("Error: Insertar "+e.getMessage());
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
    public void editar(Producto pr) throws SQLException{
        con = new Conectar();
        PreparedStatement stat = null;
        
        Connection conn = DriverManager.getConnection(con.getUrl(),con.getUsuario(),con.getPassword());
        //pr.setGastoTotal(pr.getStock()*pr.getPrecio_unitario());
        try{
            stat = conn.prepareStatement(UPDATE);   
            
           
            
            stat.setString(1, pr.getNombre()); 
            stat.setDouble(2, pr.getPrecio_unitario());
            stat.setInt(3, pr.getStock());            
            stat.setDouble(4 , pr.getGastoTotal());
            stat.setString(5, pr.getID_Proveedor());            
            stat.setString(6, pr.getID_Producto());
            
            
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
    public void eliminar(Producto pr) throws SQLException{
        con = new Conectar();
        PreparedStatement stat = null;
        
        Connection conn = DriverManager.getConnection(con.getUrl(),con.getUsuario(),con.getPassword());
        
        try{
                stat = conn.prepareStatement(DELETE);
                stat.setString(1, pr.getID_Producto());
                if(stat.executeUpdate()==0){
                    System.out.println("Puede que el producto no se haya borrado");
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
    
    private Producto convertir(ResultSet rs) throws SQLException{
        
        con = new Conectar();
        
        String id = rs.getString("ID_Producto");
        String nombre = rs.getString("NomProducto");
        double precio = rs.getDouble("Precio");
        int stock = rs.getInt("Stock");
        String id_proveedor = rs.getString("ID_Proveedor");
        
        Producto producto = new Producto();// new Cliente(id, nombre, genero, dni, ruc, direccion, telefono, distrito);
        
        producto.setID_Producto(id);
        producto.setNombre(nombre);
        producto.setPrecio_unitario(precio);
        producto.setStock(stock);
        producto.setGastoTotal(precio*stock);
        producto.setID_Proveedor(id_proveedor);
        
        
        return producto;
    }
    
    @Override
    public List<Producto> obtenerTodos() throws SQLException{
        con = new Conectar();
        PreparedStatement stat = null;
        ResultSet rs = null;
        List<Producto> producto = new ArrayList<>();
        
        
        Connection conn = DriverManager.getConnection(con.getUrl(),con.getUsuario(),con.getPassword()); 
        
        try{
            stat = conn.prepareStatement(GETALL);
            rs = stat.executeQuery();
            while(rs.next()){
                producto.add(convertir(rs));
                
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
        return producto;
    }
    
    public Producto obtener(String id) throws SQLException{
        con = new Conectar();
        PreparedStatement stat = null;
        ResultSet rs = null;
        Producto pr = new Producto();
        
        Connection conn = DriverManager.getConnection(con.getUrl(),con.getUsuario(),con.getPassword());
        
        try{
            stat = conn.prepareStatement(GETONE);
            stat.setString(1, id);
            rs = stat.executeQuery();
            if(rs.next()){
                //pr.convertir(rs);
                pr.setID_Producto(rs.getString("ID_Producto"));
                pr.setNombre(rs.getString("NomProducto"));
                pr.setPrecio_unitario(rs.getDouble("Precio"));
            }else{
                System.out.println("No se ha encontrado ese registro. Producto");
            }
        }catch(Exception e){
            System.out.println("Mensaje: OBTENER producto "+e.getMessage());
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
        return pr;
    }

    public String getID_Producto() {
        return ID_Producto;
    }

    public void setID_Producto(String ID_Producto) {
        this.ID_Producto = ID_Producto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public String getID_Proveedor() {
        return ID_Proveedor;
    }

    public void setID_Proveedor(String ID_Proveedor) {
        this.ID_Proveedor = ID_Proveedor;
    }

    public double getGastoTotal() {
        return gastoTotal;
    }

    public void setGastoTotal(double gastoTotal) {
        this.gastoTotal = gastoTotal;
    }
    
}
