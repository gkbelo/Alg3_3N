
public class Cor {

	private int R;
	private int G;
	private int B;
	private int Grey;

	public Cor( int r, int g, int b ) {
		this.R = r;
		this.G = g;
		this.B = b;
	}

	public Cor( int cinza ) {
		this.Grey = cinza;
	}

	public int getR() {
		return R;
	}

	public int getG() {
		return G;
	}

	public int getB() {
		return B;
	}

	public int getGrey() {
		return Grey;
	}
}