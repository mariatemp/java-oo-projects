package gr.aueb.cf.ch6Algorithms_Arrays.ch6a;

public class MaxPosition {

    public static void main(String[] args) {
        int [] arr = {10, 5, 19, 3, 90};
        int maxPosition = getMaxPosition(arr);

        System.out.printf("Max Value: %d, Max Position: %d", arr[maxPosition], maxPosition + 1);

    }

    public static int getMaxPosition (int[] arr) {
        int maxPosition = 0;
        int maxValue = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxPosition = i;
                maxValue = arr[i];
            }
        }
        return maxPosition;
    }
}
