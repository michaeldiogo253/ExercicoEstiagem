
public class Residencia {

	int qtdMoradores;
	int qtdconsumoTotal;

	public Residencia() {

	}

	public int getQtdMoradores() {
		return qtdMoradores;
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
}
