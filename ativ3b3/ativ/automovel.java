package ativ;

public class automovel {
	private double kw;

	public void set_portas(double p) {
		this.kw = p;
	}

	public automovel(double p) { 
	      this.kw = p;
	   }
	
	public double get_portas() {
		return (this.kw);
	}
	
	public void print_informacoes() {
		System.out.println(this.kw);
	}
}