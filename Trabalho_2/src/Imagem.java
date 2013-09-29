import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Imagem {

	private int[][] img;
	private String tpCor = "";
	
	public Imagem(int alt, int lar, String tpCor) {
		this.img = new int[alt][lar];
		this.tpCor = tpCor;
	}
	
	public String getTpCor() {
		return tpCor;
	}
	
	public void Salvar( String filename ) throws IOException {
		BufferedWriter out = new BufferedWriter( new FileWriter(filename + ".pnm") );

		if ( this.tpCor.equalsIgnoreCase("G") ){
			out.write(String.format("P2\n%d %d\n255\n", img[0].length, img[0].length ));
		} /* else {
			out.write(String.format("P3\n%d %d\n255\n", img[0].length, img[0].length ));
		} */
		for (int[] linha : img) {
			for (int v : linha){
				out.write(String.format("%d ", v) );
			}
		}	
		out.close();
	}

	public void SetPixel( Ponto p, Cor c ){
 
		if ( this.tpCor.equalsIgnoreCase("G") ){
			img[p.x][p.y] = c.getGrey();
		} /* else {
			img[p.x][p.y] = c.getR() c.getG() c.getB(); 
		} */		
	}	
}
