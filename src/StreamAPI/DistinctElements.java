package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DistinctElements {
    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(1, 2, 3, 4, 6, 1, 2, 2, 3, 47);

        List<Integer> n = num.stream().distinct().collect(Collectors.toList());

        System.out.println(n);
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> evenNumbers = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(evenNumbers);



    }
}
