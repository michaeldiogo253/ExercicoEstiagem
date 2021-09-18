import java.util.ArrayList;
import java.util.List;

public class Cidade {

	List<Residencia> listaResidencia = new ArrayList<>();

	public Cidade() {

	}

	public void adicionaResidencia(Residencia res) {
		listaResidencia.add(res);

	}

	public void retornaTodasResidenciasDaCidade() {
		for (Residencia residencia : listaResidencia) {
			System.out.println(residencia.toString());
		}

	}

}
