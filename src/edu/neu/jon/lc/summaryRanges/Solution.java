package edu.neu.jon.lc.summaryRanges;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<String> summaryRanges(int[] nums) {
		List<String> los = new ArrayList<String>();
		if (nums.length == 0) return los;
		int cInt = nums[0];
		int head = nums[0];
		for (int i = 1; i < nums.length; i++) {
			if (nums[i] != cInt + 1) {
				if (head == cInt) {
					los.add(head + "");
				} else {
					los.add(head + "->" + cInt);
				}
				head = nums[i];
			}
			cInt = nums[i];
		}
		if (head == cInt) {
			los.add(head + "");
		} else {
			los.add(head + "->" + cInt);
		}
		
		return los;
	}
	
	public static void main(String[] args) {
		Solution s = new Solution();
		int nums[] = new int[]{1, 2, 4};
		for (String str : s.summaryRanges(nums)) {
			System.out.println(str);
		}
	}
}
