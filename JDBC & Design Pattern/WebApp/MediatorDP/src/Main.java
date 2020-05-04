//19.12.2019

interface commnand{
    void land();
}
interface IATCMediator{
    void registerRunway(Runway runway);
    void  registerFlight(Flight flight);
    boolean isLandingOk();
    void setLandingStatus(Boolean status);
}
class Runway implements commnand{
    private IATCMediator atcMediator;
    @Override
    public void land() {
        System.out.println("landing permission granted");
        atcMediator.setLandingStatus(true);
    }
    public Runway(IATCMediator atcMediator){
        this.atcMediator = atcMediator;
        atcMediator.setLandingStatus(true);
    }
}
class Flight implements commnand{
    private IATCMediator atcMediator;
    public Flight(IATCMediator atcMediator){
        this.atcMediator = atcMediator;
    }
    @Override
    public void land() {
        if(atcMediator.isLandingOk()){
            System.out.println("successfully landing");
        }
        else {
            System.out.println("waiting for landing");
        }
    }
    public void getReady(){
        System.out.println("Ready for landing");
    }
}
class ATCMediator implements IATCMediator{
    private Flight flight;
    private Runway runway;
    private boolean land;
    @Override
    public void registerRunway(Runway runway) {
        this.runway = runway;
    }

    @Override
    public void registerFlight(Flight flight) {
        this.flight = flight;
    }

    @Override
    public boolean isLandingOk() {
        return land;
    }

    @Override
    public void setLandingStatus(Boolean status) {
        land = status;
    }
}

public class Main {

    public static void main(String[] args) {
        IATCMediator atcMediator = new ATCMediator();
        Flight skylet224 = new Flight(atcMediator);
        Runway runway1 = new Runway(atcMediator);

        atcMediator.registerFlight(skylet224);
        atcMediator.registerRunway(runway1);
        skylet224.getReady();
        runway1.land();
        skylet224.land();
    }
}
