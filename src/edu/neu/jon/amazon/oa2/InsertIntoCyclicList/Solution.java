package edu.neu.jon.amazon.oa2.InsertIntoCyclicList;

import edu.neu.jon.model.ListNode;

public class Solution {
	public void insertIntoCyclicList(ListNode head, ListNode tar) {
		if (head == null) return;
		ListNode realHead = head;
		ListNode tail;
		if (tar.val < head.val) {
			while (realHead.next != head) {
				if (realHead.val > realHead.next.val) {
					tail = realHead;
					realHead = realHead.next;
					break;
				}
				realHead = realHead.next;
			}
		}
		
	}
}
