/**
 * A simple class modeling a book with only one attribute: the number of pages.
 * In this version the number of pages is intentionally kept fixed at 1000.
 * Note that this class does not define ANY constructor, forcing the compiler
 * to generate a default do-nothing constructor that looks like this:
 * public Book1(){}
 * @author cstuser
 */
public class Book1 
{
    private int pages = 1000;
    public int getPages() {        return pages;    }
    public void setPages(int pages) {        this.pages = pages;    }
    public String toString(){ return "I'm book of " + this.pages + " pages";}
    
}
