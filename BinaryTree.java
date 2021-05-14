package project4;

//A BinaryTree object represents an entire binary tree.
public class BinaryTree<T> {
	private BinaryNode<T> root;   // null for an empty tree
 
	public BinaryTree(BinaryNode<T> node) {
		this.root = node;
	}

	public void setRoot(BinaryNode<T> node) {
		this.root = node;
	}
	// methods
	
	
	public void printTreePreOrder() {
		printTreePreOrderHelper(this.root);
	}
	
	
	private void printTreePreOrderHelper(BinaryNode<T> node) {
		// Base Case
		if (node == null) {
			return;
		}
		// Recursive Case
		System.out.println(node.data);
		printTreePreOrderHelper(node.left);
		printTreePreOrderHelper(node.right);
	}

	public int countLeaves(){
		int count = 0;
		if (root.right != null){
			count += new BinaryTree<T>(root.right).countLeaves();
		}
		if (root.left == null && root.right == null) {
			return 1;
		}

		if (root.left != null){
			count += new BinaryTree<T>(root.left).countLeaves();
		}	return count;
	}

}
