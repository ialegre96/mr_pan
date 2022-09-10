
package INTERFACES;

import Clases.Boleta;
import java.sql.SQLException;
import java.util.List;


public interface BoletaDAO {
    
    public void insertar(Boleta b) throws SQLException;
    public void editar(Boleta b) throws SQLException;
    public void eliminar(Boleta b) throws SQLException;
    public List<Boleta> obtenerTodos() throws SQLException;
    
}
