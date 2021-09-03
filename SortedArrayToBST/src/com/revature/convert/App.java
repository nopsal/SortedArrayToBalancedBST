package com.revature.convert;

import java.util.List;

public class App {

		public static void main(String[] args) {
			BinaryTree bt = new BinaryTree();
			int arr[] = new int[] {1,2,3,4,5,6,7,8,9};
			int l = arr.length;
			Node root = bt.sortToBinaryTree(arr, 0, l-1);
			bt.output(root);
			
		}
		
}
