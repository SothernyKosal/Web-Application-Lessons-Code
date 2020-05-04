package dp_singleton_late;

/**
 *
 * @author Sotherny
 */
public class late_instantiation {
    private late_instantiation(){}
    private static late_instantiation Ls = null;
    public static late_instantiation getObj(){
        if(Ls == null){
            Ls = new late_instantiation();
        }
        return Ls;
    }
    public void print(){
        System.out.println("printing msg...");
    }
}
