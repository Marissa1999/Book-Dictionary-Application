
public class Dictionary1 extends Book1
{
    private int definitions;

    /**
     * Creates a Dictionary1 object, setting its number of definitions
     * to a user supplied value.
     * @param defs Number of definitions in this Dictionary1 object.
     */
    public Dictionary1(int defs) 
    {
        // note that there is no explicit call to the superclass's constructor,
        // forcing the compiler to call the superclass's default constructor.
        // super();  // this is how the compiler calls the superclass's default constructor
        this.definitions = defs;
    }
    public int getDefinitions() { return definitions;  }
    public void setDefinitions(int definitions) { this.definitions = definitions; }   
    public String toString(){ return super.toString() + 
           "\nI'm a dictionary with "  + this.definitions + " definitions";
    }

    
}
