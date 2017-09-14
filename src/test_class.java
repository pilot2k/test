package by.bsu.test_class;

public class test_class {
    public static void main(String[ ] args) {
        System.out.println(args.length);
        for ( int i = 1; i <= args.length; i++){
            System.out.println(args[i]);
        }
        System.out.print ("A");
        test_class.main ("java7");
    }
    private static void main (String args) {
        System.out.println(args);
        System.out.print ("B");
    }
}
