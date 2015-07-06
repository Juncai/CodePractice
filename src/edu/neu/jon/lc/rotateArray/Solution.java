package edu.neu.jon.lc.rotateArray;


public class Solution {
	public void rotate(int[] nums, int k) {
		// use an array to cache part of the original array
		k = k % nums.length;
		int[] res = new int[k];
		for (int i = (nums.length - k); i < nums.length; i++) {
			res[i+k-nums.length] = nums[i];
		}
		for (int i = nums.length-k-1; i >= 0;  i--) {
			nums[i+k] = nums[i];
		}
		for (int i = 0; i < k; i++) {
			nums[i] = res[i];
		}
	}
	
//	public void rotate2 (int[] nums, int k) {
//		k = k % nums.length;
//		if (k == 0) return;
//		int cIndex = 0;	// start from the first element
//		int cTmp = nums[cIndex];
//		int nIndex = (cIndex + k) % nums.length;
//		int nTmp;
//		for (int i = 0; i < nums.length; i++) {
//			nTmp = nums[nIndex];
//			nums[nIndex] = cTmp;
//			cIndex = nIndex;
//			nIndex = (cIndex + k) % nums.length;
//			cTmp = nTmp;
//		}
//	}
	
	public void rotate3 (int[] nums, int k) {
		k = k % nums.length;
		reverse(nums, 0, nums.length - 1);	// reverse whole array
		reverse(nums, 0, k - 1);	// reverse the first part
		reverse(nums, k, nums.length - 1);	// reverse the second part
	}
	
	private void reverse(int[] nums, int head, int tail) {
		int tmp;
		while(head < tail) {
			tmp = nums[head];
			nums[head] = nums[tail];
			nums[tail] = tmp;
			head++;
			tail--;
		}
	}
	
	public static void main(String[] args) {
		Solution s = new Solution();
		int nums[] = new int[] {1, 2, 3, 4, 5, 6};
//		nums = new int[] {1, 2};
		s.rotate3(nums, 3);
		s.printArray(nums);
	}
	
	private void printArray(int[] a) {
		for (int i : a) {
			System.out.println(i);
		}
	}
}
