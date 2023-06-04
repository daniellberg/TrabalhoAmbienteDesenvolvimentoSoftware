package trab;

public class Cachorro {

    public void come() {
        System.out.println("Comendo");
    }

    public void bebeAgua() {
        System.out.println("Bebendo...");
    }

    // chama métodos de outras classes

    public void chamaSom(Gato cachorro) {
        cachorro.fazSom();
    }

    public void chamaBebeAgua(Gato cachorro) {
        cachorro.dorme();
    }

    public void chamaBrinca(Papagaio cachorro) {
        cachorro.brinca();
    }

    public void chamaFazNecessidade(Papagaio cachorro) {
        cachorro.fazNecessidades();
    }
}
