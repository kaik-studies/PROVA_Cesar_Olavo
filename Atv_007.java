package OLAVO;

public class Atv_007 {
	
	public static void main(String[] args) {
		
		Domesticavel[] domesticaveis = new Domesticavel[2];
		domesticaveis[0] = new Cachorro2();
		domesticaveis[1] = new Robo();
		
		for (Domesticavel domesticavel : domesticaveis) {
			domesticavel.executarComando();
		}
	}
	
}
