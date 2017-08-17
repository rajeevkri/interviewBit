package com.interviewBit.math;

/**
 * A robot is located at the top-left corner of an A x B grid. The robot can
 * only move either down or right at any point in time. The robot is trying to
 * reach the bottom-right corner of the grid (marked ‘Finish’ in the diagram
 * below).
 * 
 * How many possible unique paths are there?
 * 
 * Note: A and B will be such that the resulting answer fits in a 32 bit signed
 * integer.
 * 
 * Example :
 * 
 * Input : A = 2, B = 2 Output : 2
 * 
 * 2 possible routes : (0, 0) -> (0, 1) -> (1, 1) OR : (0, 0) -> (1, 0) -> (1,
 * 1)
 * 
 * @author rajeevsingh
 *
 */
public class GridUniquePath {
	public int uniquePaths(int a, int b) {
		if (a == 1 && b == 1) {
			return 1;
		} else {
			int leftPath = a - 1 > 0 ? uniquePaths(a - 1, b) : 0;
			int rightPath = b - 1 > 0 ? uniquePaths(a, b - 1) : 0;
			return leftPath + rightPath;
		}
	}
}
