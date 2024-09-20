package Atividade5;

class LagostaBoxeadora extends Animal {
    public LagostaBoxeadora(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Lagosta: *punch*");
    }
}