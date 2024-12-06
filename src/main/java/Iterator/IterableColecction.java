/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Iterator;

/**
 *
 * @author Lenovo
 */
public interface IterableColecction {
    Iterator<Productos> createIterator();
    Iterator<Productos> createMaintanceIterator();
    Iterator<Productos> createWebShopperIterator();
    Iterator<Productos> createStoreSalesManIterator();
    Iterator<Productos> createSupplierIterator();
}
