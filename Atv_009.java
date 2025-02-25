package OLAVO;

class Cachorro3 extends Mamifero2 implements Domesticavel {
    String Raca;
    String Nome; 

    public void emitirSom() {
        System.out.println("Au Au!");
    }

    @Override
    public void executarComando() {
        System.out.println(Nome + " está executando o comando: " + Comando + ".");
    }
    public void movimentar() {
    	System.out.println(Nome + " está se deslocando!");
    }
}

class robo01 implements Domesticavel {
    String ID;

    public String getID() {
        return ID;
    }

    public void executarComando() {

        System.out.println(ID + " está executando o comando: " + Comando + ".");
    }
    public void movimentar() {
    	System.out.println(ID + " está se deslocando!");
    }
}

public class Atv_009 {
public static void main(String[] args) {
	Cachorro3 c3 = new Cachorro3();
	robo01 r3 = new robo01();
	c3.Nome = "Lucca";
	c3.movimentar();
	r3.ID = "7755443321";
	r3.movimentar();
}
}

abstract class Animal2 {
	String Nome;
	
	public String getNome() {
		return Nome;
	}
	 public void setNome(String newname) {
			this.Nome = newname;
		}
	 public abstract void emitirSom();
	 
	 public abstract void movimentar();
}
class Mamifero2 extends Animal2 {
	String tipoPelo;
	public void emitirSom() {
		System.out.println("Som de mamifero");
	}
	public void movimentar() {
		// TODO Auto-generated method stub
		
	}
}
