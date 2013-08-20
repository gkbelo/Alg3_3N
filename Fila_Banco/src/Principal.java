import java.util.ArrayList;

import javax.swing.JOptionPane;


public class Principal {

	public static void main(String[] args) {

		ArrayList<Cliente> list_Cliente     = new ArrayList<Cliente>(); 
		ArrayList<Fila>    fila_Caixa       = new ArrayList<Fila>();
		ArrayList<Fila>    fila_Atendimento = new ArrayList<Fila>();

		Atendimento    atendimento1  = new Atendimento();
		Atendimento    atendimento2  = new Atendimento();
		Atendimento    atendimento3  = new Atendimento();
		
		Caixa caixa1 = new Caixa();
		Caixa caixa2 = new Caixa();
		Caixa caixa3 = new Caixa();
		Caixa caixa4 = new Caixa();
		Caixa caixa5 = new Caixa();
		
		caixa1.setNumero(1);
		caixa2.setNumero(2);
		caixa3.setNumero(3);
		caixa4.setNumero(4);
		caixa5.setNumero(5);
		
		for (int t=1; t<=6; t++){
			
			Cliente cli = new Cliente();
			Fila fila = new Fila();


			cli.setId( t * 10 );
			cli.setTempo_Inicial(t);
			
			list_Cliente.add(cli);
			fila.setFila( cli.getId() );
					
			if (t % 2 == 0){
				fila_Atendimento.add( fila );	
			}
			else{
				fila_Caixa.add( fila );
			}
			
			if (caixa1.getCliente_Id() == 0 ){
				caixa1.setCliente_Id( fila_Caixa.get(0).getFila() );
				fila_Caixa.remove(0);
				
				for(int tCaixa=0; tCaixa>=5; tCaixa++){
				}
				
				list_Cliente.get( caixa1.getCliente_Id() ).setFinalizado("S");
				
			}else{
				if (caixa2.getCliente_Id() == 0 ){
					caixa2.setCliente_Id( fila_Caixa.get(0).getFila() );
					fila_Caixa.remove(0);
					
					for(int tCaixa=0; tCaixa>=5; tCaixa++){
					}
					
					list_Cliente.get( caixa2.getCliente_Id() ).setFinalizado("S");
					
				}else{
					if (caixa3.getCliente_Id() == 0 ){
						caixa3.setCliente_Id( fila_Caixa.get(0).getFila() );
						fila_Caixa.remove(0);
						
						for(int tCaixa=0; tCaixa>=5; tCaixa++){
						}
						
						list_Cliente.get( caixa3.getCliente_Id() ).setFinalizado("S");
						
					}else{
						if (caixa4.getCliente_Id() == 0 ){
							caixa4.setCliente_Id( fila_Caixa.get(0).getFila() );
							fila_Caixa.remove(0);
							
							for(int tCaixa=0; tCaixa>=5; tCaixa++){
							}
							
							list_Cliente.get( caixa4.getCliente_Id() ).setFinalizado("S");
							
						}else{
							if (caixa5.getCliente_Id() == 0 ){
								caixa5.setCliente_Id( fila_Caixa.get(0).getFila() );
								fila_Caixa.remove(0);
								
								for(int tCaixa=0; tCaixa>=5; tCaixa++){
								}
								
								list_Cliente.get( caixa5.getCliente_Id() ).setFinalizado("S");
								
							}
						}
					}
				}
			}
			
			if (cli.getFinalizado().equalsIgnoreCase("S")){
				cli.setTempo_Final(t);	
			}
						
		}
		
//		for (int i=0; i < list_Cliente.size(); i++){
	//		JOptionPane.showMessageDialog (null, "Id Cliente " + list_Cliente.get(i).getId() + "\n");			
		//}
		
	}
}