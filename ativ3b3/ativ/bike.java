package ativ;

public class bike {
    private int s;
	private boolean bag;

	public bike(boolean bag, int s) { 
	      this.bag = bag;
	      this.s = s;
	}
	
	public void set_bagageiro(boolean bag) {
		this.bag = bag;
	}
	
	public void set_shift(int s) {
		this.s = s;
	}

	public boolean get_bagageiro() {
		return (this.bag);
	}
	
	public int get_shift() {
		return (this.s);
	}
	
	public void print_informacoes() {
		System.out.println(this.bag);
		System.out.println(this.s);
	}
}