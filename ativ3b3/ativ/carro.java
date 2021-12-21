package ativ;

public class carro {
	private int p;

	public carro(int p) { 
	      this.p = p;
	   }
	
	public void set_portas(int p) {
		this.p = p;
	}
	
	public int get_portas() {
		return (this.p);
	}
	
	public void print_informacoes() {
		System.out.println(this.p);
	}
}