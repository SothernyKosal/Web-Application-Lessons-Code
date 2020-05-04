
package test;

/**
 *
 * @author Sotherny
 */
public class CarBuilder {
    String brand, color, engineType;
    CarBuilder(String brand, String color, String engineType){
        this.brand = brand;
        this.color = color;
        this.engineType = engineType;
    }
    public String toString(){
        return "car brand is " + brand + ", color is " + color + ", and engineType is " + engineType;
    }
    public static class carBuilder{
        String brand, color, engineType;
        public carBuilder setBrand(String brand){
            this.brand = brand;
            return this;
        }
        public carBuilder setColor(String color){
            this.color = color;
            return this;
        }
        public carBuilder setEngine(String engineType){
            this.engineType = engineType;
            return this;
        }
        public CarBuilder build(){
            CarBuilder car = new CarBuilder(brand, color, engineType);
            return car;
        }
    }
    
}
