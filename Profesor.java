import java.util.*;

public class Profesor1 extends PersonaP{

    private int Nalumnos;
    private int Carrera;

    Profesor1(){}
    Profesor1(int Nalumnos, int Carrera){}
    Profesor1(int Nalumnos, int Carrera, boolean genero, String nombre){
        super(genero,nombre);
        this.Nalumnos = Nalumnos;
        this.Nalumnos = Nalumnos;
    }


    public int getNalumnos() {
        return Nalumnos;
    }

    public void setNalumnos(int nalumnos) {
        Nalumnos = nalumnos;
    }

    public int getCarrera() {
        return Carrera;
    }

    public void setCarrera(int Carrera) {
        Carrara = Carrara;
    }
    


}