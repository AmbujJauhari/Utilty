/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class BinaryTree
{
	Node root;
	
	public void printViaBfs() {
		int totalNumberOfLevels = totalLevelsInTree(root);
		for(int i=1;i <= totalNumberOfLevels; i++) {
			printALevel(root,i);
		}
	}
	
	public int totalLevelsInTree(Node root) {
		if(root==null) {
			return 0;
		} else {
			int lheight = totalLevelsInTree(root.left);
            int rheight = totalLevelsInTree(root.right);
             
            /* use the larger one */
            if (lheight > rheight) {
                return(lheight+1);
            } else { 
            	return(rheight+1); 
            }
		}
	}
	
	void printALevel(Node root, int level) {
		if(root==null) {
			return;
		} else if(level == 1) {
			System.out.print(root.data + " ");
		} else {
			printALevel(root.left, level-1);
			printALevel(root.right, level-1);
		}
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
        
       System.out.println("Level order traversal of binary tree is ");
       tree.printViaBfs();
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
