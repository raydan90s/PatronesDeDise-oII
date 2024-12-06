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
public class MaintanceAssistantIterator extends AbstractProductIterator {

    public MaintanceAssistantIterator(LinkedList<Productos> collection) {
        super(collection);
    }

    @Override
    public boolean hasNext() {
        return true; // Lógica de iteración personalizada
    }

    @Override
    public Productos next() {
        return new Productos(12, "Ventilador", "Disponible");
    }
    
}

