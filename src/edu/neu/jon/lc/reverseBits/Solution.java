package edu.neu.jon.lc.reverseBits;

public class Solution {
	public int reverseBits(int n) {
		String nStr = Integer.toBinaryString(n);
		nStr = String.format("%32s", nStr).replace(' ', '0');
		nStr = new StringBuffer(nStr).reverse().toString();
		return Integer.parseUnsignedInt(nStr, 2);
	}
	
	public int reverseBitsBitManipulation(int n) {
		int res = 0;
		for (int i = 0; i < 32; i++) {
			if((n & 1) == 1) {
				res = (res << 1) + 1;
			} else {
				res = res << 1;
			}
			n = n >> 1;
		}
		return res;
	}
	
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.reverseBitsBitManipulation(43261596));
//		int n = 128;
//		System.out.println(n >> 1);
		
	}
}
