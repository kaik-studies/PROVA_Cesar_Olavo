package OLAVO;

class Atv_005 {
    Cachorro2 meuCachorro; 

    public static void main(String[] args) {
        Atv_005 q5 = new Atv_005(); 
        q5.meuCachorro = new Cachorro2();
        q5.meuCachorro.Nome = "Leoncio"; 
        q5.meuCachorro.executarComando(); 
        }
}

class Cachorro2 extends Mamifero implements Domesticavel {
    String Raca;
    String Nome; 

    public void emitirSom() {
        System.out.println("Au Au!");
    }

    @Override
    public void executarComando() {
        System.out.println(Nome + " está executando o comando: " + Comando + ".");
    }
}
