/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChainOfResponsability;

/**
 *
 * @author Lenovo
 */
public class Cliente {
    public static void main(String[] args) {
        Handler storeManager = new StoreManagerHandler();
        Handler technicalMember = new TechnicalMemberHandler();
        Handler userAssistant = new UserAssistantHandler();

        storeManager.next(technicalMember);
        technicalMember.next(userAssistant); 

        Product product = new Product(1, "Laptop", true, "Hardware failure", 1500.0);
        Request request = new Request(product, "Technical"); 

        storeManager.handleRequest(request); 

        System.out.println("Estado final de la solicitud: " + request.getStatus());
    }
    
}
