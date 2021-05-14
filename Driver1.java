package project4;

public class Driver {

	public static void main(String[] args) {

		// Leaf nodes
		BinaryNode<Integer> leaf1 =
				new BinaryNode<Integer>(1);

		BinaryNode<Integer> leaf2 =
				new BinaryNode<Integer>(4);
		BinaryNode<Integer> leaf3 = new BinaryNode<Integer>(8);
		BinaryNode<Integer> leaf4 = new BinaryNode<Integer>(9);

		//Left child nodes
		BinaryNode<Integer> grandchild1 =
				new BinaryNode<Integer>(2, leaf1, null);
		BinaryNode<Integer> child1 =
				new BinaryNode<Integer>(3, grandchild1, leaf2);

		//Right child nodes
		BinaryNode<Integer> grandchild2 =
				new BinaryNode<Integer>(7, leaf3, leaf4);
		BinaryNode<Integer> child2 =
				new BinaryNode<Integer>(6, null, grandchild2);
		
		// Root
		BinaryNode<Integer> root = 
				new BinaryNode<Integer>(5, child1, child2);

		// Actual Tree Object
		BinaryTree<Integer> tree = new BinaryTree<Integer>(root);


		int count = tree.countLeaves();
		System.out.println(count);
	}
}
