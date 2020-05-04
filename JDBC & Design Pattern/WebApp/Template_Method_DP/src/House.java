public abstract class House {
    abstract void header();
    abstract void body();
    //hook method
    void footer() {
        System.out.println("Build with sand and steel");
    }
    public final void templateMethod(){
        footer();
        body();
        header();
    }
}
class woodenHouse extends House{
    @Override
    void footer(){
        super.footer();//to change body of generated tools | templates.
    }
    @Override
    void header() {
        System.out.println("wooden roof");
    }

    @Override
    void body() {
        System.out.println("wooden body");
    }
}
class concreteHouse extends House{

    @Override
    void footer(){
        super.footer();
    }
    @Override
    void header() {
        System.out.println("concrete roof");
    }

    @Override
    void body() {
        System.out.println("concrete body");
    }
}
