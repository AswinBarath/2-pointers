package two_pointers_problems;

import java.util.ArrayList;

public class Subarray_with_given_sum {
    public ArrayList<Integer> solve(ArrayList<Integer> A, int B) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        int l = 0, r = 0, n = A.size();
        long sum = A.get(0);
        // ans.add(A.get(0));
        while (r < n) {
            if (sum == B) {
                break;
            } else if (sum < B) {
                r++;
                if (r < n) {
                    sum += A.get(r);
                    ans.add(A.get(r));
                }
            } else {
                sum -= A.get(l);
                l++;
            }
        }
        for (int i = l; i <= r && r < n; i++) {
            ans.add(A.get(i));
        }
        if (ans.size() == 0) {
            ans.add(-1);
            return ans;
        }
        return ans;
    }
}
