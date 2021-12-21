package ativ;

public class moto {
	private boolean part;

	public moto(boolean p) { 
	      this.part = p;
	   }
	
	public void set_portas(boolean p) {
		this.part = p;
	}
	
	public boolean get_portas() {
		return (this.part);
	}
	
	public void print_informacoes() {
		System.out.println(this.part);
	}
}