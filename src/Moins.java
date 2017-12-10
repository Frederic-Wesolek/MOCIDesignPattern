
public class Moins extends OpBinaire {
	
	public Moins(Expression op1, Expression op2)
	{
		super (op1, op2);
	}
	
	public double evaluate() {
		return op1.evaluate() - op2.evaluate();
	}

	String getOperateur() {
		return "-";
	}
	
	public boolean HasNext() {
		return false;
	}
	
	public NodeIterator getIterateurPostfixe() {
		return null;
	}
}
