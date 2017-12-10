import java.util.NoSuchElementException;

public abstract class OpBinaire implements Expression {
 protected Expression op1;
 protected Expression op2;

 private int compteur = 0; //set to private when release
 abstract String getOperateur();

 
 protected OpBinaire(Expression paramop1,Expression paramop2)
 {
	op1 = paramop1;
	op2 = paramop2;
 }
 
 public String toString()
 {
	return "(" + op1.toString() + getOperateur() + op2.toString() + ")" ;
 }
 
 public Expression getOperateurGauche()
 {
	 return op1;
 }
 
 public Expression getOperateurDroit()
 {
	 return op2;
 }
 
 public void accept(Visiteur v)
 {
	 v.visiteOperateur(this);
 }
 
 
public Iterator getIteratorPostFixe() {
	return new iteratorPostFixe();
}
	
public Iterator getIteratorPreFixe() {
	return new iteratorPreFixe();
}
	
	private class iteratorPostFixe extends Iterator{
		
		Iterator iop1 = op1.getIteratorPostFixe();
		Iterator iop2 = op2.getIteratorPostFixe();
		public boolean hasNext() {
			if (compteur < 2){
				return true;
			}
			else return false;
		}

		public Expression next()  {
								
			if(compteur == 0)
			{		
						compteur=1;
						return op1;											
			}
			
			if(compteur ==1)
			{
					compteur = 2;
					return op2; 
			}	
				 
			if(compteur == 2)
			{
				
				compteur=-1;	
				return OpBinaire.this;
				
			}	
				
			throw new NoSuchElementException("Limite de l'élément dépassée.");			
			}		
	}

	 
	private class iteratorPreFixe extends Iterator{
		public boolean hasNext() {
			if (compteur <= 2 && compteur >= 0){
				return true;
			}
			else return false;
		}

		public Expression next()  {
				
				if(compteur ==0)
				{
					compteur=1;
					return OpBinaire.this;
				}	
				
				if(compteur == 1)
				{
				compteur=2;
				Expression expRetourne = op1;
				return expRetourne;				
				}
			
				if(compteur ==2)
				{
				compteur=-1;			
				Expression expRetourne = op2;				
				return expRetourne;	
				}
				throw new NoSuchElementException("Limite de l'élément dépassée.");										
			}	
	}
	
}
