/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningclasses;

/**
 *
 * @author rio197
 */
public class LearningClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehicles Car = new Vehicles();
        Vehicles Car2 = new Vehicles();
        Vehicles Car3 = new Vehicles();
        Vehicles Car4 = new Vehicles();
        Vehicles Car5 = new Vehicles();
        Vehicles Car6 = new Vehicles();
        
        Car.vehicleName = "BMW 1 Series";
        Car.GetDetails();
        Car.sayHi();
    }  
}

class Vehicles {
        String vehicleName;
        int numberOfTires;
        double topSpeed;
        
        static void sayHi () {
            System.out.println("Hi!");
        }
        
        void GetDetails () {
            System.out.println("Name of the vehicle");
            System.out.println(vehicleName);
            System.out.println(numberOfTires);
            System.out.println(topSpeed);
        }
        
        Vehicles () {
            numberOfTires = 4;
            topSpeed = 225;
        }
    }
