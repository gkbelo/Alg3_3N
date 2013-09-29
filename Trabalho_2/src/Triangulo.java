
public class Triangulo extends Shape {

	private Ponto ponto0 = new Ponto();
	private Ponto ponto1 = new Ponto();
	private Ponto ponto2 = new Ponto();
	
	public void draw( Cor c, Imagem img ) {
		Reta reta = new Reta();
		reta.setPontos( ponto0.x, ponto0.y, ponto1.x, ponto1.y );
		reta.draw(c, img);
		
		reta.setPontos( ponto0.x, ponto0.y, ponto2.x, ponto2.y );
		reta.draw(c, img);
		
		reta.setPontos( ponto2.x, ponto2.y, ponto1.x, ponto1.y );
		reta.draw(c, img);		
	}
	
	public void setPontos( int x0, int y0, int x1, int y1, int x2, int y2 ){
		this.ponto0.x = x0;
		this.ponto0.y = y0;
		this.ponto1.x = x1;
		this.ponto1.y = y1;
		this.ponto2.x = x2;
		this.ponto2.y = y2;		
	}
}