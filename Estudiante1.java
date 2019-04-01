import java.util.*;

public class Estudiante1 extends Persona1{

    private int Clases;
    private int Cuatri;

    Estudiante1(){}
    Estudiante1(int Clases, int cuatri, String Nombre){}
    Estudiante1(int Clases, int cuatri, boolean genero, String nombre){
        super(genero, nombre);
        this.Clases = Clases;
        this.cuatri = cuatri;
    }


    public int getClases() {
        return Clases;
    }


    public void setClases(int Clases) {
        Clases = clases;
    }

    public int getcuatri() {
        return cuatri;
    }

    public void setcuatri(int cuatri) {
        cuatri = cuatri;
    }

    
    
}