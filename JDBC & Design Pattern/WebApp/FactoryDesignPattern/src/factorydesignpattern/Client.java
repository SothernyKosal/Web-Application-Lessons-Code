/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorydesignpattern;

import java.util.Scanner;

public class Client {
    public static void main(String[] args){
        String carName;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the car you want: ");
        carName = s.next();
        
        Car c = CarFactory.getCar(carName);
        c.printInfo();
    }
}
