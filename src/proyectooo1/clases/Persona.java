
package proyectooo1.clases;

import java.io.Serializable;

public abstract class Persona implements Serializable{
    
 private int codigo;
    private String nombre;
    private String apellido;
    private String correo;
    private String genero;
    private String usuario;
    private String password;

    
    
    public Persona(int codigo, String nombre, String apellido, String correo, String genero, String usuario, String password) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.genero = genero;
        this.usuario = usuario;
        this.password = password;
    }

    public Persona(int codigo, String nombre, String apellido, String correo, String genero) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.genero = genero;
    }

    public Persona(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

  
    

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return this.correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getUsuario() {
        return this.usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
 
}