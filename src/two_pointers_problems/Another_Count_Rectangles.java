package two_pointers_problems;

public class Another_Count_Rectangles {
    public int solve(int[] A, int B) {
        long rectangles = 0;
        int n = A.length;
        int l = 0, r = n - 1;
        while (l < n && r >= 0) {
            long area = 1L * A[l] * A[r];
            // long count = Math.abs(r - l) + 1;
            long count = r + 1;
            // System.out.println("A[l]="+A[l]+", A[r]="+A[r]+", Area="+area); // Debugging
            if (area < B) {
                // System.out.println("count="+count); // Debugging
                rectangles += count;
                l++;
            } else
                r--;
        }
        return (int) (rectangles % 1000000007);
    }
}
