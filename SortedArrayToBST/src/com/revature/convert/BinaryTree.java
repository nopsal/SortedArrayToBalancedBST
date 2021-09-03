package com.revature.convert;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {

	static Node root;
	List<Node> nodeList;
	
	public Node sortToBinaryTree(int arr[], int start, int end) {
		
		if(start>end) {
			return null;
		}
		
		int mid = (start+end)/2;
		Node node = new Node(arr[mid]);
		
		node.left = sortToBinaryTree(arr, start, mid-1);
		node.right = sortToBinaryTree(arr, mid+1, end);
		
		return node;
		
	}
	
	public void output(Node node) {
		if(node==null) {
			return;
		}
		System.out.print(node.data + " ");
		output(node.left);
		output(node.right);
	}
	
}
