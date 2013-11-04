import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner Ler = new Scanner(System.in);
		String cmd;
		
		System.out.println("Digite o Comando desejado: Abrir, Inserir, Consultar, Excluir ");
		do{				
			System.out.println("Comando: ");
			cmd = Ler.next();
		
			if ( cmd.equalsIgnoreCase( "abrir" ) ) {
	            Red_Black<String, String> t = new Red_Black<String, String>();

	            try {
	            	System.out.println("Digite o caminho completo do arquivo:");
	            	String local_Arq  = Ler.next();
	            	File arquivo      = new File( local_Arq );
	                BufferedReader bf = new BufferedReader(new FileReader(arquivo));
                    
	                while(bf.ready()){
	                	String[] array = bf.readLine().split("=");
                        String chave = array[0];
                        String valor = array[1];

                        t.Inserir(chave, valor);
                    }

	            } catch (FileNotFoundException e) {
	            	e.printStackTrace();
	            } catch (IOException e) {
	                e.printStackTrace();
	            }

	            Scanner sc = new Scanner(System.in);
			}

			if ( cmd.equalsIgnoreCase( "inserir" ) ) {
	            Red_Black<String, String> t = new Red_Black<String, String>();

            	System.out.println("Digite a chave:");
            	String Chave  = Ler.next();
            	System.out.println("Digite o valor:");
            	String Valor  = Ler.next();
            	
            	t.Inserir(Chave, Valor);	
			}

			if ( cmd.equalsIgnoreCase( "consultar" ) ) {

			}
			
			if ( cmd.equalsIgnoreCase( "excluir" ) ) {

			}

		} while ( !cmd.equalsIgnoreCase("sair") && !cmd.equalsIgnoreCase("exit") );
		Ler.close();
	}
}
