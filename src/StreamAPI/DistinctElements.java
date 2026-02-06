package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctElements {
    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(1, 2, 3, 4, 6, 1, 2, 2, 3, 47);

        List<Integer> n = num.stream().distinct().collect(Collectors.toList());

        System.out.println(n);




    }
}
