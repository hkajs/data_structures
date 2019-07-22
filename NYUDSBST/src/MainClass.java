
public class MainClass {
	public static void main(String[] args) {
		BinarySearchTree<Visitor> mytree = new BinarySearchTree<Visitor>();
		Visitor v = new Visitor("C");
		mytree.add(v);
		v = new Visitor("A");
		mytree.add(v);
		v = new Visitor("F");
		mytree.add(v);
		BSTNode mynode;
	    LinkedQueue<Visitor> myq = new LinkedQueue<Visitor>();
	    mytree.preOrder(mytree.root, myq);
	    printqueue(myq);
	    myq = new LinkedQueue<Visitor>();
	    mytree.inOrder(mytree.root, myq);
	    printqueue(myq);
	    myq = new LinkedQueue<Visitor>();
	    mytree.postOrder(mytree.root, myq);
	    printqueue(myq);
	}
	public static void printqueue(LinkedQueue inqueue) {
		 LLNode mynode = inqueue.front;
		 while (mynode != null)  {
			 System.out.print(  ((Visitor) mynode.getInfo()).vname  + " ");
			 mynode = mynode.getLink();
		 }
		 System.out.println();
	}
	 
}
