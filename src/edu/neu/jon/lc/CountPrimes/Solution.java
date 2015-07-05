package edu.neu.jon.lc.CountPrimes;

public class Solution {
/*	
 * this solution exceeds the time limit
 * public int countPrimes(int n){
		int count = 0;
		for (int i = 1; i < n; i ++) {
			if (isPrime(i)) count++;
		}
		return count;
	}
	
	public boolean isPrime(int num) {
		if (num < 2) return false;
		for (int i = 2; i * i < num; i++){
			if (num%i == 0 && num != i) {
				return false;
			}
		}
		return true;
	}*/
	
	public int countPrimes(int n) {
		int count = 0;
		boolean[] isPrime = new boolean[n];
		// preset all numbers that larger than 1 to true
		for (int i = 2; i < n; i++) {
			isPrime[i] = true;
		}
		
		for (int i = 2; i < Math.sqrt(n); i++) {
			// the actual number in isPrime[i] is i
			if (isPrime[i]) {
				for (int j = 2 * i; j < n; j += i) {
					isPrime[j] = false;
				}
			}
		}
		
		for (boolean b : isPrime) {
			if (b) {
				count++;
			}
		}
		return count;
	}
}
