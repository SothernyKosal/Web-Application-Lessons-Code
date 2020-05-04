
interface Earphone{
    void listen();
}
class Android implements Earphone {

    @Override
    public void listen() {
        System.out.println("listen music on Android");
    }
}

interface Airpod{
    void listen();
}
class Ios implements Airpod{

    @Override
    public void listen() {
        System.out.println("listen music on Ios");
    }
}
class Earphone_connector implements Earphone{
    private Ios ios;
    public Earphone_connector(Ios ios){
        this.ios = ios;
    }
    @Override
    public void listen() {

    }
}


public class Adapter{
    public static void main(String[] args) {
        Android s10 = new Android();
        s10.listen();
        Ios iphone7 = new Ios();
        iphone7.listen();

        Earphone iphoneX = new Earphone_connector(new Ios());
        iphoneX.listen();
    }
}