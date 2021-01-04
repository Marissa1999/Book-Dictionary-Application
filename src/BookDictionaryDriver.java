public class BookDictionaryDriver {
    
    public static void main(String[]args)
    {
        // Create a 1000-page book
        Book1 book1 = new Book1();  // nothing new here
        System.out.println(book1);
        
        // Create a 1200-page book
        Book2 book2 = new Book2(1200);  // nothing new here
        System.out.println(book2);
        
        System.out.println(); // line break
        // New Inheritance stuff
        // create a 1000-page dictionary with 2000 definitions 
        Dictionary1 dictionary = new Dictionary1(2000);
        System.out.println(dictionary);
        
        // create a 1200-page dictionary with 2000 definitions 
        Dictionary2 dict2 = new Dictionary2(1200, 2000);
        System.out.println(dict2);
        
    }
}
