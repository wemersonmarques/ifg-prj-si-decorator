public class Morango extends SorveteSabor {

	public Morango(Sorvete sorvete) {
		super(sorvete);
		super.setNome(getNome() + " Morango |");
	}

	@Override
	public int getQuantidadeBolas() {
		return 1 + this.getSorvete().getQuantidadeBolas();
	}

	@Override
	public double getPreco() {
		return 1.75 + this.getSorvete().getPreco();
	}

}

