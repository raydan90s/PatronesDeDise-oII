/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChainOfResponsability;

/**
 *
 * @author Lenovo
 */
public class UserAssistantHandler extends BaseHandler{

    @Override
    public void handleRequest(Request request) {
        if ("User".equals(request.getRequestType())) {
            System.out.println("Solicitud de usuario procesada por UserAssistant: " + request);
            request.setStatus("Aprobado por UserAssistant");
        } else {
            System.out.println("Solicitud no manejada por UserAssistant, pasando al siguiente.");
            getNext().handleRequest(request);
        }
    }
}
