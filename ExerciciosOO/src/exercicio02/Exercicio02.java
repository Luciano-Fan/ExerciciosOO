package exercicio02;

public class Exercicio02 {
    public static void main(String[] args) {

        Triangulo t1 = new Triangulo(3,5);
        Triangulo t2 = new Triangulo(4,2);
        Triangulo t3 = new Triangulo(5,7);

        System.out.println("Area do triangulo 1: " + t1.calculaArea());
        System.out.println("Area do triangulo 2: " + t2.calculaArea());
        System.out.println("Area do triangulo 3: " + t3.calculaArea());



    }
}
