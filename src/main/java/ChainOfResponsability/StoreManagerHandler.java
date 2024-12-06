/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChainOfResponsability;

/**
 *
 * @author Lenovo
 */
public class StoreManagerHandler extends BaseHandler{

    @Override
    public void handleRequest(Request request) {
        if ("Store".equals(request.getRequestType())) {
            System.out.println("Solicitud de tienda procesada por StoreManager: " + request);
            request.setStatus("Aprobado por StoreManager");
        } else {
            System.out.println("Solicitud no manejada por StoreManager, pasando al siguiente.");
            getNext().handleRequest(request);
        }
    }
    
}
