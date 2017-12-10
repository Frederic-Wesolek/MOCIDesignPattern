
public class VisiteurToString implements Visiteur{

	//TODO : Incomplet
	public Object visiteOperateur(OpBinaire Op) {
		return null;
		
	}

	public Object visiteConstante(Constante paramc) {
		Constante c = paramc;
		return c.getValeur();
	}

	public Object visiteVariable(Variable paramV)
	{
		Variable v = paramV;
		return paramV.getNom();
	}
	
	//TODO : Incomplet
	public Object visiteOperande(Operande operande) {
		return null;
	}
	
}
