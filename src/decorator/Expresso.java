package decorator;

public class Expresso extends Bebida{

	public Expresso() {
		descricao = "Café Expresso";
	}

	@Override
	public double getPreco() {
		// TODO Auto-generated method stub
		return 1.50;
	}

}
