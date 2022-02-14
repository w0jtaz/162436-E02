package Z2;
import java.time.LocalTime;
import java.util.*;

public class wypiszcoDrugiTest {
    public static void main(String[] args) {
        TreeSet<Integer> treeset1 = new TreeSet<>(List.of(1,2,3,4,5,6,7));
        LinkedList<String> linkedlist1 = new LinkedList<>(List.of("H", "B", "C", "E", "F", "G"));
        ArrayList<LocalTime> localtime = new ArrayList<LocalTime>(List.of(LocalTime.of(8,20,5),
                LocalTime.of(12,20,5),
                LocalTime.of(14,20,5),
                LocalTime.of(15,20,5),
                LocalTime.of(18,10,5)));


        System.out.println("LinkedList: ");
        System.out.println(linkedlist1);
        System.out.println("LinkedList co drugi: ");
        wypiszcoDrugi.<LinkedList<String>>wypiszcoDrugi(linkedlist1);
        System.out.println();

        System.out.println("TreeSet: ");
        System.out.println(treeset1);
        System.out.println("TreeSet co drugi: ");
        wypiszcoDrugi.<TreeSet<Integer>>wypiszcoDrugi(treeset1);

        System.out.println();
        System.out.println("LocalTime: ");
        System.out.println(localtime);
        System.out.println("LocalTime co drugi: ");
        wypiszcoDrugi.<ArrayList<LocalTime>>wypiszcoDrugi(localtime);


    }
}
