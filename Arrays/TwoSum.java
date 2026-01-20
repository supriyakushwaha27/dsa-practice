import java.util.Arrays;

public class TwoSum {

    public static boolean twoSumExists(int[] nums, int target) {

        Arrays.sort(nums);

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int sum = nums[left] + nums[right];

            if (sum == target) {
                return true; // pair exists
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }

        return false; // pair does not exist
    }

    public static void main(String[] args) {
        int[] nums = { 3, 3 };
        int target = 6;

        System.out.println(twoSumExists(nums, target));
    }
}
