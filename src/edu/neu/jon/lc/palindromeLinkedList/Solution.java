package edu.neu.jon.lc.palindromeLinkedList;

import edu.neu.jon.model.ListNode;

public class Solution {
	public boolean isPalindrome(ListNode head) {
		ListNode p1 = head;
		ListNode p2 = head;
		ListNode tailOne = p1;
		ListNode headOne;
		ListNode headTwo;
		while (p2.next != null) {
			tailOne = p1;
			p1 = p1.next;
			p2 = p2.next.next;
		}
		headTwo = p1;
		if (p2 == null) {	// even number of list nodes
			tailOne.next = null;
		} else {	// odd number of list node
			tailOne.next = new ListNode(p1.val);
		}
		headOne = reverseList(head);
		while (headOne != null) {
			if (headOne.val != headTwo.val) return false;
		}
		return true;
	}
	
	private ListNode reverseList(ListNode head) {
		ListNode pre = null;
		ListNode cur = head;
		ListNode next = cur.next;
		
		while (next != null) {
			cur.next = pre;
			pre = cur;
			cur = next;
			next = next.next; 
		}
		cur.next = pre;
		return cur;
	}
	
	public static void main(String[] args) {
		Solution s = new Solution();
		ListNode h = new ListNode(1);
		ListNode n2 = new ListNode(2);
		ListNode n3 = new ListNode(1);
		h.next = n2;
		n2.next = n3;
//		System.out.println(s.isPalindrome(head));
	}
}
