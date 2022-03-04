package safevarargs;

import java.util.ArrayList;
import java.util.List;

public class SafeVarArgsDemo {
    @SafeVarargs
    private void display(List<String>... products) { // @SaveVarargs
        for (List<String> product : products) {
            System.out.println(product);
        }
    }
    public static void main(String[] args) {
        SafeVarArgsDemo p = new SafeVarArgsDemo();
        List<String> list = new ArrayList<>();
        list.add("Laptop");
        list.add("Tablet");
        p.display(list);
    }
}
