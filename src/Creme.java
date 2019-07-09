public class Creme extends SorveteSabor {

	public Creme(Sorvete sorvete) {
		super(sorvete);
		super.setNome(getNome() + " Creme |");
	}

	@Override
	public int getQuantidadeBolas() {
		return 1 + this.getSorvete().getQuantidadeBolas();
	}

	@Override
	public double getPreco() {
		return 1.25 + this.getSorvete().getPreco();
	}

}

