
    package proyectooo1.clases;

    import java.util.ArrayList;

    public class Admin extends Persona{



        private static ArrayList<Profesor> profesores = new ArrayList<>();
        private static ArrayList<Alumno> alumnos = new ArrayList<>();
        private static ArrayList<Curso> cursos = new ArrayList<>();

        public Admin(String usuario, String password) {
            super(usuario, password);
        }

     public static ArrayList<Profesor> getprofesores() {
            return profesores;
        }

      public static void setprofesor(ArrayList<Profesor> profesores) {
            Admin.profesores = profesores;
        }

        public static ArrayList<Alumno> getAlumnos() {
            return alumnos;
        }

        public static void setAlumnos(ArrayList<Alumno> alumnos) {
            Admin.alumnos = alumnos;
        }

        public static ArrayList<Curso> getCursos() {
            return cursos;
        }

        public static void setCursos(ArrayList<Curso> cursos) {
            Admin.cursos = cursos;
        }

    }