package gr.aueb.cf.ch6Algorithms_Arrays.ch6b;

public class LowHighIndex {

    public static void main(String[] args) {
        int[] arr = {0, 1, 4, 4, 4, 6, 7, 8, 8, 8, 8, 8};
        int key = 8;
        int[] index = getLowAndHighIndexOf(arr, key);

        if (index[0] != -1 && index[1] != -1) {
            System.out.println( "Low index is: " + index[0]);
            System.out.println("High index is: " + index[1]);
        } else {
            System.out.println("Key" + key + "not found");
        }
    }

    public static int[] getLowAndHighIndexOf(int[] arr, int key) {
        int[] index = {-1, -1};
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (high - low) / 2;

            if (arr[mid] < key) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (low < arr.length && arr[low] == key) {
            index[0] = low;

            while (low < arr.length && arr[low] == key) {
                low++;
            }

            index[1] = low - 1;
        }
        return index;
    }
}
