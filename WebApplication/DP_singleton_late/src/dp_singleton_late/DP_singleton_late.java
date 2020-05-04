//04.12.2019
package dp_singleton_late;

/**
 *
 * @author Sotherny
 */
public class DP_singleton_late {
    public static void main(String[] args) {
        late_instantiation s = late_instantiation.getObj();
        System.out.println(s);
        s.print();
        s = late_instantiation.getObj();
        System.out.println(s);
    }
}
