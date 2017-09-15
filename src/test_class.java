class Book {
    public String title;
    public void setTitle (String title) {
        this.title = title;
    }
}

public class test_class {
    private static int defineBonus(int purchasedItems) {
        int bonus;
        bonus = purchasedItems >= 3 ? 10 : 0 ;
        return bonus;
    }

    public static void main (String [] args) {
        Book book1 = new Book (); book1.setTitle ("Java 7");
        Book book2 = new Book (); book2.setTitle ("Java 7");
        System.out.println(book1.title);
        System.out.println(book2.title);

        if (book1.title.equals(book2.title)) {
            System.out.println ("True");
        } else {
            System.out.println ("False");
        }
        System.out.println("Discount is: " + defineBonus(3) + "%");
    }
}
