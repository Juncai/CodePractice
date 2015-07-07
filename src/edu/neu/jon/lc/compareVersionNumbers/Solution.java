package edu.neu.jon.lc.compareVersionNumbers;

public class Solution {
	public int compareVersion(String version1, String version2) {
		String[] sa1 = version1.split("\\.");
		String[] sa2 = version2.split("\\.");
		int verSum1 = 0;
		int verSum2 = 0;
		boolean flip = false;
		if (sa1.length < sa2.length) {
			String[] tmp = sa1;
			sa1 = sa2;
			sa2 = tmp;
			flip = true;
		}
		for (int i = 0; i < sa2.length; i++) {
			verSum1 += Integer.valueOf(sa1[i]);
			verSum2 += Integer.valueOf(sa2[i]);
			if (verSum1 != verSum2) {
				if (verSum1 > verSum2) {
					return flip ? -1 : 1;
				} else {
					return flip ? 1 : -1;
				}
			}
		}
		for (int i = sa2.length; i < sa1.length; i++) {
			verSum1 += Integer.valueOf(sa1[i]);
		}
		
		if (verSum1 > verSum2) {
			return flip ? -1 : 1;
		}
		return 0;
	}

	public static void main(String[] args) {
		System.out.println("1.1".split("\\.").length);
		Solution s = new Solution();
		System.out.println(s.compareVersion("1.1", "1.1.1"));
		System.out.println(s.compareVersion("1.1", "1.1.0"));
	}
}
