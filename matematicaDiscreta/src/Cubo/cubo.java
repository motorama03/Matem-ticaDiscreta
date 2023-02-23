package Cubo;

public class cubo {
	
	private int n;
	
	cubo (int n) {
		this.n = n;
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}
	
	int tranforma(int n) {
		if(n == 0) {
			return (1);
		}else
			return (tranforma(n-1)*3);
	}
	
}
