
public class Cliente {

	private int Id = 0;
	private int Tempo_Total_C;
	private int Tempo_Total_A;
	private int Tempo_Saida_Banco;
	private int Tempo_Entrada_Banco;
		
	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}
	
	public int getTempo_Total_A() {
		return Tempo_Total_A;
	}
	
	public void setTempo_Total_A(int tempo) {
		Tempo_Total_A = tempo;
	}
	
	public int getTempo_Total_C() {
		return Tempo_Total_C ;
	}

	public void setTempo_Total_C(int tempo) {
		Tempo_Total_C = tempo;
	}
	
	public int getTempo_Total_Banco() {
		return ( Tempo_Saida_Banco - Tempo_Entrada_Banco );
	}
	
	public int getTempo_Entrada_Banco() {
		return Tempo_Entrada_Banco;
	}

	public void setTempo_Entrada_Banco(int tempo) {
		Tempo_Entrada_Banco = tempo;
	}

	public int getTempo_Saida_Banco() {
		return Tempo_Saida_Banco;
	}
	
	public void setTempo_Saida_Banco(int tempo) {
		Tempo_Saida_Banco = tempo;
	}

}