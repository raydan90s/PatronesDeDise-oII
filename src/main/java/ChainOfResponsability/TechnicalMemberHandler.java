/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChainOfResponsability;

/**
 *
 * @author Lenovo
 */
public class TechnicalMemberHandler extends BaseHandler{

    @Override
    public void handleRequest(Request request) {
        if ("Technical".equals(request.getRequestType())) {
            System.out.println("Solicitud técnica procesada por TechnicalMember: " + request);
            request.setStatus("Aprobado por TechnicalMember");
        } else {
            System.out.println("Solicitud no manejada por TechnicalMember, pasando al siguiente.");
            getNext().handleRequest(request);
        }
    }
    
}
