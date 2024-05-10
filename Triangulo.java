import java.lang.Math;

public class Triangulo {
    private double base;
    private double altura;

    public double area(double base, double altura){
        return (base * altura) / 2;
    }
    public double perimetro(double base, double altura){
        double lado = Math.sqrt(Math.pow(base, 2)+Math.pow(altura, 2));
        return lado+base+altura;
    }
}
