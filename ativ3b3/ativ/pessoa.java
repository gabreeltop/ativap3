package ativ;

public class pessoa {
	private String n;
	private String p;
	private String m;
	
	public pessoa(String n, String p, String m) { 
	      this.n = n;
	      this.p = p;
	      this.m = m;
	   }    
	public pessoa(String n) { 
		 this.n = n; 
	   }
	
	public void set_name(String n) {
		this.n = n;
	}

	public void set_pai(String n) {
		this.p = n;
	}

	public void set_mae(String n) {
		this.m = n;
	}
	
	public String get_name() {
		return (this.n);
	}

	public String get_pai() {
		return (this.p);
	}
	
	public String get_mae() {
		return (this.m);
	}
	
	public void verifyancestor(pessoa a) {
		if(a.n == this.p || a.n == this.m) {
			System.out.println("a pessoa é um parente");
		} else {
			System.out.println("a pessoa não é um parente");
		}
	}

	public void verify(pessoa a) {
		if(this.p == a.p || this.m == a.m){
			System.out.println("são irmãos");
		} else {
			System.out.println("não são irmãos");
		}
	}
}