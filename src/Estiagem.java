import java.util.ArrayList;
import java.util.Scanner;

public class Estiagem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int quantImoveis = -1;
		ArrayList<Residencia> listaCidades = new ArrayList<>();

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
					System.out.println("VALOR INVALIDO! Digite novamente...");
				}
			}
			if (quantImoveis == 0) {
				break;
			}
			for (int i = quantImoveis; i > 0; i--) {
				while (true) {

					try {
						System.out.println("Digite a quantidade de moradores da residencia:");
						int qtdMoradores = Integer.parseInt(sc.next());
						System.out.println("Digite a quantidade de consumo total:");
						int qtdConsumo = Integer.parseInt(sc.next());

						if ((qtdMoradores >= 1 && qtdMoradores <= 10) && (qtdConsumo >= 1 && qtdConsumo <= 200)) {
							Residencia res = new Residencia(qtdMoradores, qtdConsumo);
							listaCidades.add(res);
							break;
						} else {
							if (qtdMoradores < 1 || qtdMoradores > 10) {
								System.out.println("Quantidade de moradores tem de ser de 1 a 10");
							}
							if (qtdConsumo < 1 || qtdConsumo > 200) {
								System.out.println("Quantidade de consumo total tem de ser de 1 a 200");
							}
						}

					} catch (Exception e) {
						System.out.println("VALORES INVALIDOS! Digite novamente...");
					}

				}

			}

		}

		int cidades = 0;
		for (Residencia residencia : listaCidades) {
			cidades++;
			System.out.println("Cidade " + cidades);
			System.out.println(residencia.toString());
		}

	}

}
