package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortList {
    public static void main(String[] args) {

        List<Integer> str = Arrays.asList(1,2,3,4,6,1,2,2,3,47);

        List<Integer> sorted = str.stream().sorted().collect(Collectors.toList());

        System.out.println(sorted);


    }
}
