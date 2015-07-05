package edu.neu.jon.lc.reverseLinkedList;

import edu.neu.jon.model.ListNode;

public class Solution {
	public ListNode reverseList(ListNode head) {
		if (head == null) return head;
		ListNode prev = null;
		ListNode current = null;
		ListNode next = head;
		while (next != null) {
			prev = current;
			current = next;
			next = next.next;
			current.next = prev;
		}
		return current;
	}
}
