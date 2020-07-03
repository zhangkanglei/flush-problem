import java.util.*;

public class Solution {
    public static int[] runningSum(int[] nums) {
        int total = 0;
        for (int i = 0; i < nums.length; i++) {
            total += nums[i];
            nums[i] = total;
        }
        return nums;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution.runningSum(new int[]{3,1,2,10,1})));
    }


}