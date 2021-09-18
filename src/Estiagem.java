import java.util.Scanner;

public class Estiagem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int quantImoveis = -1;

		while (quantImoveis != 0) {

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
			if (quantImoveis == 0) {
				break;
			}

			for (int i = quantImoveis; i >= 1; i--) {

				while (true) {
					try {

						System.out.println("Digite a quantidade de moradores da residencia:");
						int qtdMoradores = Integer.parseInt(sc.next());
						System.out.println("Digite a quantidade de consumo total:");
						int qtdConsumo = Integer.parseInt(sc.next());

						if ((qtdMoradores >= 1 && qtdMoradores <= 10) && (qtdConsumo <= 200 && qtdConsumo >= 1)) {
							break;
						} else {
							if (qtdMoradores < 1 || qtdMoradores > 10) {
								System.out.println("A quantidade de moradores deve ser de 1 a 10");
							}
							if (qtdConsumo < 1 || qtdConsumo > 200) {
								System.out.println("A quantidade total de consumo deve ser de 1 a 200");
							}

						}

					} catch (Exception e) {
						System.out.println("Valores invalidos, digite novamente...");
					}

				}

			}

		}

	}

}