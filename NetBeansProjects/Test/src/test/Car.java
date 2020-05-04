package test;

public interface Car {
    void printInfo();
}

class CarFactory{
    public static Car getCar(String carName){
        switch(carName){
            case "audi":
                return new audi();
            case "tesla":
                return new tesla();
            case "foodTruck":
                return new foodTruck();
            default:
                return null;
        }
    }
}

class audi implements Car{

    @Override
    public void printInfo() {
        System.out.println("audi car is come out of factory for client");
    }
    
}
class tesla implements Car{
    @Override
    public void printInfo(){
        System.out.println("tesla is come out of factory for client");
    }
}
class foodTruck implements Car{
    @Override
    public void printInfo(){
        System.out.println("foodTruck is come out of factory for client");
    }
}