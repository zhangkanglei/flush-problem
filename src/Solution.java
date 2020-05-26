import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public static int findDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (!set.add(num)) {
                return num;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        Solution.singleNumber(new int[]{1,2,2,1,3,4,4,5,5});
    }


}