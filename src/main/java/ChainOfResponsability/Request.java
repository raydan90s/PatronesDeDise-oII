/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChainOfResponsability;

/**
 *
 * @author Lenovo
 */
public class Request {

    private Product product; 
    private String requestType; 
    private String status;

    // Constructor
    public Request(Product product, String requestType) {
        this.product = product;
        this.requestType = requestType;
        this.status = "Pending"; // Estado inicial
    }

    // Getters y Setters
    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getRequestType() {
        return requestType;
    }

    public void setRequestType(String requestType) {
        this.requestType = requestType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Request{"
                + "product=" + product.getName()
                + // Asumiendo que Product tiene un método getName()
                ", requestType='" + requestType + '\''
                + ", status='" + status + '\''
                + '}';
    }
}
