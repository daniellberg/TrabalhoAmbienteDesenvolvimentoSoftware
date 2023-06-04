package trab;

public class Cachorro {

    public void come() {
        System.out.println("Comendo");
    }

    public void bebeAgua() {
        System.out.println("Bebendo...");
    }

    // metodo implementada por outro participante

    public void acorda (){
        System.out.println("Acordando...");
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

    public void chamaCoceira (Gato cachorro) {
        cachorro.coceira();
    }

    public void chamaMovimento (Papagaio cachorro) {
        cachorro.movimenta();
    }
}
