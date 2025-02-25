package OLAVO;

public class Atv_003 {
public static void main(String[] args) {
	Cachorro c1 = new Cachorro();
	c1.emitirSom();
}
}
class Cachorro extends Mamifero {
    String Raca;
    String Nome; 

    public void emitirSom() {
        System.out.println("Au Au!");
    }
}
