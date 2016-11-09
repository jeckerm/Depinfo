
public class ABR {

	private int elements;
	public Node root;
	
	public ABR(){
		this.elements = 0;
		this.root = null;
	}
	
	public void insert(int i){
		if (this.contains(i)){
			System.out.println("Cet élément est déjà dans l'arbre");
		} else { 
			Node n = new Node(i);
			if (this.root == null){
				this.root = n;
			} else {
				Node next = this.root;	//On initialise la variable à la racine
				Node m = next;			//On aura besoin de se rappeler de la variable précédant chaque test
				while (next != null){ 	//On compare le node aux nodes déjà existants
					m = next;			//pour le placer au bon endroit dans l'arbre
					if (i < next.getValeur()){
						next = next.child_left;
						System.out.println("ok tout va bien");
					} else {
						next = next.child_right;
					}
				}
				//on s'est arrêté au dernier node correspondant, on veut maintenant savoir
				//si on le place à gauche ou à droite
				if (i < m.getValeur()){
					n = m.child_left;
					System.out.println("L'élément est l'enfant de gauche du noeud");
				} else {
					n = m.child_right;
					System.out.println("L'élément est l'enfant de droite du noeud");
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
