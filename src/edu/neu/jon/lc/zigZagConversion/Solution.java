package edu.neu.jon.lc.zigZagConversion;

public class Solution {
	public String convert(String s, int numRows) {
		if (numRows == 1) return s;
		StringBuffer[] sbArray = new StringBuffer[numRows];
		StringBuffer res = new StringBuffer();
		for (int i = 0; i < numRows; i++) {
			sbArray[i] = new StringBuffer();
		}
		int sbIndex;
		int flag;
		for (int i = 0; i < s.length(); i++) {
			flag = i % (numRows * 2 - 2) / numRows;
			sbIndex = i % (numRows * 2 - 2) % numRows;
			if (flag == 1) {
				sbIndex = numRows - sbIndex - 2;
			}
			sbArray[sbIndex].append(s.charAt(i));
		}
		for (StringBuffer sb : sbArray) {
			res.append(sb.toString());
		}
		return res.toString();
	}
	
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.convert("ABCD", 3));
	}
}
