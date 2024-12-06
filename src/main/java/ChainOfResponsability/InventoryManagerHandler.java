/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChainOfResponsability;

/**
 *
 * @author Lenovo
 */
public class InventoryManagerHandler extends BaseHandler{

    @Override
    public void handleRequest(Request request) {
        if ("Warranty".equals(request.getRequestType())) {
            System.out.println("Solicitud de garantía procesada por InventoryManager: " + request);
            request.setStatus("Aprobado");
        } else {
            System.out.println("Solicitud no manejada por InventoryManager, pasando al siguiente.");
            getNext().handleRequest(request);
        }
    }
    
}
