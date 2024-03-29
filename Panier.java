import java.util.ArrayList;
public class Panier {
	private ArrayList<Orange> panier;
	private int contMax;
	public Panier(){
		panier=new ArrayList<Orange>();
		contMax=10;
	}

	public Panier(int contMax){
		panier=new ArrayList<Orange>();
		this.contMax=contMax;
	}

	public ArrayList<Orange> getPanier(){
		return panier;
	}

	public boolean estPlein(){
		if (panier.size()>= contMax){
			return true;
		}else return false;
	}

	public boolean addOrange(Orange o){
		if (estPlein()==true){
			return false;
		}else{
			panier.add(o);			
			return true;			
		}
		
	}
	
	public boolean retire(){
		if (estVide()==true){
			return false;
		}else{
			panier.remove(panier.get(panier.size()-1));			
			return true;			
		} 
	}
	
	public void affichePanier(){
		for(int i=0; i< panier.size(); i++){
			System.out.println("Pays d'origine: "+panier.get(i).getOrigine()+" Prix: "+panier.get(i).getPrix()+"\n");
		}
	}

	public double getPrix(){
		double prixTot=0.0;
		for(int i=0; i< panier.size(); i++){
			prixTot=prixTot+panier.get(i).getPrix();
		}
		return prixTot;
	}
		
	public boolean estVide(){
		if (panier.size()== 0){
			return true;
		}else return false;
	}
	
}
