package com.interviewBit.tree;

import java.util.ArrayList;

public class InorderTraversal {
	public ArrayList<Integer> inorderTraversal(TreeNode a) {
		ArrayList<Integer> intList = new ArrayList<>();
		inorderTraversal(a, intList);
		return intList;
	}

	private void inorderTraversal(TreeNode a, ArrayList<Integer> intList) {
		if(a.left != null) {
			inorderTraversal(a.left, intList);
		}
		intList.add(a.val);
		if(a.right != null) {
			inorderTraversal(a.right, intList);
		}
	}
}
