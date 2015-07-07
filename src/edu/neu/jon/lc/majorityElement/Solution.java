package edu.neu.jon.lc.majorityElement;

public class Solution {
	public int majorityElement(int[] nums) {
		int maj_ind = 0;
		int count = 1;
		
		for (int i = 1; i < nums.length; i++) {
			if (nums[maj_ind] == nums[i]) {
				count++;
			} else {
				count--;
			}
			if (count == 0) {
				maj_ind = i;
				count = 1;
			}
		}
		
		return nums[maj_ind];
	}
}
