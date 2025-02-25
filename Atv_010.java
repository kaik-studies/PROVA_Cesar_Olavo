package OLAVO;

// Para esta última questão, eu criei a Interface IVoador.

public class Atv_010 {
	Morcego MeuMorcego;
	Ave MinhaAve;
	public static void main(String[] args) {
		
		Atv_010 q10 = new Atv_010();
		q10.MinhaAve = new Ave();
		q10.MeuMorcego = new Morcego();
		q10.MeuMorcego.Nome = "Stewart";
		q10.MinhaAve.Nome = "Bartt";
		q10.MeuMorcego.Voar();
		q10.MinhaAve.Voar();
		Animal Animal1 = new Morcego();
		Animal1.Nome = "Pedrim";
    
		// [C] : Os métodos acima herdam de ambos. Posso implementar-lhes de forma sagaz,
		// Não havendo brechas para perderem nenhum método, com exceção de Animal1.
		// Abaixo, os objetos Momorciego e Avave só podem executar métodos de Ivoador.
		IVoador Momorciego = new Morcego();
    
		IVoador Avave = new Ave();
		Avave.Voar();
		Momorciego.Voar();
		}

}

class Morcego extends Mamifero implements IVoador {

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Voar() {
		// TODO Auto-generated method stub
		System.out.println("O morcego " + Nome + " está voando!");
	}
	
}

class Ave extends Animal implements IVoador {

	@Override
	public void Voar() {
		// TODO Auto-generated method stub
		System.out.println("A ave " + Nome + " está voando!");
	}

	@Override
	public void emitirSom() {
		// TODO Auto-generated method stub
		
	}
	
}

/* [B] : Animal1 (Morcego) herda as capacidades da classe Animal. 
 * O mesmo vale para Animal 2 (Ave). Voador1 e Voador2,  por outro lado,
 * implementam os métodos da interface IVoador.
 * 
 * [A] : Um objeto (Animal1) da classe Morcego é criado. Ele aparenta herdar 
 * da classe Animal, podendo iterar seus métodos. Em seguida, 
 * Um objeto (Animal2) da classe Ave é criado, ela aparenta também herdar da classe Animal,
 * também podendo iterar seus métodos. - Após a criação destes 2 objetos da classe Animal,
 * são criados dois objetos que hão de implementar somente os métodos da Interface IVoador.
 * Os objetos em questão sendo Voador1 e Voador2, mesmo que um seja um objeto da 
 * Classe Morcego, ele somente instância comandos da Interface IVoador. O mesmo pra Voador2.
 *
 * [D] : Do lado esquerdo dita o que se há no lado direito. A exemplo, IVoador, a Interface
 * é usada na criação de Voador1 e Voador2, sendo estes dois objetos limitados aos métodos 
 * desta Interface. Voador1 é um Voador, somente isso. Mesmo que Voador1 seja criado como
 * um objeto da classe/tipo Morcego. O mesmo vale para Voador2, que é uma Ave. 
 */
