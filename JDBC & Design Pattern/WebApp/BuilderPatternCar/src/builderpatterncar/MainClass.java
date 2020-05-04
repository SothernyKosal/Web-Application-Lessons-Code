package builderpatterncar;

//05.12.2019
public class MainClass {
    public static void main(String[] args)
    {
        Car c = new Car.CarBuilder().
            setBrand("Audi").
            setColor("White").
            setEngineType("Oil cooled").
            build();
        System.out.println(c);
    }    
            
}
