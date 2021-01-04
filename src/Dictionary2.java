public class Dictionary2 extends Book2{
    private int definitions;

    // Note: a subclass MUST call a super class's constructor.
    // If it does not, the compiler calls super class's default constructor,
    // which must exist either explicitly or implecitly; otherwise, the compiler
    // will complain.
    public Dictionary2(int pages, int defs) {super(pages);
                                             this.definitions = defs;}
    public int getDefinitions() { return definitions;  }
    public void setDefinitions(int definitions) { this.definitions = definitions; }   

    public String toString(){ return super.toString() + // calls super's toString()
         "\nI'm a dictionary with "  + this.definitions + " definitions";
    }

}
