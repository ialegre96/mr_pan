
package INTERFACES;

import Clases.Producto;
import java.sql.SQLException;
import java.util.List;

public interface ProductoDAO {
    
    public void insertar(Producto pr) throws SQLException;
    public void editar(Producto pr) throws SQLException;
    public void eliminar(Producto pr) throws SQLException;
    public List<Producto> obtenerTodos() throws SQLException;
    
}
