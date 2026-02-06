package StreamAPI;

import java.util.Arrays;
import java.util.List;

public class CountElements {
    public static void main(String[] args) {

        List<Integer> str = Arrays.asList(1, 2, 3, 4, 6, 1, 2, 2, 3, 47);

        int c = (int)str.stream().filter(n -> n > 5).count();
        long c2 = str.stream().filter(n -> n > 5).count();
        System.out.println(c);
        System.out.println(c2);

    }
}
