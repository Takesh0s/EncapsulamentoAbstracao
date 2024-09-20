package Atividade5;

class CamaraoPistola extends Animal {
    public CamaraoPistola(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Camarao: *estalo a 4700 graus celsius*");
    }
}