import java.util.NoSuchElementException;

public abstract class Operande implements Expression{
	protected double valeur;
	protected boolean premier=true;
	
	public double getValeur()
	{
		return valeur;
	}
	
	 public void accept(Visiteur v)
	 {
		 v.visiteOperande(this);
	 }
	 
	public Expression getOperateurDroit()
	{
		return null;
	}
	
	public Expression getOperateurGauche()
	{
		return null;
	}
	
	
	public Iterator getIteratorPostFixe() {
		iteratorPostFixe i = new iteratorPostFixe();
		return i;
	}
	
	public Iterator getIteratorPreFixe() {		
				return new iteratorPreFixe();
	}
	
	private class iteratorPostFixe extends Iterator{

		public boolean hasNext() {
			return false;
		}

		public Expression next()  {
			if(!premier) 
			{
				throw new NoSuchElementException("Pas d'élément suivant.");
			}
			premier = false;
			return Operande.this;
		}		
	}
		
	private class iteratorPreFixe extends Iterator{

		public boolean hasNext() {
			return false;
		}

		public Expression next()  {
			if(!premier) 
			{
				throw new NoSuchElementException("Pas d'élément suivant.");
			}			
			return Operande.this;
		}		
	}
}
