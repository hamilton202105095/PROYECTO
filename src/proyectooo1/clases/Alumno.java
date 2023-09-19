
package proyectooo1.clases;


public class Alumno extends Persona {
    
    public Alumno(int codigo, String nombre, String apellido, String correo, String genero, String usuario, String password) {
        super(codigo, nombre, apellido, correo, genero, usuario, password);
    }

    public Alumno(int codigo, String nombre, String apellido, String correo, String genero) {
        super(codigo, nombre, apellido, correo, genero);
    }

    public Alumno(String usuario, String password) {
        super(usuario, password);
    }
    
     public Alumno(int codigo, String nombre, String apellido, String correo, String genero,String password ) {
        super(codigo, nombre, apellido, correo, genero, String.valueOf(codigo), password); // Contraseña por defecto: "1234"
    }
    
}
