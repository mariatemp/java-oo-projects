package gr.aueb.cf.ch6Algorithms_Arrays.ch6b;

public class CarParking {
    public static void main(String[] args) {
        int[][] arr = {{1012, 1136}, {1317, 1417}, {1015, 1020}};

        int[][] timeInNOut = new int[arr.length * 2][2];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            timeInNOut[index][0] = arr[i][0];
            timeInNOut[index][1] = 1;
            index++;

            timeInNOut[index][0] = arr[i][1];
            timeInNOut[index][1] = 0;
            index++;
        }
        sortCars(timeInNOut);
        carsCount(timeInNOut, 0, timeInNOut.length - 1);

        int maxCars = 0;
        int currentCars = 0;

        for (int i = 0; i < timeInNOut.length; i++) {
            if (timeInNOut[i][1] == 1) {
                currentCars++;
                maxCars = Math.max(maxCars, currentCars);
            } else {
                currentCars--;
            }
        }

        System.out.println("Ο μέγιστος αριθμός αυτοκινήτων που είναι σταθμευμένα ταυτόχρονα είναι: " + maxCars);
    }
    public static void sortCars(int[][] arr) {
        int a = arr.length;
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j][0] > arr[j + 1][0]) {
                    int[] tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                }
            }
        }
    }

    public static void carsCount(int[][] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;

            carsCount(arr, left, mid);
            carsCount(arr, mid + 1, right);

            count(arr, left, mid, right);
        }
    }

    public static void count(int[][] arr, int left, int mid, int right) {
        int a1 = mid - left + 1;
        int b = right - mid;

        int[][] l = new int[a1][2];
        int[][] r = new int[b][2];

        for (int i = 0; i < a1; i++) {
            l[i] = arr[left + i];
        }
        for (int j = 0; j < b; j++) {
            r[j] = arr[mid + 1 + j];
        }

        int i = 0, j = 0;
        int k = left;

        while (i < a1 && j < b) {
            if (l[i][0] <= r[j][0]) {
                arr[k] = l[i];
                i++;
            } else {
                arr[k] = r[j];
                j++;
            }
            k++;
        }

        while (i < a1) {
            arr[k] = l[i];
            i++;
            k++;
        }

        while (j < b) {
            arr[k] = r[j];
            j++;
            k++;
        }
    }
}
