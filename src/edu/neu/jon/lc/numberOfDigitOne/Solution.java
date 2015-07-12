package edu.neu.jon.lc.numberOfDigitOne;

public class Solution {
	public int countDigitOne(int n) {
		if (n <= 0) return 0;
		int count = 0;
		String nStr = n + "";
		for (int i = 0; i < nStr.length(); i++) {
			count += countDigitOneHelper(n, i);
		}
		
		return count;
	}
	
	private int countDigitOneHelper(int n, int ind) {
		int count = 0;

		// pre-process
		String nStr = n + "";
		int cDigit = Integer.valueOf(nStr.charAt(ind) + "");
		String preDigits = nStr.substring(0, ind);
		int preNum = preDigits.length() > 0 ? Integer.valueOf(preDigits) : 0;
		String postDigits = nStr.substring(ind + 1);
		int postNum = postDigits.length() > 0 ? Integer.valueOf(postDigits) : 0;
		int postLen = postDigits.length();

		if (cDigit > 1) {
			count = (int) ((preNum + 1) * Math.pow(10, postLen));
		} else if (cDigit == 1) {
			count += (int)(preNum * Math.pow(10, postLen));
			count += postNum + 1;
		} else {
			count += (int)(preNum * Math.pow(10, postLen));
		}
		
		return count;
	}
	
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.countDigitOne(11));
	}
}
