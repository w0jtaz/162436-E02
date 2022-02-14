package Z1;
 import java.util.*;

public class ArrayUtil {
    public static <T extends  Comparable<T>> boolean jestPalindromem(T[] tab){
        if(tab.length < 2) {
            return true;
        }
        for (int i=0, j=tab.length-1; i<(tab.length)/2 & j>i; i++, j--){
            if(tab[i].compareTo(tab[j])!=0){
                return false;
            }
        }
        return true;
    }
}
