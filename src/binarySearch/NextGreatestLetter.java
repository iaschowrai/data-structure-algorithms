package binarySearch;

public class NextGreatestLetter {
    public static void main(String[] args) {


        Character[] letter = {'c', 'f', 'j'};
        char tgt = 'a';

        System.out.println(searchLetter(letter, tgt));
    }

    private static Character searchLetter(Character[] letter, char tgt) {
        int start = 0 , end = letter.length - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;

            if(tgt >= letter[mid]){
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return letter[start % letter.length];
    }
}
