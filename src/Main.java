public class Main {
	 public static void main(String[] args) {
		
		Expression C1 = new Constante(4);
		Expression C2 = new Constante(8);
		Expression V2 = new Variable("a",5);
		Expression V3 = new Variable("b",12);
		Expression V4 = new Variable("c",8);		
		Expression opPlus = new Plus(V2,V3);
		Expression opMoins = new Moins(V2,V4);
		Expression opMult = new Multiplier(opPlus,opMoins);
		Expression opPlus1 = new Plus(opMult,V3);
		Expression opPlus2 = new Plus(opPlus1,C1);		
		Expression opPlus10 = new Plus(opPlus,C2);
		
		//TEST POSTFIXE
		Iterator i = opPlus10.getIteratorPostFixe();
		iterateurPostFixeRecur(i);
		System.out.println("\n=========\n");
		
		//TEST PREFIXE
		/*Iterator iprefixe = opPlus10.getIteratorPreFixe();
		iterateurPreFixeRecur(iprefixe);*/
	 }
	 
	 static void iterateurPreFixeRecur(Iterator paramIterator)
	 {
			while (paramIterator.hasNext())
			{							
				Expression exprtemp = paramIterator.next();
				System.out.println(exprtemp);
				iterateurPreFixeRecur(exprtemp.getIteratorPreFixe());			
			}
	 }	
	 
	 static void iterateurPostFixeRecur(Iterator paramIterator)
	 {
			while (paramIterator.hasNext())
			{
				Expression exprtemp = paramIterator.next();			
				iterateurPostFixeRecur(exprtemp.getIteratorPostFixe());	
				System.out.println(exprtemp);			
			}			
	 }
}
