import java.util.*;


public class Student{
    private  String courseName;
    private String[] nombre = new String [100];
    private String[] a_paterno = new String [100];
    private String[] a_materno = new String [100];
    private String[] anio_nacimiento = new String [100];
    private String[] correo = new String [100];
    private int numberOfNameStudents, numberOfa_paternoStudents, numberOfa_maternoStudents, numberOfanio_nacimientoStudents, numberOfcorreoStudents;

    public void addNombre(String nombres){
        nombre[numberOfNameStudents] = nombres;
        numberOfNameStudents++;
    }

    public void deletNombre(String nombres){
        nombre[numberOfNameStudents] = nombres;
        numberOfNameStudents--;
    }

    public String[] getNombre() {
        return nombre;
    }
    public int getNumberOfNameStudents() {
        return numberOfNameStudents;
    }

    //----------------------------------------------------
    public void addApaterno(String Apaternos){
        a_paterno[numberOfa_paternoStudents] = Apaternos;
        numberOfa_paternoStudents++;
    }

    public void deletApaterno(String Apaternos){
        a_paterno[numberOfa_paternoStudents] = Apaternos;
        numberOfa_paternoStudents--;
    }

    public String[] getApaterno() {
        return a_paterno;
    }
    public int getNumberOfApaternoStudents() {
        return numberOfa_paternoStudents;
    }

    //----------------------------------------------------
    public void addAmaterno(String Amaternos){
        a_materno[numberOfa_maternoStudents] = Amaternos;
        numberOfa_maternoStudents++;
    }

    public void deletAmaterno(String Amaterno){
        a_materno[numberOfa_maternoStudents] = Amaterno;
        numberOfa_maternoStudents--;
    }

    public String[] getAmaterno() {
        return a_materno;
    }
    public int getNumberOfAmaternoStudents() {
        return numberOfa_maternoStudents;
    }
    
    //----------------------------------------------------
    public void addAnio_nacimiento(String anio_nacimientos){
        anio_nacimiento[numberOfanio_nacimientoStudents] = anio_nacimientos;
        numberOfanio_nacimientoStudents++;
    }

    public void deletAnio_nacimiento(String anio_nacimientos){
        anio_nacimiento[numberOfanio_nacimientoStudents] = anio_nacimientos;
        numberOfanio_nacimientoStudents--;
    }

    public String[] getAnio_nacimiento() {
        return anio_nacimiento;
    }
    public int getNumberOfAnio_nacimientoStudents() {
        return numberOfanio_nacimientoStudents;
    }
    
    
    //----------------------------------------------------
    public void addCorreo(String correos){
        correo[numberOfcorreoStudents] = correos;
        numberOfcorreoStudents++;
    }

    public void deletCorreos(String correos){
        correo[numberOfcorreoStudents] = correos;
        numberOfcorreoStudents--;
    }

    public String[] getcorreo() {
        return correo;
    }
    public int getNumberOfcorreoStudents() {
        return numberOfcorreoStudents;
    }
    
    public static void main(String[] args) {
        Estudiante c1= new Estudiante();
        Scanner scan = new Scanner(System.in);

        int opc=0;
        while (opc!=6){

            System.out.println("-----MENU------");
            System.out.println("1 Nombre del curso");
            System.out.println("2 Agregar estudiante");
            System.out.println("3 Mostrar estudiante");
            System.out.println("4 Mostrar total de estudiante");
            System.out.println("5 Eliminar estudiante");
            System.out.println("6 Salir");
            opc = scan.nextInt();
            switch (opc){
                case 1:
                    System.out.println("Nombre de curso : ");
                    c1.courseName = scan.next();
                break;
                case 2:
                    System.out.println("Nombre de estudiante");
                    String a = scan.next();
                    c1.addNombre(a);
                    System.out.println("Apellido paterno");
                    String b = scan.next();
                    c1.addApaterno(b);
                    System.out.println("Apellido materno");
                    String c = scan.next();
                    c1.addAmaterno(c);
                    System.out.println("Año de nacimiento");
                    String d = scan.next();
                    c1.addAnio_nacimiento(d);
                    System.out.println("E-MAIL");
                    String e = scan.next();
                    c1.addCorreo(e);
                break;
                case 3:
                    System.out.println(c1.courseName);
                    for(int i=0; i < c1.getNumberOfNameStudents(); i++){
                    System.out.println("Nombre Estudiante "+(i+1)+": "+c1.nombre[i]);
                    System.out.println("Apellido Paterno Estudiante "+(i+1)+": "+c1.a_paterno[i]);
                    System.out.println("Apellido Materno Estudiante "+(i+1)+": "+c1.a_materno[i]);
                    System.out.println("Año de Nacimiento del estudiante "+(i+1)+": "+c1.anio_nacimiento[i]);
                    System.out.println("Correo Estudiante "+(i+1)+": "+c1.correo[i]);
                    System.out.println("-------------------------------------------------");
                    }

                break;
                case 4:
                    System.out.println("NUMERO TOTAL DE ESTUDIANTES REGISTRADOS: "+c1.getNumberOfNameStudents());
//                    System.out.println("NUMERO DE ESTUDIANTES: "+c1.getNumberOfApaternoStudents());
//                    System.out.println("NUMERO DE ESTUDIANTES: "+c1.getNumberOfAmaternoStudents());
//                    System.out.println("NUMERO DE ESTUDIANTES: "+c1.getNumberOfAnio_nacimientoStudents());
//                    System.out.println("NUMERO DE ESTUDIANTES: "+c1.getNumberOfcorreoStudents());
                break;
                case 5:
                    System.out.println("ELIMINANDO UN ESTUDIANTE......");
                    String ok = scan.next();
                        c1.deletNombre(ok);
                        c1.deletApaterno(ok);
                        c1.deletAmaterno(ok);
                        c1.deletAnio_nacimiento(ok);
                        c1.deletCorreos(ok);

                break;
                default: System.out.println("ADIOS");
                break;
            }
    }
    }
}
