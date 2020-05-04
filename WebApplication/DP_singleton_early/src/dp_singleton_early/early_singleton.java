package dp_singleton_early;

/**
 *
 * @author Sotherny
 */
public class early_singleton {
    private int id;
    private String name;
    private static early_singleton Es = new early_singleton();
    // put static becuz we wnat it accessible
    private early_singleton(){}
    
    public void print(){
        System.out.println("id: " + id + " name: " + name );
    }
    public static early_singleton getObj(){
        return Es;
    }
}
