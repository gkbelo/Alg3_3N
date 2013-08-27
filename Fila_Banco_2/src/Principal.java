import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		ArrayList<Cliente> fila_caixa = new ArrayList<Cliente>();
		Caixa  caixa1     = new Caixa();
		Caixa  caixa2     = new Caixa();
		Caixa  caixa3     = new Caixa();
		Caixa  caixa4     = new Caixa();
		Caixa  caixa5     = new Caixa();
		int tempo = 0;
		int seqFila = 0;
		
		for (tempo=1; tempo<=30; tempo++){
			int vDuracaoCaixa = 6;	
			Cliente cli = new Cliente();
			Caixa cai = new Caixa();
			
			cli.setId(tempo*100);
			cli.setTempo_Entrada_Banco(tempo);	
			fila_caixa.add(cli);

			if ( caixa1.getCliente_Id() == 0 ){
				cai.setCliente_Id( fila_caixa.get(seqFila).getId()  );
				cai.setTempo_Inicial(tempo);
				cai.setPosFila( seqFila );
				caixa1 = cai;
				seqFila++;
			} else {
				if ( caixa2.getCliente_Id() == 0 ){
					cai.setCliente_Id( fila_caixa.get(seqFila).getId()  );
					cai.setTempo_Inicial(tempo);
					cai.setPosFila( seqFila );
					caixa2 = cai;
					seqFila++;
				} else {
					if ( caixa3.getCliente_Id() == 0 ){
						cai.setCliente_Id( fila_caixa.get(seqFila).getId()  );
						cai.setTempo_Inicial(tempo);
						cai.setPosFila( seqFila );
						caixa3 = cai;
						seqFila++;
					} else {
						if ( caixa4.getCliente_Id() == 0 ){
							cai.setCliente_Id( fila_caixa.get(seqFila).getId()  );
							cai.setTempo_Inicial(tempo);
							cai.setPosFila( seqFila );
							caixa4 = cai;
							seqFila++;
						} else {
							if ( caixa5.getCliente_Id() == 0 ){
								cai.setCliente_Id( fila_caixa.get(seqFila).getId()  );
								cai.setTempo_Inicial(tempo);
								cai.setPosFila( seqFila );
								caixa5 = cai;
								seqFila++;
							}
						}
					}
				}
			}

			if ( (tempo - caixa1.getTempo_Inicial() ) == vDuracaoCaixa ) {
	    		fila_caixa.get( caixa1.getPosFila() ).setTempo_Total_C( vDuracaoCaixa );	
				caixa1.Limpar_Fila();			
			}
			
			if ( (tempo - caixa2.getTempo_Inicial() ) == vDuracaoCaixa ) {
				fila_caixa.get( caixa2.getPosFila() ).setTempo_Total_C( vDuracaoCaixa );
				caixa2.Limpar_Fila();
			}
			
			if ( (tempo - caixa3.getTempo_Inicial() ) == vDuracaoCaixa ) {
				fila_caixa.get( caixa3.getPosFila() ).setTempo_Total_C( vDuracaoCaixa );
				caixa3.Limpar_Fila();
			}
			
			if ( (tempo - caixa4.getTempo_Inicial() ) == vDuracaoCaixa ) {
				fila_caixa.get( caixa4.getPosFila() ).setTempo_Total_C( vDuracaoCaixa );
				caixa4.Limpar_Fila();
			}
			
			if ( (tempo - caixa5.getTempo_Inicial() ) == vDuracaoCaixa ) {
				fila_caixa.get( caixa5.getPosFila() ).setTempo_Total_C( vDuracaoCaixa );
				caixa5.Limpar_Fila();
			}

/*			JOptionPane.showMessageDialog (null, "Caixa 1 " + caixa1.getCliente_Id() + "\n" +
												 "Caixa 2 " + caixa2.getCliente_Id() + "\n" +
												 "Caixa 3 " + caixa3.getCliente_Id() + "\n" +
												 "Caixa 4 " + caixa4.getCliente_Id() + "\n" +
												 "Caixa 5 " + caixa5.getCliente_Id() + "\n" );
*/
		}
		
		for (int i=0; i < fila_caixa.size(); i++){
			JOptionPane.showMessageDialog (null, "Cliente " + fila_caixa.get(i).getId() + "\n" +
												 " Tempo no Caixa " + fila_caixa.get(i).getTempo_Total_C() );
		}
	}
}
