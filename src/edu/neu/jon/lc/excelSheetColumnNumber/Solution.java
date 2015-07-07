package edu.neu.jon.lc.excelSheetColumnNumber;

public class Solution {
	public int titleToNumber(String s) {
		int res = 0;
		for (char c : s.toCharArray()) {
			res = res * 26 + c - 'A' + 1;
		}
		return res;
	}
	
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.titleToNumber("AAB"));
	}
}
