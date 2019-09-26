public class Main{ 
  
  public static void main(String[] args){   
	Orange orange = new Orange(100,"londre");
	Panier p=new Panier();
	p.addOrange(orange);
	p.addOrange(orange);
	p.addOrange(orange);
	p.addOrange(orange);
	p.affichePanier();
	System.out.println("Prix Total panier: "+p.getPrix()+"\n");
	p.retire();
	p.affichePanier();
  } 

}
