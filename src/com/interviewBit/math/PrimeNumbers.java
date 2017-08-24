package com.interviewBit.math;

import java.util.ArrayList;
import java.util.Arrays;

public class PrimeNumbers {
	public static ArrayList<Integer> sieve(int a) {
		boolean prime [] = new boolean[a + 1];
	    Arrays.fill(prime, true);
	    prime[0] = prime[1] = false;
	    
	    for (int i = 2; i <= a; i++) {
	        if (!prime[i])
	            continue;
	            
	        for (long j = 1L * i * i; j <= (long) a; j += i)
	            prime[(int) j] = false;
	    }
	    
	    ArrayList<Integer> res = new ArrayList<>();
	    
	    for (int i = 0; i <= a; i++) {
	        if (prime[i])
	            res.add(i);
	    }
	    
	    return res;
	}

	public static void main(String[] args) {
		System.out.println(sieve(100000));
	}
}
