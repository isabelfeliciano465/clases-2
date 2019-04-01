class Rectangulo{
     //atributos
     double largo;
     double alto;
     //constructor SOBRECARGA
     Rectangulo(){}

     Rectangulo(double alto){}

     Rectangulo(int largo){}
    

     Rectangulo(double alto, double largo){
         this.alto=alto;
         this.largo=largo;
     }
     //metodos

    public duble getlargo(){
    return largo;
    }
    public duble getalto(){
    return alto;

    public setlargo(double largo){
        this.largo=largo;
    }

    public setAlto(double Alto){
        this.Alto=Alto;
    }

    public double calcularArea(){
        return largo * alto;
    }

    public estatic void main (String[]args){
        Rectangulo rec1 = new Rectangulo(10,20);
    }

    //rec1.setAlto(10);
    //rec2.setLargo(20);

    System.out.println("el area es" + rec1.calcularArea()
}

