package Z2;

import java.util.*;

public class wypiszcoDrugi {
    public static <E extends Iterable<?>> void wypiszcoDrugi(E objekt) {
        Iterator<?> iter1 = objekt.iterator();
        int i = 0;
        while (iter1.hasNext()) {
            if (i % 2 == 0) {
                System.out.print(iter1.next());
                if (iter1.hasNext())
                    System.out.print(", ");
                } else
                    iter1.next();
                i++;
            }
        }

    }
