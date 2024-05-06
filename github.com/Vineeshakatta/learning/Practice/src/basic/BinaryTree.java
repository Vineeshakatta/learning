package basic;

import java.util.Scanner;

public class BinaryTree {
	
	public BinaryTree() {
		
	}
	Node root;
	
	public void populate(Scanner scanner) {
		System.out.println("Enter the root value");
		root = new Node(scanner.nextInt());
		populate(scanner, root);
	}
	
	public void populate(Scanner scanner, Node node) {
		System.out.println("Do you want to enter left of " + node.value);
		boolean left = scanner.nextBoolean();
		if(left) {
			System.out.println("Enter value left of " +node.value );
			int value = scanner.nextInt();
			node.left = new Node(value);
			populate(scanner, node.left);
		}
		System.out.println("Do you want to enter right of " + node.value);
		boolean right = scanner.nextBoolean();
		if(right) {
			System.out.println("Enter value of right of " + node.right);
			int val = scanner.nextInt();
			node.right = new Node(val);
			populate(scanner, node.right);
		}
	}
	
	public static class Node {
		int value;
		Node left;
		Node right;
		public Node(int value) {
			this.value = value;
		}
	}

}
