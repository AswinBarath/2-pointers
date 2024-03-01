package two_pointers_problems;

public class Container_with_most_water {
    public int maxArea(int[] A) {
        int l = 0, r = A.length - 1;
        long maxAns = 0;
        while (l < r) {
            long width = Math.abs(r - l);
            long height = Math.min(A[l], A[r]);
            long area = width * height;
            maxAns = Math.max(maxAns, area);
            if (A[l] < A[r])
                l++;
            else
                r--;
            // System.out.print("ans="+area+", ");
        }
        return (int) maxAns;
    }
}
