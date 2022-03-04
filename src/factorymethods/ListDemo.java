package factorymethods;

import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List immutableList = List.of("one", "two", "three");

        System.out.println(immutableList);
        System.out.println(immutableList.hashCode());

        immutableList.add("four");  // Throws UnsupportedOperationException !
        System.out.println(immutableList);
    }
}
