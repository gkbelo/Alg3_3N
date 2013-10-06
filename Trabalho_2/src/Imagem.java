import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Imagem {

	private int[][][] img;
	private String tpCor = "";
	private int Alt;
	private int Lar;
	
	public Imagem(int pAlt, int pLar, String tpCor) {
		this.Alt = pAlt;
		this.Lar = pLar;
		this.img = new int[Alt][Lar][3];
		this.tpCor = tpCor;
	}
	
	public String getTpCor() {
		return tpCor;
	}

	public int getAltura() {
		return Alt;
	}

	public int getLargura() {
		return Lar;
	}

	
	public void Salvar( String filename ) throws IOException {
		BufferedWriter out = new BufferedWriter( new FileWriter(filename + ".pnm") );

		if ( this.tpCor.equalsIgnoreCase("G") ){
			out.write("P2\n");
		} else {
			out.write("P3\n");
		}
		out.write(Alt + " " + Lar + "\n");
		out.write("255\n");
		
		for(int x = 0 ; x < Alt ; x++){	
			for(int y = 0 ; y < Lar ; y++){	
				if( this.tpCor.equalsIgnoreCase("G") ){
					out.write(img[x][y][0] + " ");
				} else {
					out.write(img[x][y][0] + " " + img[x][y][1] + " " + img[x][y][2] + " " );
				}
			}
		}
		out.close();
	}

	public void SetPixel( Ponto p, Cor c ){
 
		if ( this.tpCor.equalsIgnoreCase("G") ){
			img[p.x][p.y][0] = c.getGrey();
			img[p.x][p.y][1] = c.getGrey();
			img[p.x][p.y][2] = c.getGrey();
		}  else {
			img[p.x][p.y][0] = c.getR();
			img[p.x][p.y][1] = c.getG(); 
			img[p.x][p.y][2] = c.getB(); 
		} 		
	}	
}
