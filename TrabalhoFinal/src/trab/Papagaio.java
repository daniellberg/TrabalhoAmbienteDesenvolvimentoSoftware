package trab;

public class Papagaio {
    public void brinca() {
        System.out.println("Brincando...");
    }

    public void fazNecessidades() {
        System.out.println("Fazendo necessidades...");
    }

    ///chama metodos de outras classes

    public void chamaComer (Cachorro papagaio){
        papagaio.come();
       }
     
       public void chamaBebeAgua (Cachorro papagaio){
         papagaio.bebeAgua();
        }
     
        public void chamaSom (Gato papagaio){
         papagaio.fazSom();
        }
     
        public void chamaDorme (Gato papagaio){
         papagaio.dorme();
        }   
    }
