import java.util.*;

public class Persona1{
    private boolean genFemenino;
    private String nombre;

    Persona1(){}
    Persona1(boolean genFemenino, String nombre){
        this.genFemenino = genFemenino;
        this.nombre = nombre;
    }

    public boolean isGenero() {
        return genFemenino;
    }

    public void setGenero(boolean genFemenino) {
        this.genFemenino = genFemenino;
    }
    
    public boolean isGenFemenino() {
        return genFemenino;
    }

    public void setGenFemenino(boolean genFemenino) {
        this.genFemenino = genFemenino;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    public static void main(String[] args){
		Estudiante1 Estudiante1 = new Estudiante1();
		Estudiante1 Estudiante2 = new Estudiante1(4,3,"lupe");
        Estudiante1 Estudiante3 = new Estudiante1(6,8,true,"si","jenni");
        
        Profesor Profesor1 = new Profesor1();
        Profesor Profesor2 = new Profesor1(20,5);
        Profesor Profesor3 = new Profesor1(100,5,true,"si","lupe");

    }

}
