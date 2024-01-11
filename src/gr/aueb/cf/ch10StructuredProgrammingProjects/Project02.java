package gr.aueb.cf.ch10StructuredProgrammingProjects;

import static java.lang.Math.max;

/**
 * Demonstrates finding the global maximum sum of a subarray
 *  within a given array using Kadane's algorithm.
 */
public class Project02 {
    public static void main(String[] args) {
        int[] arr = {4, 3, -2, 6, -12, 7, -1, 6};
        int globalMax = globalMaximum(arr);

        System.out.println(globalMax);
    }

    public static int globalMaximum(int[] arr) {
        int globalMax = arr[0];
        int currentMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            currentMax = currentMax + arr[i];

            if (currentMax < arr[i]) {
                currentMax = arr[i];
            }
            if (globalMax < currentMax) {
                globalMax = currentMax;
            }
            System.out.println("Iteration " + i + ": Current Max = " + currentMax + ", Global Max = " + globalMax);
        }
        return globalMax;
    }
}