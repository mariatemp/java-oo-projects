package gr.aueb.cf.ch10StructuredProgrammingProjects;

/**
 * Demonstrates shallow and deep copying
 * of a two-dimensional array.
 */
public class Project03 {

    public static void main(String[] args) {
        int[][] arr = {{1, 2}, {3, 4}};
        int[][] arr2 = {{1, 2}, {3, 4}};
        int[][] clone = shallowCopy(arr);
        int[][] clone2 = deepCopy(arr);
        clone[0][0] = 8;
        clone2[0][0] = 8;

        System.out.println("Original Array: ");
        printArray(arr);

        System.out.println("\nShallow Copied Array: ");
        printArray(clone);

        System.out.println("\nOriginal Array: ");
        printArray(arr2);

        System.out.println("\nDeep Copied Array: ");
        printArray(clone2);
    }

    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int el : row) {
                System.out.print(el + " ");
            }
            System.out.println();
        }
    }

    public static int[][] shallowCopy(int[][] arr) {
        return arr;
    }

    public static int[][] deepCopy(int[][] arr2) {
        int[][] arrayToReturn = new int[arr2.length][arr2[0].length];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arrayToReturn[i][j] = arr2[i][j];
            }
        }
        return arrayToReturn;
    }
}
