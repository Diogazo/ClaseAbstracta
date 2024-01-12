package puce.abstracta;

public class Cuadrado extends FiguraGeometrica {
    private double lado;

    public Cuadrado(String nombre, double lado) {
        super(nombre);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return Math.pow(this.lado, 2);
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }
}