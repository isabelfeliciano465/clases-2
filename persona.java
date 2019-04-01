public class persona{
    private  String nombre; 
    private  char sexo;
    private  String rfc;
    private  double altura;
    private  double peso;
    private  int edad;


    public int calcularImc(){
        double imc = peso / Math.pow(altura,2);
        int res =0;
        if (imc < 20){
            res =1;
        }else if (imc >=20 && imc <=25){
            res =0;
        }else{
            res = 1;
        }
        return res;
    }

    public boolean esMayordeEdad(){
        boolean mayor = false; 
        if (edad >=18)
            mayor = true;
         return true;
    }

    public toString(){
        System .out.println("Nombre" + nombre +
                            "\n sexo:" + sexo +
                            "\n RFC:" + rfc +
                            "\n peso:" + peso +
                            "\n altura" + altura +
                            "\n edad" + adad);
        
    }

    public static viod main (String[]args){
        persona persona1 = new  persona();
        System.out.println("ingresa tu nombre");
        Scanner scanner = new Scanner(System.in);
        String n = Scanner.next()
        
        public void setnombre(String nombre){
            this.nombre = nombre;
        }

        public String getnombre();{
            return nombre;
        }

        public String setPeso(String peso){
            this.peso = peso;
        }



    }

    

     
}

    
