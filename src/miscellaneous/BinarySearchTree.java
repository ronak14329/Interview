package miscellaneous;
class Node {
public int value;
public Node leftChild;
public Node rightChild;
public Node(int value){
	this.value=value;
	this.leftChild=null;
	this.rightChild=null;
}
}
public class BinarySearchTree {
	public Node root;
	public int size;
	  public BinarySearchTree(){
	this.root=null;
	this.size=0;
	  }


	  // Time Complexity: 
	  // Auxiliary Space Complexity: 
	  public void insert(int value){
	Node newNode = new Node(value);
	if(root==null){
		root = newNode;
		size++;
		return;
	}
	Node parent=null;
	Node child = this.root;
	while(child!=null){
		parent=child;
		child=parent.value >value ?parent.leftChild:parent.rightChild;
	}
	if(parent.value>value){
		parent.leftChild=newNode;
	}else{
		parent.rightChild=newNode;
	}size++;
	  }


	  // Time Complexity: 
	  // Auxiliary Space Complexity: 
	  public boolean search(int value){
	    Node curr=root;
	    while(curr!=null){
	    	if(curr.value==value)return true;
	    	else if(curr.value >value)curr=curr.leftChild;
	    	else curr=curr.rightChild;
	    }
	    return false;
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Node testNode;
		    Node leftNode;
		    Node rightNode;
		    BinarySearchTree testTree;

		    System.out.println("-----node class-----\n");
		    System.out.println("creation of a node");
		    testNode = new Node(5);
		    System.out.println("1.0: " + (testNode != null));
		    System.out.println("1.1: " + (testNode.value == 5));
		    System.out.println("1.2: " + (testNode.leftChild == null));
		    System.out.println("1.3: " + (testNode.rightChild == null));

		    System.out.println("\nassigning values and children");
		    testNode.value = 3;
		    System.out.println("2.0: " + (testNode.value == 3));
		    leftNode = new Node(1);
		    rightNode = new Node(5);
		    System.out.println("2.1: " + (testNode.leftChild  == null));
		    System.out.println("2.2: " + (testNode.rightChild  == null));
		    testNode.leftChild = leftNode;
		    testNode.rightChild = rightNode;
		    System.out.println("2.3: " + (testNode.leftChild.value  == 1));
		    System.out.println("2.4: " + (testNode.rightChild.value  == 5));

		    System.out.println("\n\n-----binary search tree class-----\n");
		    System.out.println("creation of a binary search tree");
		    testTree = new BinarySearchTree();
		    System.out.println("3.0: " + (testTree != null));
		    System.out.println("3.1: " + (testTree.root == null));
		    System.out.println("3.2: " + (testTree.size == 0));

		    System.out.println("\ninsert first node");
		    testTree.insert(5);
		    System.out.println("4.0: " + (testTree.size == 1));
		    System.out.println("4.1: " + (testTree.root.value == 5));
		    System.out.println("4.2: " + (testTree.root.leftChild == null));
		    System.out.println("4.3: " + (testTree.root.rightChild == null));

		    System.out.println("\ninsert a second node");
		    testTree.insert(10);
		    System.out.println("5.0: " + (testTree.size == 2));
		    System.out.println("5.1: " + (testTree.root.value == 5));
		    System.out.println("5.2: " + (testTree.root.leftChild == null));
		    System.out.println("5.3: " + (testTree.root.rightChild != null));
		    System.out.println("5.4: " + (testTree.root.rightChild.value == 10));

		    System.out.println();
		    testTree.insert(3);
		    testTree.insert(1);
		    testTree.insert(4);
		    testTree.insert(7);
		    testTree.insert(11);
		    System.out.println("\nsearch method");
		    System.out.println("6.0: " + (testTree.search(3) == true));
		    System.out.println("6.1: " + (testTree.search(1) == true));
		    System.out.println("6.2: " + (testTree.search(4) == true));
		    System.out.println("6.3: " + (testTree.search(7) == true));
		    System.out.println("6.4: " + (testTree.search(11) == true));
		    System.out.println("6.5: " + (testTree.search(14) == false));
		    System.out.println("6.6: " + (testTree.search(6) == false));

	}

}
