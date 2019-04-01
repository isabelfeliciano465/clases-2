import java.util.Scanner
    class Calificaciones;
    private double promedio;{
    private int Numerocalificaciones;

    public void set promedio (double preomedio){
        this.promedio = promedio;
    }

    public void calcaularPromedio(double sumaria){
        promedio = promedio /numeroCalificaciones 
    }

    public static void main(String[]args){
        Calificacion = new calificacion();

        Scanner scanner = new Scanner (System.in);

        System.out.println("cuantas calificaciones vas")

        int n = Scanner.nextInt();

        c.SetNumeroCalificaciones(n);

        for(int i = 0; i < c.getNumeroCalificaciones(); i++){
            System.out.println("ingresa la calificacion" + (i +1))
            double aux = Scanner.nextDouble();
            sumatoria = sumatoria + aux;
        }

        c.calcular promedio(sumatoria);

        System.out.println("el promedio es" + c.getPromedio());

    } 
    
}
