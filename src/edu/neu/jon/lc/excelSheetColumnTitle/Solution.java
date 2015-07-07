package edu.neu.jon.lc.excelSheetColumnTitle;

public class Solution {
	public String convertToTitle(int n) {
		StringBuffer sb = new StringBuffer();
//		int mod = n % 26;
//		int div = n / 26;
		while (n / 26 > 0) {
			
			if (n % 26 == 0) {
				sb.append('Z');
				n = n / 26 - 1;
			} else {
				sb.append((char)('A' + n % 26 - 1));
				n /= 26;
			}
		}
		if (n > 0) {
			sb.append((char)('A' + n - 1));
		}
		return sb.reverse().toString();
	}
	
	public static void main(String[] args) {
		Solution s  = new Solution();
		System.out.println(s.convertToTitle(1));
		System.out.println(s.convertToTitle(26));
		System.out.println(s.convertToTitle(28));
	}
}
