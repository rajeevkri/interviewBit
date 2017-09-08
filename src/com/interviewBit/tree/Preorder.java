package com.interviewBit.tree;

import java.util.ArrayList;
import java.util.Stack;

public class Preorder {

	public ArrayList<Integer> preorderTraversal(TreeNode a) {

		if (a == null) {
			return null;
		}
		ArrayList<Integer> iList = new ArrayList<>();
		Stack<TreeNode> nodeStack = new Stack<>();
		nodeStack.push(a);

		while (nodeStack.empty() == false) {

			TreeNode mynode = nodeStack.peek();
			iList.add(mynode.val);
			nodeStack.pop();

			if (mynode.right != null) {
				nodeStack.push(mynode.right);
			}
			if (mynode.left != null) {
				nodeStack.push(mynode.left);
			}
		}
		return iList;
	}
}
