
public class Reta extends Shape {

	private Ponto ponto0 = new Ponto();
	private Ponto ponto1 = new Ponto();
	private Ponto ponto  = new Ponto();
	
	public void draw( Cor c, Imagem img ) {
		img.SetPixel( ponto0, c );
		img.SetPixel( ponto1, c );

		int x, y, erro, deltaX, deltaY;
		erro = 0;
		x = ponto0.x;
		y = ponto0.y;
		deltaX = ponto1.x - ponto0.x;
		deltaY = ponto1.y - ponto0.y;
 
		if ( (  Math.abs(deltaY)>=Math.abs(deltaX) && ponto0.y > ponto1.y)
			 || (Math.abs(deltaY)<Math.abs(deltaX) && deltaY<0 ) ) {
			x = ponto1.x;
			y = ponto1.y;
			deltaX = ponto0.x - ponto1.x;
			deltaY = ponto0.y - ponto1.y;
		}
		if ( deltaX>=0 ) {
			if ( Math.abs(deltaX) >= Math.abs(deltaY) ){
				for ( int i = 1; i < Math.abs(deltaX); i++ ){
					if ( erro < 0 ){
						x++;
						ponto.x = x;
						ponto.y = y;
						img.SetPixel( ponto, c );						
						erro += deltaY;
					} else {
						x++;
						y++;
						ponto.x = x;
						ponto.y = y;
						img.SetPixel( ponto, c );
						erro += deltaY - deltaX;
					}
				}
			} else {
				for ( int i = 1; i < Math.abs(deltaY); i++){
					if ( erro < 0 ){
						x++;
						y++;
						ponto.x = x;
						ponto.y = y;
						img.SetPixel( ponto, c );
						erro += deltaY - deltaX;						
					}else{
						y++;
						ponto.x = x;
						ponto.y = y;
						img.SetPixel( ponto, c );
						erro -= deltaX;
					}
				}
			}
		} else { 
			if ( Math.abs(deltaX) >= Math.abs(deltaY) ){
				for( int i = 1; i < Math.abs(deltaX); i++ ){
					if(erro<0){
						x--;
						ponto.x = x;
						ponto.y = y;
						img.SetPixel( ponto, c );
						erro += deltaY;
					}else{
						x--;
						y++;
						ponto.x = x;
						ponto.y = y;
						img.SetPixel( ponto, c );
						erro += deltaY + deltaX;
					}
				}
			} else {
				for( int i=1; i < Math.abs(deltaY); i++ ){
					if ( erro < 0 ){
						x--;
						y++;
						ponto.x = x;
						ponto.y = y;
						img.SetPixel( ponto, c );
						erro += deltaY + deltaX;						
					} else {
						y++;						
						ponto.x = x;
						ponto.y = y;
						img.SetPixel( ponto, c );
						erro += deltaX;
					}
				}
			}
		}
	}

	public void setPontos( int x0, int y0, int x1, int y1 ){
		this.ponto0.x = x0;
		this.ponto0.y = y0;
		this.ponto1.x = x1;
		this.ponto1.y = y1;			
	}
}
