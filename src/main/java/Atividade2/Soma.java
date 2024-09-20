package Atividade2;

public class Soma {

    public int somar(int a, int b) {
        return a + b;
    }

    public double somar(double a, double b) {
        return a + b;
    }

    public int somar(int... numeros) {
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        return soma;
    }

    public double somar(double... numeros) {
        double soma = 0.0;
        for (double num : numeros) {
            soma += num;
        }
        return soma;
    }

    public static void main(String[] args) {
        Soma s = new Soma();
        System.out.println("Soma de inteiros: " + s.somar(2, 3));
        System.out.println("Soma de decimais: " + s.somar(2.5, 3.5));
        System.out.println("Soma de multiplos inteiros: " + s.somar(1, 2, 3, 4, 5));
        System.out.println("Soma de multiplos decimais: " + s.somar(1.1, 2.2, 3.3));
    }
}