package decorator;

public class MisturaCasa extends Bebida{

	public MisturaCasa() {
		descricao = "Caf� Mistura da Casa";
	}

	@Override
	public double getPreco() {
		return 2.80;
	}

}
