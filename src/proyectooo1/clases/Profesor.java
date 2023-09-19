package proyectooo1.clases;

import javax.swing.ImageIcon;



public class Profesor extends Persona {
    
    public Profesor(int codigo, String nombre, String apellido, String correo, String genero, String usuario, String password, ImageIcon foto) {
        super(codigo, nombre, apellido, correo, genero, usuario, password);
    }
 
      public Profesor(int codigo, String nombre, String apellido, String correo, String genero) {
        super(codigo, nombre, apellido, correo, genero);
    }

    public Profesor(int codigo, String nombre, String apellido, String correo, String genero,String password ) {
        super(codigo, nombre, apellido, correo, genero, String.valueOf(codigo), password); // Contraseña por defecto: "1234"
    }
      
 
    
}
