package edu.neu.jon.lc.removeLinkedListElements;

import edu.neu.jon.model.ListNode;

public class Solution {
	public ListNode removeElements(ListNode head, int val) {
		ListNode pre = null;
		ListNode cur = head;

		while (cur != null) {
			if (cur.val != val) {
				pre = cur;
			} else {
				if (pre != null) {
					pre.next = cur.next;
				} else {
					head = cur.next;	// change the head if needed
				}
			}
			cur = cur.next;
		}
		return head;
	}
}
