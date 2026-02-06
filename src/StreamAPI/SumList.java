package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class SumList {
    public static void main(String[] args) {

        List<Integer> numSum = Arrays.asList(1,2,3,4,7);
        int sum = numSum.stream().mapToInt(Integer::intValue).sum();
        System.out.println(sum);

    }
}
