/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningclasses;

/**
 *
 * @author tmuchnedy
 */
public class LearningClasses {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vehicles Car = new Vehicles();
        Car.vehicleName = "BMW 1 Series";
    }
    
    static class Vehicles {
        String vehicleName;
        int numberOfTires;
        double topSpeed;
    }    
}
