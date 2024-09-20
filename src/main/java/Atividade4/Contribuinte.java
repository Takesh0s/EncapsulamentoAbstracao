package Atividade4;

public class Contribuinte {
    private double salario;
    
    public double getSalario() {
        return salario;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public double calcularINSS() {
        double inss = 0.0;

        if (salario <= 1412) {
            inss = salario * 0.075;
        } else if (salario <= 2666.68) {
            inss = (1412 * 0.075) + ((salario - 1412) * 0.09);
        } else if (salario <= 4000.03) {
            inss = (1412 * 0.075) + ((2666.68 - 1412) * 0.09) + ((salario - 2666.68) * 0.12);
        } else if (salario <= 7786.02) {
            inss = (1412 * 0.075) + ((2666.68 - 1412) * 0.09) + ((4000.03 - 2666.68) * 0.12) + ((salario - 4000.03) * 0.14);
        } else {
            inss = (1412 * 0.075) + ((2666.68 - 1412) * 0.09) + ((4000.03 - 2666.68) * 0.12) + ((7786.02 - 4000.03) * 0.14);
        }
        
        return inss;
        
    }
    
    public double calcularSalarioFinal() {
        double inss = calcularINSS();
        return salario - inss; 
    }
}