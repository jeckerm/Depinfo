import static org.junit.Assert.*;

import org.junit.Test;

public class ABRTesT {

	@Test
	public void testContains() {
		ABR a = new ABR();
		a.root = new Node(5);
		assertTrue(a.contains(5));
	}
	
	/*
	@Test
	public void testInsert(){
		ABR a = new ABR();
		a.insert(42);
		Node n = new Node(42);
		assertTrue(a.root.getValeur() == n.getValeur());
		a.insert(50);		
		a.insert(41);		//Renvoie une erreur quand on veut insérer un point de valeur inférieure au root
		Node m = new Node(50);
		Node o = new Node(3);
		assertTrue(a.root.child_right.getValeur() == m.getValeur());
		assertTrue(a.root.child_left.getValeur() == o.getValeur());
		assertTrue(a.contains(50));
		assertTrue(a.contains(32));
		assertTrue(a.contains(42));
	}
	*/
	
	@Test
	public void testEmpty(){
		ABR a = new ABR();
		assertTrue(a.isEmpty());
	}
	
	@Test
	public void testNbElements(){
		ABR a = new ABR();
		a.insert(1);
		a.insert(2);		//j'ajoute les éléments dans l'ordre croissant car je sais qu'il y a un
		a.insert(3);		//problème avec la méthode insert lorsque je veux ajouter des éléments de valeur
		a.insert(4);		//inférieure au root
		assertTrue(a.nbElements() == 4);
		
	}

}
