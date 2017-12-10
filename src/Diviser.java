
public class Diviser extends OpBinaire {

	public Diviser(Expression op1,Expression op2)
	{
		super (op2, op2);
	}
	
	public double evaluate() {
	
		if (op2.evaluate() !=0)
		{
			return op1.evaluate() / op2.evaluate();	
		}
		else return 0;		
	}
	
	String getOperateur() {
		return "/";
	}


}
