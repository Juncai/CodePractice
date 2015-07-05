package edu.neu.jon.lc.invertBinaryTree;

import edu.neu.jon.model.TreeNode;

public class Solution {
    public TreeNode invertTree(TreeNode root) {
    	if (root != null) {
    		TreeNode node = root.left;
    		root.left = root.right;
    		root.right = node;
    		invertTree(root.left);
    		invertTree(root.right);
    	}
    	return root;
    }
}
