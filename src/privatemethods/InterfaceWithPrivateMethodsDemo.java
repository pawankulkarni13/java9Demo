package privatemethods;

public class InterfaceWithPrivateMethodsDemo implements InterfaceWithPrivateMethods {
    static{
        System.out.println("Static Method in class");
    }
    public InterfaceWithPrivateMethodsDemo(){
        System.out.println("constructor of class");
    }

    public static void main(String[] args) {
        System.out.println("Main Method Starting");
        InterfaceWithPrivateMethods ip = new InterfaceWithPrivateMethodsDemo();
        ip.defaultMethod();
        System.out.println("Main Method Ending");
    }
}
