package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumListWithOutLoop {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1, 2, 3);

        int result = sumWithoutloop(list, 0);
        System.out.println(result);
    }
    public static int sumWithoutloop(List<Integer> list, int index) {
        if (index == list.size()) {
            return 0;
        }

        return list.get(index) + sumWithoutloop(list, index + 1);
    }
}
