import java.util.Scanner;

public class Estiagem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int quantImoveis;

		while (true) {
			try {
				String valorDigitado;
				System.out.println("Digite a quantidade de imoveis:");
				valorDigitado = sc.next();
				quantImoveis = Integer.parseInt(valorDigitado);
				if (quantImoveis >= 0 && quantImoveis <= 1000000) {
					break;
				} else {
					System.out.println("Valor invalido, digite novamente...");
				}
			} catch (Exception e) {
				System.out.println("valor invalido, digite novamente...");
			}
		}

		for (int i = quantImoveis; i > 0; i--) {

			System.out.println("Digite a quantidade de moradores da residencia:");
			String qtdMoradores = sc.next();
			System.out.println("Digite a quantidade de consumo total:");
			String qtdConsumo = sc.next();

		}

	}

}
