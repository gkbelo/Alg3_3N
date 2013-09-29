
public class Circulo extends Shape {

	private Ponto centro = new Ponto();
	private Ponto ponto  = new Ponto();
	private int Raio;
	
	public void draw( Cor c, Imagem img ) {
		int x = 0
	      , y = Raio
	      , u = 1
	      , v = 2 * Raio - 1
	      , E = 0;
		
		while ( x < y ) {
			ponto.x = centro.x + x;
			ponto.y = centro.y + y;
			img.SetPixel( ponto, c );

			ponto.x = centro.x + y;
			ponto.y = centro.y - x;
			img.SetPixel( ponto, c );

			ponto.x = centro.x - x;
			ponto.y = centro.y - y;
			img.SetPixel( ponto, c );

			ponto.x = centro.x - y;
			ponto.y = centro.y + x;
			img.SetPixel( ponto, c );

		    x++; E += u; u += 2;

		    if (v < 2 * E){
		    	y--; 
		    	E -= v; 
		    	v -= 2;
		    }
		    if (x > y) 
		    	break;

			ponto.x = centro.x + y;
			ponto.y = centro.y + x;
			img.SetPixel( ponto, c );

			ponto.x = centro.x + x;
			ponto.y = centro.y - y;
			img.SetPixel( ponto, c );
		    
			ponto.x = centro.x - y;
			ponto.y = centro.y - x;
			img.SetPixel( ponto, c );

			ponto.x = centro.x - x;
			ponto.y = centro.y + y;
			img.SetPixel( ponto, c );
		}
	}

	public void setCentro( int x, int y ){
		this.centro.x = x;
		this.centro.y = y;
    }
	
	public void setRaio( int raio ){
		Raio = raio;
	}
}
