package edu.neu.jon.lc.stringToInteger;

public class Solution {
	public int myAtoi(String str) {
		if (str.length() == 0) return 0;
		int head = 0;
		boolean neg = false;
		int res = 0;
		int maxModTen = Integer.MAX_VALUE % 10;
		int maxDivTen = Integer.MAX_VALUE / 10;
		int minModTen = -(Integer.MIN_VALUE % 10);
		while (str.charAt(head) == ' ') {
			head++;
		}
		
		if (str.charAt(head) == '-') {
			head++;
			neg = true;
		} else if (str.charAt(head) == '+') {
			head++;
		}
		
		for (int i = head; i < str.length(); i++) {
			char c = str.charAt(i);
			if (!Character.isDigit(c)) {
				break;
			}
//			int cInt = Character.getNumericValue(c);
			int cInt = c - '0';
			if (res > maxDivTen) {
				return neg ? Integer.MIN_VALUE : Integer.MAX_VALUE;
			} 
			if (res == maxDivTen) {
				if (neg) {
					if (cInt > minModTen) return Integer.MIN_VALUE;
				} else {
					if (cInt > maxModTen) return Integer.MAX_VALUE;
				}
			}
			res = res * 10 + cInt;
		}

		return neg ? -res : res;
	}
	
	public static void main(String[] args) {
		System.out.println("-11111".compareTo("-7511"));
		System.out.println((-111)%10);
		Solution s = new Solution();
//		System.out.println(s.myAtoi("      -11919730356x"));
//		System.out.println(s.myAtoi("+1"));
		System.out.println(s.myAtoi("-2147483647"));
	}
}
