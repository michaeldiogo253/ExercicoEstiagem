
public class Residencia implements Comparable<Residencia> {

	int qtdMoradores;
	int qtdconsumoTotal;
	int consumoMedio;

	public Residencia() {

	}

	public Residencia(int qtdMoradores, int qtdconsumoTotal) {
		this.qtdMoradores = qtdMoradores;
		this.qtdconsumoTotal = qtdconsumoTotal;
		consumoMedio = this.qtdconsumoTotal / this.qtdMoradores;
	}

	public void setQtdMoradores(int qtdMoradores) {
		this.qtdMoradores = qtdMoradores;
	}

	public int getQtdconsumoTotal() {
		return qtdconsumoTotal;
	}

	public void setQtdconsumoTotal(int qtdconsumoTotal) {
		this.qtdconsumoTotal = qtdconsumoTotal;
	}

	public boolean validaConsumoTotal() {
		if (this.getQtdconsumoTotal() <= 200 && this.getQtdconsumoTotal() >= 1) {
			return true;
		} else {
			return false;
		}
	}

	public boolean validaMoradores() {
		if (this.getQtdconsumoTotal() <= 10 && this.getQtdconsumoTotal() >= 1) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return this.qtdMoradores + "-" + this.consumoMedio;
		// return this.qtdMoradores + "-" + this.qtdconsumoTotal / qtdMoradores;
	}

	@Override
	public int compareTo(Residencia o) {

		if (this.qtdconsumoTotal < o.getQtdconsumoTotal()) {
			return -1;
		}
		if (this.qtdconsumoTotal > o.getQtdconsumoTotal()) {
			return 1;
		}
		return 0;
	}

}
