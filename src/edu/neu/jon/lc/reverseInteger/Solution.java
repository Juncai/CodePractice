package edu.neu.jon.lc.reverseInteger;

public class Solution {
	public int reverse(int x) {
		int res = 0;
		char[] xStr = (x + "").toCharArray();
		int head = 0;
		int end = xStr.length - 1;
		char tmp;
		if (xStr[0] == '-') {
			head++;
		}
		while (head < end) {
			tmp = xStr[head];
			xStr[head] = xStr[end];
			xStr[end] = tmp;
			head++;
			end--;
		}
		try {
			res = Integer.valueOf(String.valueOf(xStr));
		} catch (Exception e) {
			res = 0;
		}
		return res;
	}
	
	public int reverseInteger(int x) {
		long xx = x, res = 0, left = 0;
		boolean neg = false;
		if (xx < 0) {
			neg = true;
			xx = -xx;
		}
		while(xx != 0) {
			left = xx % 10;
			res = res * 10 + left;
			xx = xx / 10;
		}

		res = (res > Integer.MAX_VALUE) ? 0 : res;
		return neg ? (int)(-res) : (int)res;
	}
	
	public static void main(String[] args) {
//		Solution s = new Solution();
//		System.out.println(s.reverse(1534236469));
		System.out.println(964632435 * 10 + 1);
	}
}
