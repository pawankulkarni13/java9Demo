package privatemethods;

public interface InterfaceWithPrivateMethods {
    private static String staticPrivate() {
        return "static private method in interface";
    }

    private String instancePrivate() {
        return "instance private method in interface";
    }

    default void defaultMethod() {
        String result = staticPrivate();
        System.out.println("staticPrivate returned - " + result);
        InterfaceWithPrivateMethods pvt = new InterfaceWithPrivateMethods() {
            // anonymous class
        };
        result = pvt.instancePrivate();
        System.out.println("instancePrivate returned - "+result);
    }
}
