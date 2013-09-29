import java.io.IOException;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner Ler = new Scanner(System.in);
		Imagem img = new Imagem(0, 0, "");
		Cor cor = new Cor(0);
		String cmd;

		do{				
			System.out.println("Comando: ");
			cmd = Ler.next();

			if ( cmd.equalsIgnoreCase( "imagem" ) ) {
				int    p1 = Ler.nextInt();
				int    p2 = Ler.nextInt();
				String p3 = Ler.next();
			
				//  Altura, Largura, (C)olorida ou (G)cinza
				img = new Imagem( p1, p2, p3 );
			}
			
			if ( cmd.equalsIgnoreCase( "salvar" ) ){
				String pNomeArq = Ler.next();
				
				try{
					img.Salvar( pNomeArq );
				} catch (IOException e) {
					System.err.println(e.getMessage());
					e.printStackTrace(System.err);
				}
			}
					
			if ( cmd.equalsIgnoreCase( "cor" ) ){
	    		if ( img.getTpCor().equalsIgnoreCase("G") ){
	        		int pGrey = Ler.nextInt();
	    			cor = new Cor( pGrey );
				} else {
					int pR = Ler.nextInt();
					int pG = Ler.nextInt();
					int pB = Ler.nextInt();
					cor = new Cor( pR, pG, pB );
				}
			}

			if ( cmd.equalsIgnoreCase( "retangulo" ) ){
				int pX0 = Ler.nextInt();
				int pY0 = Ler.nextInt();
				int pX1 = Ler.nextInt();
				int pY1 = Ler.nextInt();
				
				Retangulo retang = new Retangulo();
				retang.setPontos(pX0, pY0, pX1, pY1);
				retang.draw(cor, img);				
			}
			
			if ( cmd.equalsIgnoreCase( "reta" ) ){
				int pX0 = Ler.nextInt();
				int pY0 = Ler.nextInt();
				int pX1 = Ler.nextInt();
				int pY1 = Ler.nextInt();
				
				Reta reta = new Reta();
				reta.setPontos(pX0, pY0, pX1, pY1);
				reta.draw(cor, img);
			}
			
			if ( cmd.equalsIgnoreCase( "triangulo" ) ){
				int pX0 = Ler.nextInt();
				int pY0 = Ler.nextInt();
				int pX1 = Ler.nextInt();
				int pY1 = Ler.nextInt();
				int pX2 = Ler.nextInt();
				int pY2 = Ler.nextInt();
				
				Triangulo tri = new Triangulo();
				tri.setPontos(pX0, pY0, pX1, pY1, pX2, pY2);
				tri.draw(cor, img);
			}
			
			if ( cmd.equalsIgnoreCase( "circulo" ) ){
				int pX = Ler.nextInt();
				int pY = Ler.nextInt();
				int pR = Ler.nextInt();
				
				Circulo circ = new Circulo( );
				circ.setCentro(pX, pY);
				circ.setRaio(pR);
				circ.draw(cor, img);
			}
			
		} while ( !cmd.equalsIgnoreCase("sair") && !cmd.equalsIgnoreCase("exit") );
		Ler.close();
	}	
}
