package Atividade3;

public class Produto {
    private String nome;
    private String codigo;
    private double preco;

    public Produto(String nome, String codigo, double preco) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = preco;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Codigo: " + codigo);
        System.out.println("Preco: " + preco);
    }

    public void exibirInfo(boolean resumo) {
        if (resumo) {
            System.out.println("Nome: " + nome);
            System.out.println("Preco: " + preco);
        }
    }

    public static void main(String[] args) {
        Produto p = new Produto("Cadeira de Escritorio", "444J", 1490.99);
        p.exibirInfo();
        p.exibirInfo(true);
    }
}