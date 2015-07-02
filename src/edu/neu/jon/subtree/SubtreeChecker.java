package edu.neu.jon.subtree;

import edu.neu.jon.model.TreeNode;

public class SubtreeChecker {

	public static boolean isSubtree (TreeNode r1, TreeNode r2) {
		// if the in-order + pre-order / post-order traversal of two trees are 
		// the same, then these two trees are identical
		String inorderStringForR1 = getInOrderTraversalStr(r1);
		String inorderStringForR2 = getInOrderTraversalStr(r2);
		if (!inorderStringForR1.contains(inorderStringForR2)) return false;
		
		String postOrderStringForR1 = getPostOrderTraversalStr(r1);
		String postOrderStringForR2 = getPostOrderTraversalStr(r2);
		if (!postOrderStringForR1.contains(postOrderStringForR2)) return false;
		return true;
	}
	
	public static String getInOrderTraversalStr(TreeNode r) {
		
		if (r == null) return "";
		String leftStr = getInOrderTraversalStr(r.left);
		String rightStr = getInOrderTraversalStr(r.right);
		return leftStr.trim() + " " + r.val + " " + rightStr.trim();
	}
	
	public static String getPostOrderTraversalStr(TreeNode r) {
		
		if (r == null) return "";
		String leftStr = getPostOrderTraversalStr(r.left);
		String rightStr = getPostOrderTraversalStr(r.right);
		return leftStr.trim() + " " + rightStr.trim() + " " + r.val;
	}
	
}
