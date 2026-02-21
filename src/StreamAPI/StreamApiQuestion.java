package StreamAPI;

import java.util.Arrays;

public class StreamApiQuestion {

    public static void main(String[] args) {
        String str = "Alice Is testing application now";
        int[] nums = {5, 2, 8, 1, 9};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums)); // [1, 2, 5, 8, 9]

        System.out.println("--------------------");

        Integer[] res =  {5, 2, 8, 1, 9};
        Arrays.sort(res, (a,b)-> b-a);
        System.out.println(Arrays.toString(res));

        System.out.println("--------------------");

        String[] fruits = {"Bananayyy77", "Apple","apple", "Cherry", "Mango"};
//        Arrays.sort(fruits);
//        System.out.println(Arrays.toString(fruits)); // [Apple, Banana, Cherry, Mango]
//
//        Arrays.sort(fruits, (a,b)->(a.length() - b.length()));
//        System.out.println(Arrays.toString(fruits));

        Arrays.sort(fruits, (a,b)-> {
            if(a.length()!=b.length()) return a.length() - b.length();
            else return a.compareTo(b);
        });
        System.out.println(Arrays.toString(fruits));





    }
}
