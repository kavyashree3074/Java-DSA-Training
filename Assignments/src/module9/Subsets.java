package module9;
import java.util.ArrayList;
import java.util.List;
//Generate all subsets of a set of numbers
public class Subsets {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        int n = nums.length;
        for (int i = 0; i < (1 << n); i++) {
            List<Integer> subset = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) > 0) {
                    subset.add(nums[j]);
                }
            }
            System.out.println(subset);
        }
    }
}
