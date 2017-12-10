public class Constante extends Operande{
	public Constante(int pValeur)
	{
	valeur = pValeur;
	}

	public double evaluate() {
		return valeur;
	}
	
	public String toString()
	{
		return Double.toString(valeur);
	}

}

