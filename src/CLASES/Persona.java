
package Clases;

public abstract class Persona {
    
    //Atributos
    protected String nombre;    
    protected String genero;
    protected String DNI;
    protected String telefono;
    protected String distrito;
    protected String direccion;
    
    public Persona(){}
    //Constructor

    public Persona(String nombre, String genero, String DNI, String telefono, String distrito, String direccion) {
        this.nombre = nombre;
        this.genero = genero;
        this.DNI = DNI;
        this.telefono = telefono;
        this.distrito = distrito;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", genero=" + genero + ", DNI=" + DNI + ", telefono=" + telefono + ", distrito=" + distrito + ", direccion=" + direccion + '}';
    }   

    //Setter y getter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    
}
