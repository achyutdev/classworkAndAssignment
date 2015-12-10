package binarysearch;

import java.util.Scanner;

class Node {
	int data;
	Node left;
	Node right;

	public Node(int data) {
		this.data = data;
		left = null;
		right = null;
	}
}

class BinaryTree {
	public static Node root;

	public BinaryTree() {
		this.root = null;
	}

	// find
	public boolean find(int num) {
		Node current = root;
		while (current != null) {
			if (current.data == num)
				return true;
			else if (current.data > num) {
				current = current.left;
			} else {
				current = current.right;
			}
		}
		return false;
	}

	// insert
	public void insert(int num) {
		Node newNode = new Node(num);
		if (root == null) {
			root = newNode;
			return;
		}
		Node current = root;
		Node parent = null;
		while (true) {
			parent = current;
			if (num < current.data) {
				current = current.left;
				if (current == null) {
					parent.left = newNode;
				}
				return;
			} else {
				current = current.right;
				if (current == null) {
					parent.right = newNode;
					return;
				}
			}
		}
	}

	// delete
	public boolean delete(int num) {
		Node parent = root;
		Node current = root;
		boolean isLeftChild = false;
		while (current.data != num) {
			parent = current;
			if (current.data > num) {
				current = current.left;
				isLeftChild = true;
			} else {
				current = current.right;
				isLeftChild = true;
			}
			if (current == null) {
				return false;
			}
		}

		// case 1 removing leaf node
		if (current.left == null && current.right == null) {
			if (current == root) {
				root = null;
			}
			current = null;
			if (isLeftChild) {
				parent.left = null;
			} else {
				parent.right = null;
			}

		}

		// has only one child
		if (current.right == null) {
			if (current == root) {
				root = current.left;
			} else if (isLeftChild) {
				parent.left = current.left;
			} else {
				parent.right = current.right;
			}
		} else if (current.left == null) {
			if (current == root) {
				root = current.right;
			} else if (isLeftChild) {
				parent.right = current.right;
			} else {
				parent.left = current.left;
			}
			// has subtree
		} else if (current.left != null && current.right != null) {
			Node replacingNode = getReplacingNode(current);
			if (current == root) {
				root = replacingNode;
			} else if (isLeftChild) {
				parent.left = replacingNode;
			} else {
				parent.right = replacingNode;
			}
		}
		return true;
	}

	private Node getReplacingNode(Node deleteNote) {
		Node replacingNode = null;
		Node replacingNodeParent = null;
		Node current = deleteNote.right;
		while (current != null) {
			replacingNodeParent = replacingNode;
			replacingNode = current;
			current = current.left;
		}
		if (replacingNode != deleteNote.right) {
			replacingNodeParent.left = replacingNode.right;
			replacingNode.right = deleteNote.right;
		}
		return replacingNode;
	}

	// display
	public void display(Node root) {
		if (root != null) {
			display(root.left);
			System.out.print("  " + root.data);
			display(root.right);
		}
	}
}

public class BinarySearchImplementation {

	public static void main(String[] args) {
		BinaryTree obj = new BinaryTree();
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("Munu :  1:insert\n\t2:find\n\t3:delete\n\t4:display");
			int key = input.nextInt();
			switch (key) {
			case 1:
				System.out.print("Enter integer Number to insert in tree:");
				int num = input.nextInt();
				obj.insert(num);
				System.out.println("Number " + num + " inserted.");
				break;
			case 2:
				System.out.print("Enter integer Number to find from tree:");
				int find = input.nextInt();
				if (obj.find(find)) {
					System.out.println("Number " + find + " is Found.");
				}
				System.out.println("Number " + find + " inserted.");
				break;
			case 3:
				System.out.print("Enter integer Number to delete from tree:");
				int delete = input.nextInt();
				obj.insert(delete);
				System.out.println("Number " + delete + " Deleted.");
				break;
			case 4:
				System.out.print("Current Tree is :");
				obj.display(obj.root);
				break;

			default:
				System.out.println("Invalid Input.\n ERROR!!!!");
				break;
			}
			System.out.println("\n\nEnter 0 to exit.");
			if (input.nextInt() == 0) {
				break;
			}
		}
	}

}
