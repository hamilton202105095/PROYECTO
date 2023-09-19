
package proyectooo1.clases;

import java.io.Serializable;

public class Curso implements Serializable{
    private int codigoCurso;
    private String nombreCurso;
    private int creditosCurso;
    private String profesorCurso;

    public Curso(int codigoCurso, String nombreCurso, int creditosCurso, String profesorCurso) {
        this.codigoCurso = codigoCurso;
        this.nombreCurso = nombreCurso;
        this.creditosCurso = creditosCurso;
        this.profesorCurso = profesorCurso;
    }
    
    public int getCodigoCurso() {
        return this.codigoCurso;
    }

    public void setCodigoCurso(int codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public String getNombreCurso() {
        return this.nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCreditosCurso() {
        return this.creditosCurso;
    }

    public void setCreditosCurso(int creditosCurso) {
        this.creditosCurso = creditosCurso;
    }

    public String getProfesorCurso() {
        return this.profesorCurso;
    }

    public void setProfesorCurso(String profesorCurso) {
        this.profesorCurso = profesorCurso;
    }
    
    
}