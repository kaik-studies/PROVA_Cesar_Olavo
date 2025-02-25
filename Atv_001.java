package OLAVO;

abstract class Animal {
	String Nome;
	
	public String getNome() {
		return Nome;
	}
	 public void setNome(String newname) {
			this.Nome = newname;
		}
	 public abstract void emitirSom();
}
