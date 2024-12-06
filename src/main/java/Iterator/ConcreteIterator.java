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
public class ConcreteIterator extends AbstractProductIterator{
    int index = 0;
    
    public ConcreteIterator(LinkedList<Productos> productos){
        super(productos);
    }
    
    @Override
    public boolean hasNext(){
        return index < collection.size();
    }
    
    @Override
    public Productos next(){
        Productos product = collection.get(index);
        index ++;
        return product;
    }
}
