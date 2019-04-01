import java.util.*;

public class Rectangle1 extends geometricObject{
    //1.-atributos
    double width;
    double length;
    //2.-constructor SOBRECARGA
    Rectangle1(){}

    Rectangle1(double length,double width){}

    Rectangle1(double length, double width, String color, boolean filled){
        super(color,filled);
        this.length = length;
        this.width = width;

    }
    //3.-metodos
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }
    
    public double calcArea(){
        return width*length;
    }

    public double calcPer() {
        return  (2*(length+width));
    }


    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);


        System.out.println("Cuanto mide de alto : ");
        double width = scanner.nextDouble();
        System.out.println("Cuando mide de largo : ");
        double length = scanner.nextDouble();
        System.out.println("Que color va a tener");
        String color = scanner.toString();
        System.out.println("Quieres que tenga relleno");
        boolean filled = scanner.nextBoolean();
        if (filled= true) {
            Rectangle1 rec1 = new Rectangle1(width,length,color,filled);
    
            System.out.println("EL AREA ES DE : "+rec1.calcArea());
    
            System.out.println("EL PERIMETRO ES DE : "+rec1.calcPer());
    
            System.out.println("el color es : "+color);
    
            System.out.println("con relleno");
            
        }else{
        Rectangle1 rec1 = new Rectangle1(width,length,color,filled);

        System.out.println("EL AREA ES DE : "+rec1.calcArea());

        System.out.println("EL PERIMETRO ES DE : "+rec1.calcPer());

        System.out.println("EL COLOR ES DE : "+color);

        System.out.println("SIN RELLENO");
        }
    }

}