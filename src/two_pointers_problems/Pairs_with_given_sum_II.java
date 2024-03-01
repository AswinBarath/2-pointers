package two_pointers_problems;

public class Pairs_with_given_sum_II {
    public int solve(int[] A, int B) {
        int n = A.length;
        long pairs = 0;
        int l = 0, r = n - 1;
        while (l < r) {
            long sum = A[l] + A[r];
            if (sum == B) {
                if (A[l] == A[r]) {
                    long count = r - l + 1;
                    pairs += (count * (count - 1) / 2);
                    return (int) (pairs % 1000000007);
                }
                // A[l] != A[r]
                int lVal = A[l];
                long lCount = 0;
                while (A[l] == lVal) {
                    lCount++;
                    l++;
                }
                int rVal = A[r];
                long rCount = 0;
                while (A[r] == rVal) {
                    rCount++;
                    r--;
                }
                pairs += lCount * rCount;
            } else if (sum < B)
                l++;
            else
                r--;
        }
        return (int) (pairs % 1000000007);
    }
}
