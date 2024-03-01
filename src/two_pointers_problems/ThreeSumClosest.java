package two_pointers_problems;

import java.util.Arrays;

public class ThreeSumClosest {
    public int threeSumClosest(int[] nums, int B) {
        Arrays.sort(nums);
        int res = Integer.MIN_VALUE;
        // Runs the loop till 3rd last index to form the final valid triplet
        for (int i = 0; i < nums.length - 2; i++) {
            int lo = i + 1;
            int hi = nums.length - 1;
            int twoSum = B - nums[i];
            // System.out.println("twoSum="+twoSum); // Debugging
            // Two pointer approach
            while (lo < hi) {
                int currSum = (nums[lo] + nums[hi]);
                if (currSum <= twoSum) {
                    res = Math.max(res, (currSum + nums[i]));
                    lo++;
                    // System.out.println("nums[lo]="+nums[lo]+", nums[hi]="+nums[hi]); // Debugging
                    // System.out.println("res="+res); // Debugging
                }
                else
                    hi--;
            }
        }
        return res;
    }
}

/*
 * Problem Description
 * Given an array A of N integers, find three integers in A such that the sum is
 * closest to a given number B. Return the sum of those three integers.
 * 
 * Assume that there will only be one solution.
 * 
 * 
 * 
 * Problem Constraints
 * -108 <= B <= 108
 * 1 <= N <= 104
 * -108 <= A[i] <= 108
 * 
 * 
 * Input Format
 * First argument is an integer array A of size N.
 * 
 * Second argument is an integer B denoting the sum you need to get close to.
 * 
 * 
 * 
 * Output Format
 * Return a single integer denoting the sum of three integers which is closest
 * to B.
 * 
 * 
 * 
 * Example Input
 * Input 1:
 * 
 * A = [-1, 2, 1, -4]
 * B = 1
 * Input 2:
 * 
 * 
 * A = [1, 2, 3]
 * B = 6
 * 
 * 
 * Example Output
 * Output 1:
 * 
 * 2
 * Output 2:
 * 
 * 6
 * 
 * 
 * Example Explanation
 * Explanation 1:
 * 
 * The sum that is closest to the target is 2. (-1 + 2 + 1 = 2)
 * Explanation 2:
 * 
 * Take all elements to get exactly 6.
 */