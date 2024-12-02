package GFG;

import java.util.HashMap;
import java.util.Arrays;

public class SubarrayWithTargetSumHashMap {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 7, 5};
        int target = 12;
        int[] result = findSubarrayWithSum(arr, target);

        if (result.length == 2) {
            System.out.println("Output: " + Arrays.toString(result));
        } else {
            System.out.println("No subarray with the given sum found.");
        }
    }

    public static int[] findSubarrayWithSum(int[] arr, int target) {
        HashMap<Integer, Integer> sumIndexMap = new HashMap<>();
        int currentSum = 0;

        for (int i = 0; i < arr.length; i++) {
            // Add current element to the running sum
            currentSum += arr[i];

            // If the running sum equals the target, return the subarray
            if (currentSum == target) {
                return new int[]{1, i + 1}; // 1-based indices
            }

            // Check if there's a previous sum that satisfies the condition
            if (sumIndexMap.containsKey(currentSum - target)) {
                return new int[]{sumIndexMap.get(currentSum - target) + 2, i + 1};
            }

            // Store the current sum with its index in the map
            sumIndexMap.put(currentSum, i);
        }

        // Return an empty array if no subarray is found
        return new int[]{};
    }
}
