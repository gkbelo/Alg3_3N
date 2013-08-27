public class Caixa {

	private int Tempo_Inicial;
	private int Tempo_Final;
	private int Cliente_Id;
	private int posFila;
		
	
	public Integer getTempo_Inicial() {
		return Tempo_Inicial;
	}
	
	public void setTempo_Inicial(int tempo) {
		Tempo_Inicial = tempo;
	}
	
	public void Limpar_Fila() {
		Cliente_Id = 0;
	}
	
	public Integer getTempo_Final() {
		return Tempo_Final;
	}
	
	public void setTempo_Final(int tempo) {
		Tempo_Final = tempo;
	}

	public Integer getCliente_Id() {
		return Cliente_Id;
	}
	public void setCliente_Id(int id) {
		Cliente_Id = id;
	}
	
	public Integer getPosFila() {
		return posFila;
	}
	public void setPosFila(int pos) {
		posFila = pos;
	}

}
