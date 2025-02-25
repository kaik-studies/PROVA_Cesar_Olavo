package OLAVO;


class Cachorro8 extends Mamifero implements Domesticavel {
    String Raca;
    String Nome; 
    String tipoPelo;
    public String toString() {
    	System.out.println("[Nome do Cachorro]: " + Nome + ". [Raça]: " + Raca + ". [pelo]: " + tipoPelo + ".");
		return Nome;
    }
    public void emitirSom() {
        System.out.println("Au Au!");
    }

    @Override
    public void executarComando() {
        System.out.println(Nome + " está executando o comando: " + Comando + ".");
    }
}
    
public class Atv_008 {
public static void main(String[] args) {
	Cachorro8 c2 = new Cachorro8();
	c2.Nome = "Tobbey";
	c2.Raca = "Dobberman";
	c2.tipoPelo = "Pelugem curta";
	c2.toString();
}
}
