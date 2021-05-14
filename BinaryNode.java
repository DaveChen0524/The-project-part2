package project4;

//A BinaryNode object is one node in a binary tree.
public class BinaryNode<T> {
	 public T data;       // data stored at this node
	 public BinaryNode<T> left;    // reference to left subtree
	 public BinaryNode<T> right;   // reference to right subtree
	 
	 // Constructs a leaf node with the given data.
	 public BinaryNode(T data) {
	     this(data, null, null);
	 }
	             
	 // Constructs a branch node with the given data and links.
	 public BinaryNode(T data, BinaryNode<T> left, BinaryNode<T> right) {
	     this.data = data;
	     this.right = right;
	     this.left = left;
	     
	 }
}
