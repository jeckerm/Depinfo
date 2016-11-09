
public class ABR {

	private int elements;
	public Node root;
	
	public ABR(){
		this.elements = 0;
		this.root = null;
	}
	
	public void insert(int i){
		if (this.contains(i)){
			System.out.println("Cet �l�ment est d�j� dans l'arbre");
		} else { 
			Node n = new Node(i);
			if (this.root == null){
				this.root = n;
			} else {
				Node next = this.root;	//On initialise la variable � la racine
				Node m = next;			//On aura besoin de se rappeler de la variable pr�c�dant chaque test
				while (next != null){ 	//On compare le node aux nodes d�j� existants
					m = next;			//pour le placer au bon endroit dans l'arbre
					if (i < next.getValeur()){
						next = next.child_left;
						System.out.println("ok tout va bien");
					} else {
						next = next.child_right;
					}
				}
				//on s'est arr�t� au dernier node correspondant, on veut maintenant savoir
				//si on le place � gauche ou � droite
				if (i < m.getValeur()){
					n = m.child_left;
					System.out.println("L'�l�ment est l'enfant de gauche du noeud");
				} else {
					n = m.child_right;
					System.out.println("L'�l�ment est l'enfant de droite du noeud");
				}
			}
			elements += 1;
		}
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
	
	public boolean contains(int i){
		Node next = root;
		while (next != null){
			if (i < next.getValeur()){
				next = next.child_left;
			} if (i > next.getValeur()){
				next = next.child_right;
			} else {
				return(true);
			}
		}
		return false;
	}
	
}
