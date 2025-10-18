package arrays;

public class CheckIfNAndItsDoubleExist {
    public static void main(String[] args) {
//        int [] arr ={10,2,5,3};
        int [] arr ={-16, 13, 8};
        System.out.println(checkDoubleExists(arr));
    }

    private static boolean checkDoubleExists(int[] arr) {

        int n = arr.length; // 4

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n ; j++) {
                if(i != j && arr[i] == 2 * arr[j]){
                    return true;
                }
            }
        }
        return false;
    }



}
