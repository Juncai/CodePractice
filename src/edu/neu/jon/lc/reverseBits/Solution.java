package edu.neu.jon.lc.reverseBits;

public class Solution {
	public int reverseBits(int n) {
		String nStr = Integer.toBinaryString(n);
		nStr = String.format("%32s", nStr).replace(' ', '0');
		nStr = new StringBuffer(nStr).reverse().toString();
		return Integer.parseUnsignedInt(nStr, 2);
	}
	
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.reverseBits(43261596));
	}
}
