/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Iterator;

/**
 *
 * @author Lenovo
 */
public class Cliente {
    public static void main(String[] args) {
        ConcreteColecction collection = new ConcreteColecction();
        collection.addProduct(new Productos(20, "Store A", "Disponible"));
        collection.addProduct(new Productos(20, "Store B", "Disponible"));
        collection.addProduct(new Productos(20, "Store C", "Disponible"));
        
        Iterator<Productos> webShopperIterator = collection.createWebShopperIterator();
        Iterator<Productos> supplierIterator = collection.createSupplierIterator();
        
    }
}





