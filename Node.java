public class Node {

	public Node child_left;
	public Node child_right;
	private char valeur;
	
	public Node(char i){
		this.child_left = null;
		this.child_right = null;
		this.valeur = i;
	}
	
	public char getValeur(){
		return this.valeur;
	}

	
}
