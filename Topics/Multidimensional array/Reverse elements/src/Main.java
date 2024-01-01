class ArrayOperations {
    public static void reverseElements(int[][] twoDimArray) {
        // write your code here
        for (int row = 0; row < twoDimArray.length; row++) {
            int start = 0; // The start index of the row
            int end = twoDimArray[row].length - 1; // The end index of the row

            while (start < end) {
                // Swap the elements at start and end indices
                int temp = twoDimArray[row][start];
                twoDimArray[row][start] = twoDimArray[row][end];
                twoDimArray[row][end] = temp;

                // Move the indices towards the center
                start++;
                end--;
            }
        }
    }
}