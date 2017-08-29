package com.interviewBit.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
	static ArrayList<ArrayList<Integer>> performOps(ArrayList<ArrayList<Integer>> A) {
		ArrayList<ArrayList<Integer>> B = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < A.size(); i++) {
			B.add(new ArrayList<Integer>());

			for (int j = 0; j < A.get(i).size(); j++) {
				B.get(i).add(0);
			}

			for (int j = 0; j < A.get(i).size(); j++) {
				B.get(i).set(A.get(i).size() - 1 - j, A.get(i).get(j));
			}
		}
		return B;
	}

	public static void main(String[] args) {
		/*
		 * ArrayList<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>(); int
		 * x=1; for(int i =0 ;i<3; i++) { ArrayList<Integer> temp = new
		 * ArrayList<Integer>(); temp.add(x++); temp.add(x++); temp.add(x++);
		 * temp.add(x++); A.add(temp); } ArrayList<ArrayList<Integer>> B =
		 * performOps(A); for (int i = 0; i < B.size(); i++) { for (int j = 0; j <
		 * B.get(i).size(); j++) { System.out.print(B.get(i).get(j) + " "); } }
		 */

		ArrayList<Integer> temp = new ArrayList<Integer>();
		temp.add(6);
		// temp.add(1540383426);
		temp.add(7);
		temp.add(5);
		// temp.add(9);
		String s = "-4, 7, 5, 3, 5, -4, 2, -1, -9, -8, -3, 0, 9, -7, -4, -10, -4, 2, 6, 1, -2, -3, -1, -8, 0, -8, -7, -3, 5, -1, -8, -8, 8, -1, -3, 3, 6, 1, -8, -1, 3, -9, 9, -6, 7, 8, -6, 5, 0, 3, -4, 1, -10, 6, 3, -8, 0, 6, -9, -5, -5, -6, -3, 6, -5, -4, -1, 3, 7, -6, 5, -8, -5, 4, -3, 4, -6, -7, 0, -3, -2, 6, 8, -2, -6, -7, 1, 4, 9, 2, -10, 6, -2, 9, 2, -4, -4, 4, 9, 5, 0, 4, 8, -3, -9, 7, -8, 7, 2, 2, 6, -9, -10, -4, -9, -5, -1, -6, 9, -10, -1, 1, 7, 7, 1, -9, 5, -1, -3, -3, 6, 7, 3, -4, -5, -4, -7, 9, -6, -2, 1, 2, -1, -7, 9, 0, -2, -2, 5, -10, -1, 6, -7, 8, -5, -4, 1, -9, 5, 9, -2, -6, -2, -9, 0, 3, -10, 4, -6, -6, 4, -3, 6, -7, 1, -3, -5, 9, 6, 2, 1, 7, -2, 5 ";
		String[] arr = s.split(",");
		// ArrayList<Integer> ret = solve(temp);
		System.out.println(solve(temp));

		// int [] arr = {10, 3, 20, 40, 2};
		int[] arrI = getIntArrayFromStr(arr);
		int res = nobleInteger(arrI);
		if (res != -1)
			System.out.println("The noble integer is " + res);
		else
			System.out.println("No Noble Integer Found");

		// lets say performOps was called with A : [[1, 2, 3, 4], [5, 6, 7, 8], [9, 10,
		// 11, 12]] .

		int[][] X = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		//printMatrixInSpiralorder(X);
		System.out.println( 'A' +1);
		
		System.out.println(titleToNumber("AAA"));
		
		System.out.println(String.valueOf(1233));
		reverse(-1146467285);

		System.out.println(122%10);
		System.out.println(122/10);
	}

	private static int[] getIntArrayFromStr(String[] arr) {
		int[] arrI = new int[arr.length];
		for (int i = 0; i < arrI.length; i++) {
			arrI[i] = Integer.valueOf(arr[i].trim());
		}
		return arrI;
	}


	public static ArrayList<Integer> maxset(ArrayList<Integer> a) {
		ArrayList<Integer> currentSumList = new ArrayList<>();
		ArrayList<Integer> maxSumList = new ArrayList<>();

		long currentSum = 0;
		long maxSum = -1;
		for (int i = 0; i < a.size(); i++) {
			if (a.get(i) >= 0) {
				currentSum += a.get(i);
				currentSumList.add(a.get(i));
			} else {
				if (currentSum > maxSum) {
					maxSum = currentSum;
					maxSumList = currentSumList;
				}
				currentSum = 0;
				currentSumList = new ArrayList<>();
			}

		}
		if (currentSum > maxSum) {
			maxSum = currentSum;
			maxSumList = currentSumList;
		}
		return maxSumList;

	}

	// Arrays - minimum number of steps in infinite grid
	public static int getSteps(int[] x, int[] y) {
		int steps = 0;
		int n = x.length;
		for (int i = 1; i < n; i++) {
			int diifX = Math.abs(x[i] - x[i - 1]);
			int diifY = Math.abs(y[i] - y[i - 1]);
			int distance = Math.max(diifX, diifY);
			steps += distance;
		}
		return steps;
	}

	public static ArrayList<Integer> plusOne(ArrayList<Integer> A, int n1) {
		int length = A.size();

		int[] X = new int[length + 1];
		int[] Y = new int[length];
		int carry = n1;
		for (int i = length; i >= 1; i--) {
			if (carry == 0) {
				X[i] = A.get(i - 1);
				Y[i - 1] = A.get(i - 1);
			} else {
				int k = A.get(i - 1) + carry;
				int remaining = k % 10;
				carry = k / 10;
				X[i] = remaining;
				Y[i - 1] = remaining;
			}

		}
		ArrayList<Integer> B;
		if (carry != 0) {
			X[0] = carry;
			B = new ArrayList(Arrays.asList(X));
		} else {
			B = new ArrayList(Arrays.asList(Y));
		}

		return B;
	}

	public static ArrayList<Integer> plusOne(ArrayList<Integer> a) {
		int length = a.size();
		int[] X = new int[length + 1];
		int carry = 1;
		for (int i = length; i >= 1; i--) {
			if (carry == 0) {
				X[i] = a.get(i - 1);
			} else {
				int k = a.get(i - 1) + carry;
				int r = k % 10;
				carry = k / 10;
				X[i] = r;
			}
		}
		if (carry != 0) {
			X[0] = carry;
		}
		ArrayList<Integer> b = new ArrayList<Integer>();
		boolean start = true;
		for (int i = 0; i < length + 1; i++) {
			int k = X[i];
			if (start) {
				if (k != 0) {
					b.add(k);
					start = false;
				}
			} else {
				b.add(k);
				start = false;
			}
		}
		return b;
	}

	// Given an array arr[], find a Noble integer in it. An integer x is said to be
	// Noble in arr[] if the number of integers greater than x are equal to x. If
	// there are many Noble integers, return any of them. If there is no, then
	// return -1.
	public static int nobleInteger(int arr[]) {
		int noble = -1;
		boolean found = false;
		Arrays.sort(arr);
		int n = 0;
		int l = arr.length;
		for (int i = l; i > 0; i--) {
			if (arr[i - 1] == n) {
				noble = arr[i - 1];
				found = true;
				break;
			}
			n++;
		}
		return found ? 1 : -1;
	}

	public static int solve(ArrayList<Integer> A) {
		boolean found = false;
		Collections.sort(A);
		// int n = 0;
		int l = A.size();
		for (int i = 0; i < l - 1; i++) {

			if (A.get(i) == A.get(i + 1))
				continue;
			if (A.get(i) == l - i - 1) {
				found = true;
				break;
			}

		}
		if (A.get(l - 1) == 0)
			found = true;
		return found ? 1 : -1;
	}

	public ArrayList<Integer> wave(ArrayList<Integer> a) {
		// Collections.sort(A);
		boolean flag = true;
		int n = a.size();
		for (int i = 0; i <= n - 2; i++) {
			if (flag) {
				if (a.get(i) < a.get(i + 1)) {
					int temp = a.get(i);
					a.set(i, a.get(i + 1));
					a.set(i + 1, temp);
				}
			} else {
				if (a.get(i + 1) < a.get(i)) {
					int temp = a.get(i + 1);
					a.set(i + 1, a.get(i));
					a.set(i, temp);
				}
			}
			flag = !flag;
		}
		return a;
	}

	static void printMatrixInSpiralorder(int[][] arr) {
		int rows = arr.length;
		int cols = arr[0].length;
		boolean fromLeft = true;
		for (int i = 0; i < rows; i++) {
			if (fromLeft) {
				for (int j = 0; j < cols; j++) {
					System.out.print(arr[i][j] + " ");
				}
			} else {
				for (int j = cols - 1; j >= 0; j--) {
					System.out.print(arr[i][j] + " ");
				}
			}
			fromLeft = !fromLeft;
		}
	}

	public int hammingDistance(final List<Integer> A) {
        int n = A.size();
        int dist = 0;
        for(int i = 0; i < 31; i++) {
            int oneCount = 0;
            for(int j = 0; j < n; j++) {
                int num = A.get(j);
                oneCount += (num & 1 << i) != 0? 1 : 0;
            }
            int zeroCount = n - oneCount;
            dist += (2L * oneCount * zeroCount) % 1000000007;
            dist = dist % 1000000007;
        }
        return dist;
    }
	
	static void printString(int n)
	{
		//int r = n/
	}
	/*
	 * Simple math.

This is just like base 26 number conversion.

number = 26^0 * (S[n - 1] - ‘A’ + 1) + 26^1 * (S[n - 2] - ‘A’ + 1) + ….

We recommend you to check out the piece on base number conversion in articles again. Please also attempt the sample problem associated with it.
	 */
	public static int titleToNumber(String a) {
	    int sum = 0;
	    char[] arr = a.toCharArray();
	    for(int i=0; i<arr.length; i++) {
	    		sum = sum *26;
	        sum = sum + arr[i] -'A' + 1;
	    }
	    return sum;
	}
	
	public int gcd(int a, int b) {
	    if(b==0) return a;
	    return gcd(b, a%b);
	}
	
	public boolean isPalindrome(int a) {
	    String s = String.valueOf(a);
	    int n = s.length();
	    boolean isPalindrome = false;
	    int i;
	    for(i=0;i<n;i++) {
	        if(s.charAt(i) != s.charAt(n-i-1)){
	            break;
	        }
	        
	    }
	    if(i==n) {
	        isPalindrome =true;
	    }
	    return isPalindrome;
	}
	
	public static int reverse(int a) {
	    boolean isNegative = a<0;
	    a = Math.abs(a);
	    String s =String.valueOf(a);
	    StringBuilder sb = new StringBuilder(s);
	    sb= sb.reverse();
	    try{
	        int x = Integer.valueOf(sb.toString());
	        return isNegative ? Math.negateExact(x): x;
	    }catch(Exception e) {
	        return 0;
	    }
	    
	    
	    //644643544 644643544 644643544 644643544 644643544 909204 644643544 909204 465865082 465865082 243519307 573041392 243519307 776647984 573041392 884224920 884224920 243519307 626132265 26748055 26748055 118819922 26748055 12108907 26748055 12108907 895351682 12108907 127364950 12108907 76234642 12108907 12108907 76234642 12108907 12108907 12108907 593912449 12108907 12108907 120254050 120254050 12108907 281700253 107300696 107300696 348668934 348668934 12108907 12108907 646116941 12108907 12108907 12108907 12108907 488822038 12108907 12108907 12108907 646116941 12108907 12108907 185805946 185805946 185805946 12108907 12108907 12108907 12108907 238471928 238471928 12108907 348668934 12108907 12108907 348668934 12108907 743998858 12108907 182168561 12108907 12108907 12108907 89970109 89970109 528152523 750873206 750873206 12108907 125328730 750873206 860096457 860096457 12108907 12108907 12108907 561229779 750873206 750873206 750873206 12108907 89970109 89970109 12108907 89970109 12108907 89970109 12108907 12108907 12108907 22516828 12108907 12108907 12108907 12108907 12108907 243176345 12108907 12108907 12108907 12108907 12108907 12108907 517352357 12108907 895351682 12108907 847833679 26748055 26748055 26748055 26748055 12108907 573041392 652875950 606686342 12108907 606686342 606686342 12108907 917778387 118202971 809454497 12108907 12108907 118202971 118202971 12108907 12108907 724206024 724206024 724206024 917778387 652875950 652875950 652875950 652875950 12108907 12108907 12108907 926280810 12108907 12108907 7007596 7007596 926280810 926280810 7007596 652875950 7007596 7007596 7007596 964576672 652875950 7007596 349308524 7007596 7007596 824230322 573041392 7007596 7007596 54394415 7007596 7007596 7007596 7007596 7007596 296766867 754491210 754491210 7007596 -1 780809279 998849637 57337424 57337424 57337424 7007596 814651044 814651044 7007596 7007596 780809279 89830827 7007596 662618586 730272441 247368207 7007596 7007596 621571093 247368207 7007596 247368207 247368207 7007596 7007596 7007596 89830827 136877685 278152626 7007596 278152626 278152626 278152626 7007596 -1 7007596 229722550 7007596 7007596 7007596 121870305 618922784 618922784 7007596 7007596 604617481 7007596 7007596 -1 -1 9071319 7007596 369222651 7007596 7007596 7007596 7007596 327003375 7007596 7007596 7007596 7007596 972120060 7007596 327003375 327003375 327003375 327003375 327003375 327003375 7007596 7007596 7007596 7007596 9071319 9071319 7007596 593298567 7007596 7007596 895785982 895785982 895785982 895785982 7007596 126101020 576987968 -1 -1 -1 -1 -1 -1 7007596 7007596 7007596 7007596 7007596 709040762 709040762 7007596 7007596 7007596 -1 103302239 7007596 103302239 103302239 7007596 731860400 -1 -1 -1 -1 -1 -1 -1 7007596 373884541 -1 -1 280232551 121479941 -1 -1 304880476 7007596 304880476 304880476 7007596 7007596 7007596 39553022 39553022 7007596 174625619 174625619 45007612 7007596 7007596 7007596 2359009 2359009 2359009 2359009 2359009 2359009 -1 -1 -1 -1 964834539 934935549 2359009 2359009 934935549 353623991 2359009 2359009 1670863 1670863 1670863 1670863 580149290 580149290 777712799 1670863 555402283 1670863 1670863 1670863 1670863 1670863 1670863 777712799 1670863 1670863 1670863 1670863 1670863 1670863 745438423 88773973 1670863 1670863 492794836 492794836 911490527 911490527 1670863 1670863 29843435 911490527 492794836 492794836 179753601 1670863 1670863 1670863 353623991 353623991 353623991 1670863 54582821 619917644 1670863 1670863 -1 -1 -1 1670863 366155438 1670863 1670863 1670863 1670863 1670863 585762794 482263814 585762794 1670863 891773904 1670863 136953609 1670863 136953609 536501786 891773904 1670863 1670863 337604683 1670863 -1 12446017 12446017 1670863 859363430 859363430 970004511 1670863 660673550 307165825 307165825 1670863 27229714 27229714 1670863 1670863 829997260 1670863 1670863 464667952 1670863 955115299 1670863 27229714 1670863 660673550 
	    
	    //644643544 644643544 644643544 644643544 909204 909204 909204 909204 465865082 465865082 909204 573041392 909204 776647984 573041392 884224920 884224920 909204 626132265 909204 909204 118819922 909204 909204 26748055 909204 895351682 909204 127364950 909204 76234642 909204 909204 76234642 909204 909204 909204 593912449 909204 909204 120254050 120254050 909204 281700253 107300696 107300696 348668934 348668934 909204 909204 646116941 909204 909204 909204 909204 488822038 909204 909204 909204 646116941 909204 909204 185805946 185805946 185805946 909204 909204 909204 909204 238471928 238471928 909204 348668934 909204 909204 348668934 909204 743998858 909204 182168561 909204 909204 909204 89970109 89970109 528152523 750873206 750873206 909204 125328730 750873206 860096457 860096457 909204 909204 909204 561229779 750873206 750873206 750873206 909204 89970109 89970109 909204 89970109 909204 89970109 909204 909204 909204 22516828 909204 909204 909204 909204 909204 243176345 909204 909204 909204 909204 909204 909204 517352357 909204 895351682 909204 847833679 26748055 26748055 26748055 26748055 909204 573041392 652875950 606686342 909204 606686342 606686342 909204 917778387 118202971 809454497 909204 909204 118202971 118202971 909204 909204 724206024 724206024 724206024 917778387 652875950 652875950 652875950 652875950 909204 909204 909204 926280810 909204 909204 909204 909204 926280810 926280810 909204 652875950 909204 909204 909204 964576672 652875950 909204 349308524 909204 909204 824230322 573041392 909204 909204 54394415 909204 909204 909204 909204 909204 296766867 754491210 754491210 909204 -1 780809279 998849637 57337424 57337424 57337424 780809279 814651044 814651044 780809279 780809279 780809279 89830827 89830827 662618586 730272441 247368207 89830827 89830827 621571093 247368207 89830827 247368207 247368207 89830827 89830827 89830827 89830827 136877685 278152626 89830827 278152626 278152626 278152626 89830827 -1 229722550 229722550 229722550 121870305 121870305 121870305 618922784 618922784 618922784 462348827 604617481 604617481 604617481 -1 -1 9071319 9071319 369222651 9071319 9071319 9071319 9071319 327003375 9071319 9071319 9071319 9071319 972120060 9071319 327003375 327003375 327003375 327003375 327003375 327003375 9071319 9071319 9071319 9071319 9071319 9071319 895785982 593298567 152298972 895785982 895785982 895785982 895785982 895785982 86452767 126101020 576987968 -1 -1 -1 -1 -1 -1 709040762 709040762 709040762 709040762 709040762 709040762 709040762 709040762 533112170 533112170 -1 103302239 103302239 103302239 103302239 103302239 731860400 -1 -1 -1 -1 -1 -1 -1 373884541 373884541 -1 -1 280232551 121479941 -1 -1 304880476 304880476 304880476 304880476 39553022 39553022 39553022 39553022 39553022 45007612 174625619 174625619 45007612 45007612 45007612 135094596 2359009 2359009 2359009 2359009 2359009 304880476 -1 -1 -1 -1 964834539 934935549 186258833 186258833 934935549 353623991 186258833 165212936 1670863 1670863 1670863 179753601 580149290 580149290 777712799 21842309 555402283 21842309 21842309 21842309 21842309 21842309 21842309 777712799 21842309 21842309 179753601 179753601 179753601 179753601 745438423 88773973 179753601 179753601 492794836 492794836 911490527 911490527 179753601 29843435 29843435 911490527 492794836 492794836 179753601 179753601 179753601 186258833 353623991 353623991 353623991 186258833 54582821 619917644 54582821 54582821 -1 -1 -1 366155438 366155438 366155438 366155438 119307898 119307898 119307898 585762794 482263814 585762794 119307898 891773904 119307898 136953609 119307898 136953609 536501786 891773904 119307898 119307898 337604683 119307898 -1 12446017 12446017 12446017 859363430 859363430 970004511 660673550 660673550 307165825 307165825 27229714 27229714 27229714 27229714 27229714 829997260 27229714 27229714 464667952 27229714 955115299 27229714 27229714 27229714 660673550 
	}
}
