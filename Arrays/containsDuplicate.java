import java.util.*;

public class containsDuplicate {

    public static boolean checkContainsDuplicate(int[] nums) {

        // boolean containsDuplicate = false;
        // HashMap<Integer, Integer> map = new HashMap<>();

        // for (int i = 0; i < nums.length; i++) {
        //     map.put(nums[i], map.containsKey(nums[i]) ? map.get(nums[i]) + 1 : 1);
        // }

        // for (int v : map.values()) {
        //     if (v >= 2) {
        //         containsDuplicate = true;
        //         break;
        //     }
        // }

        // return containsDuplicate;

        //using hashset
        Set<Integer> set=new HashSet<>();
        for(int n:nums){
        if(!set.add(n)){ //HashSet.add() returns false if the element already exists
        return true;
        }
        }
        return false;

    }

    public static void main(String[] args) {

        int[] arr1 = { 1, 2, 3, 1 };
        int[] arr2 = { 1, 2, 3, 4 };

        System.out.println(checkContainsDuplicate(arr1));
        System.out.println(checkContainsDuplicate(arr2));
    }

}