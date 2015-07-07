package edu.neu.jon.lc.lowestCommonAncestorOfBST;

import edu.neu.jon.model.TreeNode;

public class Solution {
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode ans = root;
        int left, right;
        if (p.val > q.val) {
        	left = q.val;
        	right = p.val;
        } else {
        	left = p.val;
        	right = q.val;
        }
        while (ans != null) {
        	if (ans.val < left) {
        		ans = ans.right;
        	} else if (ans.val > right) {
        		ans = ans.left;
        	} else {
        		break;
        	}
        }
        
        return ans;
    }
}
