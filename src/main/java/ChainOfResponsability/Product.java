/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChainOfResponsability;

/**
 *
 * @author Lenovo
 */
public class Product {
    int id;
    String name;
    boolean warranty;
    String typeFailure;
    double price;

    public Product(int id, String name, boolean warranty, String typeFailure, double price) {
        this.id = id;
        this.name = name;
        this.warranty = warranty;
        this.typeFailure = typeFailure;
        this.price = price;
    }

    public String getName() {
        return name;
    }
    
    
    
    
    
}
