package Atividade5;

class Gorila extends Animal {
    public Gorila(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Gorila: Uhh Uhh Uhh");
    }
}