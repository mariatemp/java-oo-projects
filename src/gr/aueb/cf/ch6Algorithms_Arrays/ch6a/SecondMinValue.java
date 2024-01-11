package gr.aueb.cf.ch6Algorithms_Arrays.ch6a;

public class SecondMinValue {
    public static void main(String[] args) {
        int[] arr = {10, 5, 19, 3, 90};
        int secondMinValue = getsecondMinValue(arr);

        if (secondMinValue != Integer.MAX_VALUE) {
            System.out.println("Το δεύτερο μικρότερο στοιχείο είναι: " + secondMinValue);
        } else {
            System.out.println("Δεν υπάρχει δεύτερο μικρότερο στοιχείο");
        }
    }

    public static int getsecondMinValue (int[] arr) {
        if (arr.length < 2) {
            return Integer.MAX_VALUE;
        }

        int minValue = Integer.MAX_VALUE;
        int secondMinValue = Integer.MAX_VALUE;

        for (int value : arr) {
            if (value < minValue) {
                secondMinValue = minValue;
                minValue = value;
            } else if (value < secondMinValue && value != minValue) {
                secondMinValue = value;
            }
        }
        return secondMinValue;
    }
}
