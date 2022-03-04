package factorymethods;

import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map immutableMap = Map.of(1, "one", 2, "two", 3, "three");

        System.out.println(immutableMap);
    }
}
