package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindMaximum {
    public static void main(String[] args) {
        System.out.println("HI");

        List<Integer> maxNum = Arrays.asList(1,2,3,47,1,23,7);

        Optional<Integer> max = maxNum.stream().max(Integer::compare);
        Optional<Integer> max2 = maxNum.stream().max((a,b)-> a.compareTo(b));
        Optional<Integer> min = maxNum.stream().min((a,b) -> a.compareTo(b));
        System.out.println(max);
        System.out.println(max2);
        System.out.println(min);
    }
}
