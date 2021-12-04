package b3a2;

public class Elevador {
	private int AndarAtual = 0;
	private int TotalAndares;
	private int CapacidadeElevador;
	private int PessoasElevador = 0;

	public void SetAndarAtual(int Andar) {
		this.AndarAtual = Andar;
	}

	public void SetTotalAndares(int Andares) {
		this.TotalAndares = Andares;
	}

	public void SetCapacidadeElevador(int Capacidade) {
		this.CapacidadeElevador = Capacidade;
	}

	public void SetPessoasElevador(int Pessoas) {
		this.PessoasElevador = Pessoas;
	}

	public int GetAndarAtual() {
		return (AndarAtual);
	}

	public int GetTotalAndares() {
		return (TotalAndares);
	}

	public int GetCapacidadeElevador() {
		return (CapacidadeElevador);
	}

	public int GetPessoasElevador() {
		return (PessoasElevador);
	}

	public void Inicializa(int Capacidade, int Andares) {
		this.SetCapacidadeElevador(Capacidade);
		this.SetTotalAndares(Andares);
	}

	public void Entra() {
		if (PessoasElevador < CapacidadeElevador) {
			PessoasElevador = PessoasElevador + 1;
		} else {
			System.out.println("J� est� lotado!");
		}
	}

	public void Sai() {
		if (PessoasElevador > 0) {
			PessoasElevador = PessoasElevador - 1;
		} else {
			System.out.println("O elevador est� vazio!");
		}
	}

	public void Sobe() {
		if(AndarAtual < TotalAndares) {
			AndarAtual = AndarAtual + 1;
		} else {
			System.out.println("O elevador n�o sobe mais!");
		}
	}

	public void Desce() {
		if(AndarAtual > 0){
			AndarAtual = AndarAtual - 1;
		} else {
			System.out.println("O elevador n�o desce mais!");
		}
	}
}
