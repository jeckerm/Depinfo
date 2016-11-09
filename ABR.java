
public class ABR {

	private int elements;
	private Node root;
	
	public ABR(){
		this.elements = 0;
		this.root = null;
	}
	
	public void insert(char i){
		Node n = new Node(i);
		if (this.root == null){
			this.root = n;
		} else {
			Node next = this.root;
			Node m = null;
			while (next != null){ 	//On compare le node aux nodes déjà existants
				m = next;			// pour le placer au bon endroit dans l'arbre
				if (n.getValeur() < next.getValeur()){
					next = next.child_left;
				} else {
					next = next.child_right;
				}
			}
			//on s'est arrêté au dernier node correspondant, on veut maintenant savoir
			//si on le place à gauche ou à droite
			if (n.getValeur() < m.getValeur()){
				n = m.child_left;
			} else {
				n = m.child_right;
			}
		}
		elements += 1;
	}
	
	public boolean isEmpty(){
		if (this.elements == 0){
			return true;
		}
		return false;
	}
	
	public int nbElements(){
		return this.elements;
	}
	
}
