
public class Retangulo extends Shape {

	private Ponto ponto0 = new Ponto();
	private Ponto ponto1 = new Ponto();

	public void draw( Cor c, Imagem img ) {
		Ponto ponto  = new Ponto();	
		
		img.SetPixel( ponto0, c );
		img.SetPixel( ponto1, c );

		for ( int i = 0; i <= (ponto1.x - ponto0.x); i++ ){
			ponto.x = ponto0.x + i;
			ponto.y = ponto0.y;
			img.SetPixel( ponto, c );
		}
		
		for ( int i = 0; i <= (ponto1.y - ponto0.y); i++ ){
			ponto.x = ponto0.x;
			ponto.y = ponto0.y + i;
			img.SetPixel( ponto, c );
		}

		for ( int i = 0; i <= (ponto1.x - ponto0.x); i++ ){
			ponto.x = ponto0.x + i;
			ponto.y = ponto1.y;
			img.SetPixel( ponto, c );
		}
		
		for ( int i = 0; i <= (ponto1.y - ponto0.y); i++ ){
			ponto.x = ponto1.x;
			ponto.y = ponto0.y + i;
			img.SetPixel( ponto, c );
		}
	}

	public void setPontos( int x0, int y0, int x1, int y1 ){
		if ( x0 <= x1 ) {
			this.ponto0.x = x0;
			this.ponto1.x = x1;	
		} else {
			this.ponto0.x = x1;
			this.ponto1.x = x0;
		}
		if ( y0 <= y1 ) {
			this.ponto0.y = y0;
			this.ponto1.y = y1;			
		} else {
			this.ponto0.y = y1;
			this.ponto1.y = y0;
		}		
    }
}
