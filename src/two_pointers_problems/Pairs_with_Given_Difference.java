package two_pointers_problems;

import java.util.Arrays;

public class Pairs_with_Given_Difference {
    // Problem => Count Distinct pairs => means don't count equal pairs more than once
    // example => (1,1) cnt++; don't count (1,1) again next time in array
    public int solve(int[] A, int B) {
        int n = A.length;
        if (n == 1)
            return 0;
        Arrays.sort(A);
        // System.out.println(Arrays.toString(A)); // Debugging
        long pairs = 0;
        int l = 0, r = 1;
        while (l < n && r < n) {
            long diff = A[r] - A[l];
            if (diff == B && r != l) {
                pairs += 1;
                int lVal = A[l];
                while (l < n && A[l] == lVal)
                    l++;
                int rVal = A[r];
                while (r < n && A[r] == rVal)
                    r++;
            } else if (diff < B)
                r++;
            else
                l++;
        }
        return (int) (pairs);
    }
}

/*
 * Problem Description
 * Given an one-dimensional integer array A of size N and an integer B.
 * 
 * Count all distinct pairs with difference equal to B.
 * 
 * Here a pair is defined as an integer pair (x, y), where x and y are both
 * numbers in the array and their absolute difference is B.
 * 
 * 
 * 
 * Problem Constraints
 * 1 <= N <= 104
 * 
 * 0 <= A[i], B <= 105
 * 
 * 
 * 
 * Input Format
 * First argument is an one-dimensional integer array A of size N.
 * 
 * Second argument is an integer B.
 * 
 * 
 * 
 * Output Format
 * Return an integer denoting the count of all distinct pairs with difference
 * equal to B.
 * 
 * 
 * 
 * Example Input
 * Input 1:
 * 
 * A = [1, 5, 3, 4, 2]
 * B = 3
 * Input 2:
 * 
 * A = [8, 12, 16, 4, 0, 20]
 * B = 4
 * Input 3:
 * 
 * A = [1, 1, 1, 2, 2]
 * B = 0
 * 
 * 
 * Example Output
 * Output 1:
 * 
 * 2
 * Output 2:
 * 
 * 5
 * Output 3:
 * 
 * 2
 * 
 * 
 * Example Explanation
 * Explanation 1:
 * 
 * There are 2 unique pairs with difference 3, the pairs are {1, 4} and {5, 2}
 * Explanation 2:
 * 
 * There are 5 unique pairs with difference 4, the pairs are {0, 4}, {4, 8}, {8,
 * 12}, {12, 16} and {16, 20}
 * Explanation 3:
 * 
 * There are 2 unique pairs with difference 0, the pairs are {1, 1} and {2, 2}.
 */