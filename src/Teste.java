
public class Teste {
	public static void main(String[] args) {
		Sorvete sorvete = new SorveteComSabor();
		imprimeInformacoes(sorvete);
		sorvete = new Creme(sorvete);
		sorvete = new Chocolate(sorvete);
		sorvete = new Morango(sorvete);
		imprimeInformacoes(sorvete);
	}
	
	public static void imprimeInformacoes(Sorvete sorvete) {
		System.out.println("Nome: " + sorvete.getNome() + "\n"
				+ "Qtde. bolas: " + sorvete.getQuantidadeBolas() + "\n"
				+ "Preço: " + sorvete.getPreco());
		System.out.println("---------------------------------");
	}
	
}
