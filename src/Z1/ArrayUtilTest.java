package Z1;

import java.time.LocalTime;
import java.util.Arrays;

public class ArrayUtilTest {
    public static void main(String[] args){
        Integer[] tablica_int_sorted = {0, 1, 2, 3, 4, 5};
        Integer[] tablica_int_unsorted = {0, 1, 2, 1, 0};

        LocalTime[] tablica_localtime_sorted = {LocalTime.of(8,20,5),
                LocalTime.of(12,20,5),
                LocalTime.of(14,20,5),
                LocalTime.of(15,20,5),
                LocalTime.of(18,10,5),
        };

        LocalTime[] tablica_localtime_unsorted = {LocalTime.of(12,10,5),
                LocalTime.of(20,20,5),
                LocalTime.of(9,20,5),
                LocalTime.of(20,20,5),
                LocalTime.of(12,10,5),
        };

        System.out.println("Tablica Integer posortowana: ");
        System.out.println(Arrays.toString(tablica_int_sorted));
        System.out.println("Czy tablica Integer posortowana jest palindromem: "+ArrayUtil.jestPalindromem(tablica_int_sorted));

        System.out.println();
        System.out.println("Tablica Integer nieposortowana: ");
        System.out.println(Arrays.toString(tablica_int_unsorted));
        System.out.println("Czy tablica Integer nieposortowana jest palindromem: "+ArrayUtil.jestPalindromem(tablica_int_unsorted));

        System.out.println("Tablica LocalTime posortowana: ");
        System.out.println(Arrays.toString(tablica_localtime_sorted));
        System.out.println("Czy tablica LocalTime posortowana jest palindromem: "+ArrayUtil.jestPalindromem(tablica_localtime_sorted));

        System.out.println("Tablica LocalTime nieposortowana: ");
        System.out.println(Arrays.toString(tablica_localtime_sorted));
        System.out.println("Czy tablica LocalTime nieposortowana jest palindromem: "+ArrayUtil.jestPalindromem(tablica_localtime_unsorted));
    }
}
