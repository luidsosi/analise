package decorator;

public class Expresso extends Bebida{

	public Expresso() {
		descricao = "Caf� Expresso";
	}

	@Override
	public double getPreco() {
		// TODO Auto-generated method stub
		return 1.50;
	}

}
