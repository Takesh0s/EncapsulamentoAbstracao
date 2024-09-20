package Atividade5;

public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Rex", 5);
        Animal gato = new Gato("Perola", 3);
        Animal camaraoPistola = new CamaraoPistola("Flash", 1);
        Animal lagostaBoxeadora = new LagostaBoxeadora("Rocky", 2);
        Animal gorila = new Gorila("King", 7);

        cachorro.exibirInfo();
        cachorro.emitirSom();
        
        System.out.println();

        gato.exibirInfo();
        gato.emitirSom();
        
        System.out.println();

        camaraoPistola.exibirInfo();
        camaraoPistola.emitirSom();
        
        System.out.println();

        lagostaBoxeadora.exibirInfo();
        lagostaBoxeadora.emitirSom();
        
        System.out.println();

        gorila.exibirInfo();
        gorila.emitirSom();
    }
}