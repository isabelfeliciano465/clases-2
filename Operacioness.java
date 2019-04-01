public class Operacioness{
    private double A;
    private double B;

    public set A1 (double);{
        this.n1=n1;
    }

    public get B2 ();{
        return B2;
    }

    public set B2 (double B){
        this. B2=B2;
    }

    public get A1 ();{
        return A1;
    }

    public double sumarNumeros();{
        return A1 + B2;
    }

    public double restarNumeros ();{
        return A1 - B2;
    }


    public double MultiplicarNumeros ();{
        return A1 * B2;
    }

    public double dividirNumeros ();{
        return A1 / B2;
    }

    public static void main (String []args){
        Operacioness O=new Operacioness();
    }

    Scanner scanner = new Scanner(System.in){
        int opc = O;
    }

    System.out.println ("numero A1");
    o.n A=Scanner.next double();

    System.out.println ("numero B2");
    o.n B=Scanner.next double();

    While (opc!=2){

    }

    System.out.println("sumar \n 2 restar \n 3 Multiplicar \n 4 Dividir ");
    opc=Scanner.next int ();

    Switch (opc){

        case 1:
        System.out.println(O.sumar A1 B2());
        break;

        case 2:
        System.out.println(O.restar A1 B2());
        break;

        case 3:
        System.out.println(O.Multiplicar A1 B2());
        break;

        case 4:
        System.out.println(O.Dividir A1 B2());
        break;

        default;
        System.out.println("resultados");
        break;
    }


}