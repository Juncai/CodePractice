package edu.neu.jon.lc.numberOf1Bits;

public class Solution {
	public int hammingWeight(int n) {
		String nStr = Integer.toBinaryString(n);
		int count = 0;
		for (char c : nStr.toCharArray()) {
			if (c == '1') {
				count++;
			}
		}
		return count;
	}
}
