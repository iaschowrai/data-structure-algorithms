package arrays;

public class ValidMountainArrays {
    public static void main(String[] args) {
        int[] arr = {3,5,5};
        System.out.println(isMountainArray(arr));
    }

    private static boolean isMountainArray(int[] arr) {

        int n = arr.length;
        if (n < 3) return false;

        int i = 0;

        // Step 1: climb up
        while (i + 1 < n && arr[i] < arr[i + 1]) {
            i++;
        }

        // Step 2: check if peak is valid (not first or last)
        if (i == 0 || i == n - 1) return false;

        // Step 3: walk down
        while (i + 1 < n && arr[i] > arr[i + 1]) {
            i++;
        }

        // Step 4: check if reached the end
        return i == n - 1;
    }
}
