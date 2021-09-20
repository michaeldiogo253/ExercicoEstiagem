import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cidade {

	// List<ArrayList<Residencia>> listaCidades = new ArrayList<>();
	List<Residencia> listResidencias = new ArrayList<>();

	public Cidade() {

	}

	public List<Residencia> getListResidencias() {
		return listResidencias;
	}

	public void setListResidencias(List<Residencia> listResidencias) {
		this.listResidencias = listResidencias;
	}

	public void adicionaResidencia(Residencia res) {
		listResidencias.add(res);

	}

	public void retornaTodasResidenciasDaCidade() {
		for (Iterator iterator = listResidencias.iterator(); iterator.hasNext();) {
			Residencia residencia = (Residencia) iterator.next();
			System.out.println(residencia.toString());
		}
	}

//	public void adicionaResidencia(ArrayList<Residencia> listaResidencias) {
//		listaCidades.add(listaResidencias);
//
//	}

//	public int retornaQuantidadeDeCidades() {
//		return listaCidades.size();
//	}
//
//	public void retornaCidades() {
//		int i = 0;
//		for (ArrayList<Residencia> arrayList : listaCidades) {
//			i++;
//			System.out.println("Cidade " + i);
//			for (Residencia residencia : arrayList) {
//				System.out.println(residencia.toString());
//			}
//		}
//	}

}
