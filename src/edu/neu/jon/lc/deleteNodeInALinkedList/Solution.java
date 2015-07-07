package edu.neu.jon.lc.deleteNodeInALinkedList;

import edu.neu.jon.model.ListNode;

public class Solution {
	public void deleteNode(ListNode node) {
		ListNode tmp = node;
		while (tmp.next.next != null) {
			tmp.val = tmp.next.val;
			tmp = tmp.next;
		}
		tmp.val = tmp.next.val;
		tmp.next = null;
	}
}
