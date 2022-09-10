
package INTERFACES;

import Clases.Cliente;
import java.sql.SQLException;
import java.util.List;

public interface ClienteDAO{
    
    public void insertar(Cliente c) throws SQLException;
    public void editar(Cliente c) throws SQLException;
    public void eliminar(Cliente c) throws SQLException;
    public List<Cliente> obtenerTodos() throws SQLException;
    
}
