package Atividade4;

public class Main {
    public static void main(String[] args) {
        Contribuinte contribuinte = new Contribuinte();
        
        contribuinte.setSalario(2500);
        
        double inss = contribuinte.calcularINSS();
        double salarioFinal = contribuinte.calcularSalarioFinal();
        
        System.out.println("Valor do INSS descontado: " + inss);
        System.out.println("Salario final apos desconto: " + salarioFinal);
    }
}