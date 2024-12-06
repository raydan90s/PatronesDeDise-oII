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
public abstract class AbstractProductIterator implements Iterator<Productos> {
    protected LinkedList<Productos> collection;

    public AbstractProductIterator(LinkedList<Productos> collection) {
        this.collection = collection;
    }
    
    @Override
    public abstract boolean hasNext();
    
    @Override
    public abstract Productos next();   
}


