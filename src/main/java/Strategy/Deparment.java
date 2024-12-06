/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strategy;

/**
 *
 * @author Lenovo
 */
public class Deparment {
    public static void main(String[] args) {
        Distribution dist = new RailDelivery();
        LogisticDepartment logistic = new LogisticDepartment(dist);
        logistic.distribute();
        
        Distribution car = new CarDelivery();
        logistic.setDistribution(car);
        logistic.distribute();
    }
}

