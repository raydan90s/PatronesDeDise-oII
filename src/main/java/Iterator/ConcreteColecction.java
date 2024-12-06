/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Iterator;

import java.util.LinkedList;

/**
 *
 * @author Lenovo
 */
public class ConcreteColecction implements IterableColecction {

    LinkedList<Productos> productos = new LinkedList<>();

    public LinkedList<Productos> getProducts() {
        return productos;
    }

    public void addProduct(Productos product) {
        productos.add(product);
    }

    @Override
    public Iterator<Productos> createIterator() {
        return new ConcreteIterator(productos);
    }

    @Override
    public Iterator<Productos> createWebShopperIterator() {
        return new WebShopperIterator(productos);
    }

    @Override
    public Iterator<Productos> createStoreSalesManIterator() {
        return new StoreSalesManIterator(productos);
    }

    @Override
    public Iterator<Productos> createSupplierIterator() {
        return new SupplierIterator(productos);
    }

    @Override
    public Iterator<Productos> createMaintanceIterator() {
        return new MaintanceAssistantIterator(productos);
    }
}
