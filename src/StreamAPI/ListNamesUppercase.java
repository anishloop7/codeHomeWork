package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ListNamesUppercase {
    public static void main(String[] args) {

        List<String> str = Arrays.asList("Alice", "Bob", "Charlie");

        List<String> uppperNames = str.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());
        System.out.println(uppperNames);
    }
}
