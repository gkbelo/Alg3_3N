
public class Cliente {

	private Integer Id;
	private Integer Tempo_Inicial;
	private Integer Tempo_Final;
	private Integer Tempo_Caixa;
	private Integer Tempo_Atendimento;
	
	private String Finalizado;
	
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public Integer getTempo_Total() {
		return Tempo_Final - Tempo_Inicial;
	}
	public void setTempo_Inicial(Integer tempo) {
		Tempo_Inicial = tempo;
	}
	public void setTempo_Final(Integer tempo) {
		Tempo_Final = tempo;
	}
	public String getFinalizado() {
		return Finalizado;
	}
	public void setFinalizado(String finalizado) {
		Finalizado = finalizado;
	}
	
		
}