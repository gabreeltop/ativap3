package ativ;

public class veiculo {
	private String m;
	private int r;
	private String mod;
	private int v = 0;
	
	public veiculo(int v, int r, String mod, String m) { 
	      this.v = v;
	      this.r = r;
	      this.mod = mod;
	      this.m = m;
	}
	
	public void acelerar(int valor) {
		this.v += valor;
	}
	
	public void frear(int valor) {
		this.v -= valor;
	}
	
	public int get_velocidade() {
		return(this.v);
	}
	
	public int get_rodas() {
		return(this.r);
	}
	
	public String get_marca() {
		return(this.m);
	}
	
	public String get_modelo() {
		return(this.mod);
	}
	
	public void set_velocidade(int v) {
		this.v = v;
	}
	
	public void set_rodas(int r) {
		this.r = r;
	}
	
	public void set_marca(String m) {
		this.m = m;
	}
	
	public void set_modelo(String mod) {
		this.mod = mod;
	}
	
	public void print_informacoes() {
		System.out.println(this.v);
		System.out.println(this.r);
		System.out.println(this.mod);
		System.out.println(this.m);
	}
}