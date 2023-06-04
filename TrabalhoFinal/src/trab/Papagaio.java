package trab;

public class Papagaio {
    public void brinca() {
        System.out.println("Brincando...");
    }

    public void fazNecessidades() {
        System.out.println("Fazendo necessidades...");
    }

    // metodo implementado por outro participante

    public void movimenta() {
        System.out.println("Se movimentando...");
    }

    /// chama metodos de outras classes

    public void chamaComer(Cachorro papagaio) {
        papagaio.come();
    }

    public void chamaBebeAgua(Cachorro papagaio) {
        papagaio.bebeAgua();
    }

    public void chamaSom(Gato papagaio) {
        papagaio.fazSom();
    }

    public void chamaDorme(Gato papagaio) {
        papagaio.dorme();
    }

    public void chamaAcorda (Cachorro papagaio) {
        papagaio.acorda();
    }

    public void chamaCoceira (Gato papagaio) {
        papagaio.coceira();
    }
}
