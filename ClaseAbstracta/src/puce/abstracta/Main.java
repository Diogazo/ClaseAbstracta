package puce.abstracta;

public class Main {
    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo("Rectangulo 1", 7, 15);
        System.out.println(rectangulo1.toString());

        Rectangulo rectangulo2 = new Rectangulo("Rectangulo 2", 80, 10);
        System.out.println(rectangulo2.toString());

        if (rectangulo1.mayorQue(rectangulo2)) {
            System.out.println("El Mayor es:  " + rectangulo1.toString());
        } else {
            System.out.println("El mayor es: " + rectangulo2.toString());
        }

        Cuadrado cuadrado1 = new Cuadrado("Cuadrado 1", 5);
        System.out.println(cuadrado1.toString());

        Cuadrado cuadrado2 = new Cuadrado("Cuadrado 2", 10);
        System.out.println(cuadrado2.toString());

        if (cuadrado1.mayorQue(cuadrado2)) {
            System.out.println("El Mayor es:  " + cuadrado1.toString());
        } else {
            System.out.println("El mayor es: " + cuadrado2.toString());
        }

        Circulo circulo1 = new Circulo("Circulo 1", 5);
        System.out.println(circulo1.toString());

        Circulo circulo2 = new Circulo("Circulo 2", 10);
        System.out.println(circulo2.toString());

        if (circulo1.mayorQue(circulo2)) {
            System.out.println("El Mayor es:  " + circulo1.toString());
        } else {
            System.out.println("El mayor es: " + circulo2.toString());
        }
    }
}