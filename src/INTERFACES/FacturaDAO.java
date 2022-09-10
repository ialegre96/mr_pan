
package INTERFACES;

import Clases.Factura;
import java.sql.SQLException;
import java.util.List;

public interface FacturaDAO {
    
    public void insertar(Factura f) throws SQLException;
    public void editar(Factura f) throws SQLException;
    public void eliminar(Factura f) throws SQLException;
    public List<Factura> obtenerTodos() throws SQLException;
    
}
