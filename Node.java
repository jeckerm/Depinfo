public class Node {

	public Node child_left;
	public Node child_right;
	private int valeur;
	
	public Node(int i){
		this.child_left = null;
		this.child_right = null;
		this.valeur = i;
	}
	
	public int getValeur(){
		return this.valeur;
	}

	
}
