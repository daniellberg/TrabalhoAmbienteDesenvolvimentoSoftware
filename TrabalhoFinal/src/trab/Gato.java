package trab;

public class Gato {

    public void fazSom(){
        System.out.println("Emitindo barulho...");
    }

    public void dorme(){
        System.out.println("Dormindo...");
    }

  //chama métodos de outras classes

  public void chamaComer (Cachorro gato){
   gato.come();
  }

  public void chamaBebeAgua (Cachorro gato){
    gato.bebeAgua();
   }

   public void chamaBrinca (Papagaio gato){
    gato.brinca();
   }

   public void chamaFazNecessidade (Papagaio gato){
    gato.fazNecessidades();
   }

    
}
