/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;


/* Name of the class has to be "Main" only if the class is public. */
class BinaryTree
{
	Node root;
	
	public void printViaDfsInorder() {
		printViaDfsInorder(root);
	}
	
	public void printViaDfsInorder(Node root) {
		if(root.left != null) {
			printViaDfsInorder(root.left);
		}
		
		System.out.print(root.data + " ");
		
		if(root.right != null) {
			printViaDfsInorder(root.right);
		}
	}
	
	public void printViaDfsPreorder() {
		printViaDfsPreorder(root);
	}
	
	public void printViaDfsPreorder(Node root) {
		
		System.out.print(root.data + " ");
		
		
		if(root.left != null) {
			printViaDfsPreorder(root.left);
		}
		
		
		
		if(root.right != null) {
			printViaDfsPreorder(root.right);
		}
	}
	
	
	public void printViaDfsPostorder() {
		printViaDfsPostorder(root);
	}
	
	public void printViaDfsPostorder(Node root) {
		
		if(root.left != null) {
			printViaDfsPostorder(root.left);
		}
		
		
		
		if(root.right != null) {
			printViaDfsPostorder(root.right);
		}
		
		System.out.print(root.data + " ");
	}
	
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		BinaryTree tree = new BinaryTree();
        tree.root= new Node(1);
        tree.root.left= new Node(2);
        tree.root.right= new Node(3);
        tree.root.left.left= new Node(4);
        tree.root.left.right= new Node(5);
        
       System.out.println("In order traversal of binary tree is ");
       tree.printViaDfsInorder();
       System.out.println("\n Pre order traversal of binary tree is ");
       tree.printViaDfsPreorder();
       System.out.println("\n Post order traversal of binary tree is ");
       tree.printViaDfsPostorder();
	}
}

class Node {
	
	int data;
    Node left, right;
    public Node(int item)
    {
        data = item;
        left = right = null;
    }
    
}
