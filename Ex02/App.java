package Faculdade_POO.Ex2;

public class App {
    public static void main(String[] args) {
        Gato gato = new Gato();
        gato.emitirSom();
        gato.respirar();
    }
}

abstract class Animal {
    abstract void emitirSom();

    public void respirar() {
        System.out.println("Está respirando");
    }
}

class Gato extends Animal {

    @Override
    void emitirSom() {
        System.out.println("Miau");
    }

}