interface Car{
    int getCost();
    String getDescription();
}
class simpleTesla implements Car{

    @Override
    public int getCost() {
        return 3000;
    }

    @Override
    public String getDescription() {
        return "simple car";
    }
}
abstract class TeslaDecorator implements Car{
    private Car car;
    public TeslaDecorator(Car car){
        this.car = car;
    }

    @Override
    public int getCost() {
        return car.getCost();
    }

    @Override
    public String getDescription() {
        return car.getDescription();
    }
}

class TeslaAutopilot extends TeslaDecorator{

    public TeslaAutopilot(Car car) {
        super(car);
    }

    @Override
    public int getCost() {
        return super.getCost()+1000;
    }

    @Override
    public String getDescription() {
        return super.getDescription()+ " add autopilot";
    }
}
class TeslaColorDecor extends TeslaDecorator{

    public TeslaColorDecor(Car car) {
        super(car);
    }

    @Override
    public int getCost() {
        return super.getCost()+100;
    }

    @Override
    public String getDescription() {
        return super.getDescription()+ " add color purple";
    }
}


public class Main {

    public static void main(String[] args) {
	    Car tesla = new TeslaColorDecor(new TeslaAutopilot(new simpleTesla()));
	    System.out.println(tesla.getCost());
        System.out.println(tesla.getDescription());
    }
}
