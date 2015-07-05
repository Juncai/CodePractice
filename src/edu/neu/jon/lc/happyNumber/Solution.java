package edu.neu.jon.lc.happyNumber;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
	public boolean isHappy(int n) {
//		Set<Integer> seen = new HashSet<Integer>();
		List<Integer> seen = new ArrayList<Integer>();
		seen.add(n);
		while (n != 1) {
			String nStr = String.valueOf(n);
			n = 0;
			for (char c : nStr.toCharArray()) {
				n += Math.pow(Integer.parseInt(c + ""), 2);
			}
			if (seen.contains(n)) {
				return false;
			} else {
				seen.add(n);
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.isHappy(7));
	}
}
