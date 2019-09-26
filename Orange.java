public class Orange {
	private double prix;
	private String origine;

	public Orange(){
		prix = 0.0;
		origine = "DEFAUT";
	}

	public Orange(double p, String o){
		if (p < 0) {
      			throw new ArithmeticException("impossible - Le prix doit être au moins positif.");
    		}
		this.prix= p;
		this.origine = o;
	}
	
	public double getPrix(){
		return this.prix;
	}

	public String getOrigine(){
		return this.origine;
	}
}
