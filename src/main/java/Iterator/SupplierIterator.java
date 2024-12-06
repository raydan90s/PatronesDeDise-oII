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
public class SupplierIterator extends AbstractProductIterator {

    public SupplierIterator(LinkedList<Productos> collection) {
        super(collection);
    }
    
    @Override
    public boolean hasNext() {
        return true;
    }

    @Override
    public Productos next() {
        return new Productos(52, "Radio", "Disponible");
    }
    
}
