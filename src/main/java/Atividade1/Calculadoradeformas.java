package Atividade1;

public class Calculadoradeformas {

    public double calcularArea(double lado) {
        return lado * lado;
    }

    public double calcularArea(double largura, double altura) {
        return largura * altura;
    }

    public double calcularArea(double raio, boolean ehCirculo) {
        if (ehCirculo) {
            return Math.PI * raio * raio;
        }
        throw new IllegalArgumentException("Parametro invalido para calculo de circulo");
    }

    public static void main(String[] args) {
        Calculadoradeformas calc = new Calculadoradeformas();
        System.out.println("Area do quadrado: " + calc.calcularArea(5));
        System.out.println("Area do retangulo: " + calc.calcularArea(5, 10));
        System.out.println("Area do circulo: " + calc.calcularArea(7, true));
    }
}