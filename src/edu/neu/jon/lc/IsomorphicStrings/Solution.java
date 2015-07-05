package edu.neu.jon.lc.IsomorphicStrings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
	public boolean isIsomorphic(String s, String t) {
		Set<Character> seen = new HashSet<Character>();
		Map<Character, Character> map = new HashMap<Character, Character>();
		for (int i = 0; i < s.length(); i++) {
			char sC = s.charAt(i);
			char tC = t.charAt(i);
			if (map.containsKey(s.charAt(i))) {
				if (map.get(sC) != tC) {
					return false;
				}
			} else {
				if (seen.contains(tC)) {
					return false;
				} else {
					map.put(sC, tC);
					seen.add(tC);
				}
			}
		}
		return true;
	}
}
