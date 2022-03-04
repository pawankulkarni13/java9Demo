package underscore;

public class KeywordDemo {
    public static void main(String[] args) {
        //UnComment and look for compiler warning.
//        int _ = 10;
        //In Java 7 this compiles and runs successfully.
        //In Java 8 this warns if _ might not be supported in further release.
        //in Java 9 - it complains - As of Java 9, '_' is a keyword, and may not be used as an identifier
//        System.out.println(_);
    }
}
