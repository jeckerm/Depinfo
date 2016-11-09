
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
