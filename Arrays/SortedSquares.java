import java.util.Arrays;

//Given an integer array nums sorted in non-decreasing order,
//return an array of the squares of each number sorted in non-decreasing order.

class SortedSquares {
    public static int[] makeSortedSquaresArr(int[] nums) {

        int[] arr2 = new int[nums.length];

        int start = 0;
        int end = nums.length - 1;
        int pos = nums.length - 1;

        while (start <= end) {
            int sqLeft = nums[start] * nums[start];
            int sqRight = nums[end] * nums[end];

            if (sqLeft > sqRight) {
                arr2[pos] = sqLeft;
                start++;
            } else {
                arr2[pos] = sqRight;
                end--;
            }
            pos--;
        }
        return arr2;
    }

    public static void main(String[] args) {
        int[] nums = { -7, -3, 0, 2, 5 };
        int[] result = makeSortedSquaresArr(nums);

        System.out.println(Arrays.toString(result));
    }
}
