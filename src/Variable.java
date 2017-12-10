public class Variable extends Operande implements Expression {
	private String nom;

	public Variable(String pNom)
	{
		nom = pNom;
	}
	
	public Variable(String pNom,int pValeur){
		nom = pNom;
		valeur = pValeur;
	}
	
	public String getNom(){
		return nom;
	}
	
	public String toString() {
		return nom;
	}

	public double evaluate() {
			return valeur;		
	}

}
