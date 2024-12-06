/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ChainOfResponsability;

/**
 *
 * @author Lenovo
 */
public abstract class BaseHandler implements Handler {
    protected Handler handler;
    @Override
    public void next(Handler handler){
        this.handler = handler;
    }
    
    @Override
    public abstract void handleRequest(Request request);
    
    public Handler getNext(){
        return handler;
    }
}
