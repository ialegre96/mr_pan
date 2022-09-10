
package INTERFACES;

import Clases.Empleado;
import java.sql.SQLException;
import java.util.List;

public interface EmpleadoDAO {
    
    public void insertar(Empleado e) throws SQLException;
    public void editar(Empleado e) throws SQLException;
    public void eliminar(Empleado e) throws SQLException;
    public List<Empleado> obtenerTodos() throws SQLException;
    
}
