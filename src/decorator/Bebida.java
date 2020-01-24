package decorator;

abstract public class Bebida {
	protected String descricao; 
	
	protected Bebida() {
		descricao = "";
	}

	public String getDescricao() {
		return descricao;
	}
	
	abstract public double getPreco(); 
}
