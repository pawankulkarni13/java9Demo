package anonymousinnerclass;

public class AnonymousInnerClassDemo {
    public static void main(String[] args) {
        AnonymousInnerClass<String> a = new AnonymousInnerClass<>() { // diamond operator is empty, compiler infer type
            String show(String a, String b) {
                return a+b;
            }
        };
        String result = a.show("Java","9");
        System.out.println(result);
    }
}

abstract class AnonymousInnerClass<T>{
    abstract T show(T a, T b);
}
