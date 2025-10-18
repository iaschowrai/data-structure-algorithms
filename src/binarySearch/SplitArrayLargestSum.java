package binarySearch;

/**
 * This program solves the "Split Array Largest Sum" problem using Binary Search.
 *
 * Problem Statement:
 * Given an integer array 'nums' and an integer 'k', split the array into 'k' or fewer
 * non-empty subarrays such that the largest sum among these subarrays is minimized.
 *
 * Example:
 * nums = [7, 2, 5, 10, 8], k = 2
 * The best split is [7,2,5] and [10,8]
 * The largest sum is max(14, 18) = 18
 */
public class SplitArrayLargestSum {

    public static void main(String[] args) {
        int[] nums = {7, 2, 5, 10, 8};
        int k = 2;

        System.out.println("Minimum possible largest sum: " + findMinimumLargestSum(nums, k));
    }

    /**
     * Uses binary search to find the minimum possible largest subarray sum
     * after splitting the array into at most k parts.
     */
    private static int findMinimumLargestSum(int[] nums, int k) {
        int low = 0;   // The minimum possible largest sum (at least the max element)
        int high = 0;  // The maximum possible largest sum (sum of all elements)

        // Step 1: Initialize the binary search range
        for (int num : nums) {
            low = Math.max(low, num); // The largest single element is the lower bound
            high += num;              // The sum of all elements is the upper bound
        }

        // Step 2: Apply binary search
        while (low <= high) {
            int mid = low + (high - low) / 2;  // Avoid integer overflow
            int requiredSubarrays = countSubarrays(nums, mid);

            // Step 3: If we can split into <= k subarrays, try smaller max sum
            if (requiredSubarrays <= k) {
                high = mid - 1;
            }
            // Step 4: Otherwise, increase the allowed max sum
            else {
                low = mid + 1;
            }
        }

        // Step 5: 'low' will be the minimum largest sum achievable
        return low;
    }

    /**
     * Helper method to determine how many subarrays are needed if
     * the maximum allowed subarray sum is 'maxAllowedSum'
     */
    private static int countSubarrays(int[] nums, int maxAllowedSum) {
        int subarrayCount = 1; // Start with one subarray
        int currentSum = 0;

        // Traverse the array and form subarrays
        for (int num : nums) {
            // If adding current element exceeds the allowed sum, start a new subarray
            if (currentSum + num > maxAllowedSum) {
                subarrayCount++;
                currentSum = num; // Start new subarray with current element
            } else {
                currentSum += num;
            }
        }

        return subarrayCount;
    }
}
