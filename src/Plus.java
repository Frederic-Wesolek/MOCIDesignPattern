
public class Plus extends OpBinaire  {
	
	public Plus(Expression op1,Expression op2)
	{
			super (op1, op2);	
	}
	
	public double evaluate() {
		return op1.evaluate() + op2.evaluate();
	}
	
	public String toString(){
		return "(" + op1.toString() + "+" + op2.toString() + ")" ;
	}

	public String getOperateur() {
		return "+";
	}

	public NodeIterator getIterateurPostfixe() {
		return null;
	}

}
