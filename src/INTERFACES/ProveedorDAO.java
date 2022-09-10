
package INTERFACES;

import CLASES.Proveedor;
import java.sql.SQLException;
import java.util.List;

public interface ProveedorDAO {
    
    public void insertar(Proveedor p) throws SQLException;
    public void editar(Proveedor p) throws SQLException;
    public void eliminar(Proveedor p) throws SQLException;
    public List<Proveedor> obtenerTodos() throws SQLException;
    
}
