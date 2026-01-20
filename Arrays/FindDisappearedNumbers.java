import java.util.*;

public class FindDisappearedNumbers {

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        // Add all elements of array to the set
        for (int num : nums) {
            set.add(num);
        }

        // Check which numbers from 1 to n are missing
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                list.add(i);
            }
        }

        return list;
    }

    public static void main(String[] args) {
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };

        List<Integer> result = findDisappearedNumbers(nums);

        System.out.println("Missing numbers: " + result);
    }
}
