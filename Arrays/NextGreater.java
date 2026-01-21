public class NextGreater {
    public static void main(String[] args) {

        // Find smallest char, greater than target.

        char[] letters = { 'c', 'f', 'j','k' };
        char target = 'f';

        // char smallestChar = Character.MAX_VALUE;
        // for (int i = 0; i < letters.length; i++) {
        // if (letters[i] > target && letters[i] < smallestChar ) {
        // smallestChar = letters[i];
        // }
        // }

        // if(smallestChar ==Character.MAX_VALUE ){
        // smallestChar=letters[0];
        // }

        // return smallestChar;

        int start = 0;
        int end = letters.length - 1;

        // Binary Search to find next greater letter
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (letters[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

       // If start goes out of bounds, no character greater than target exists
        if (start == letters.length) {
            System.out.println(letters[0]);
        } else {
            System.out.println(letters[start]); // smallestChar > target
        }
    }
}
