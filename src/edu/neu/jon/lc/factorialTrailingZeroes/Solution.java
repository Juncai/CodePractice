package edu.neu.jon.lc.factorialTrailingZeroes;

public class Solution {
	public int trailingZeroes(int n) {
		int res = 0;
		int tmp = 1;
		int maxDivFive = Integer.MAX_VALUE / 5;
		while (tmp <= maxDivFive && tmp * 5 <= n) {
			tmp *= 5;
			res += n / tmp; 
		}
		return res;
	}
	
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.trailingZeroes(5));
		System.out.println(s.trailingZeroes(10));
		System.out.println(s.trailingZeroes(30));
		System.out.println(s.trailingZeroes(200));
		System.out.println(s.trailingZeroes(2147483647));
	}
}
