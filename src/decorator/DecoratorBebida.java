package decorator;

abstract public class DecoratorBebida extends Bebida{
	protected Bebida bebida;
	
	protected DecoratorBebida(Bebida bebida) {
		this.bebida = bebida;
	}
	
	abstract public String getDescricao(); 
}