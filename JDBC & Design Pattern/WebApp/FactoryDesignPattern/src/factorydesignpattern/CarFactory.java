/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorydesignpattern;

//05.12.2019

public class CarFactory {
   public static Car getCar(String carName) {
       switch (carName){
            case "audi":
                return new Audi();
            case "tesla":
                return new Tesla();
            case "foodtruck":
                return new FoodTruck();
            default:
                return null;
       }
   }
}
