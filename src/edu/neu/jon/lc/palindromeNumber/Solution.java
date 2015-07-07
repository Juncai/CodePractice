package edu.neu.jon.lc.palindromeNumber;

public class Solution {
	public boolean isPalindrome(int x) {
		if (x < 0) return false;
		int numOfDigit = getNumOfDigit(x);
		while (numOfDigit > 1) {
			int tmp1 = x % 10;
			int tmp2 = (int) (x / Math.pow(10, numOfDigit - 1));
			if ((x % 10) != (int)(x / Math.pow(10, numOfDigit - 1))) return false;
			x = (int) ((x % Math.pow(10, numOfDigit - 1)) / 10);
			numOfDigit -= 2;
		}
		return true;
	}
	
	public boolean isPalindrome2(int x) {
		if (x < 0) return false;
		int div = 1;
		while (x / div >= 10) {
		div *= 10;
		}
		while (x != 0) {
		int l = x / div;
		int r = x % 10;
		if (l != r) return false;
		x = (x % div) / 10;
		div /= 100;
		}
		return true;
	}
	
	private int getNumOfDigit(int x) {
		int count = 0;
		while (x > 0) {
			x /= 10;
			count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.isPalindrome(1001));
	}
}
