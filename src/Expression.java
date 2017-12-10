public interface Expression {
	public double evaluate();
	public String toString();
	public void accept(Visiteur v);
	public Iterator getIteratorPostFixe();
	public Iterator getIteratorPreFixe();
}
