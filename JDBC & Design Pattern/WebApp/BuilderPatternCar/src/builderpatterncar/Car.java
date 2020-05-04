
package builderpatterncar;

//05.12.2019

public class Car {
    String brand, color, engineType;
    Car(String brand, String color, String engineType){
        this.brand = brand;
        this.color = color;
        this.engineType = engineType;
    }
    public String toString(){
        return color + " : " + brand + " : " + engineType;
    }
    public static class CarBuilder{
        String brand, color, engineType;
        
        public CarBuilder setBrand(String brand){
            this.brand = brand;
            return this;
        }
        public CarBuilder setColor(String color){
            this.color = color;
            return this;
        }
        public CarBuilder setEngineType(String engineType){
            this.engineType = engineType;
            return this;
        }
        public Car build(){
            Car c = new Car(brand, color, engineType);
            return c;
        }
    }
    
}
