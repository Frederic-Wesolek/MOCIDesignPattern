
public class Multiplier extends OpBinaire {
	
	public Multiplier(Expression op1,Expression op2)
	{	
			super (op1, op2);	
	}

	public double evaluate() {		
		return op1.evaluate() * op2.evaluate();
	}
	
	String getOperateur() {
		return "*";
	}

}
