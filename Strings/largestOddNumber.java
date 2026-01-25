class largestOddNumber {

    public static String findLargestOddNumber(String num) {

        int endIndex = -1;

        // Traverse from right to left to find last odd digit
        for (int i = num.length() - 1; i >= 0; i--) {
            int digit = num.charAt(i) - '0';
            if (digit % 2 != 0) {
                endIndex = i;
                break;
            }
        }

        if (endIndex >= 0) {
            return num.substring(0, endIndex + 1);
        }
        return "";
    }

    public static void main(String[] args) {

        System.out.println(findLargestOddNumber("52238"));

    }
}
