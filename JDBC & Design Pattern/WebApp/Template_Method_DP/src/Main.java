public class Main {

    public static void main(String[] args) {
        House obj = new woodenHouse();
        obj.templateMethod();
        obj = new concreteHouse();
        obj.templateMethod();
    }

}
