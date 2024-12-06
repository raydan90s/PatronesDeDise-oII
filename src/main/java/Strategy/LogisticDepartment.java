/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Strategy;

/**
 *
 * @author Lenovo
 */
public class LogisticDepartment {
    private Distribution distribution;
    public LogisticDepartment(Distribution d){
        distribution = d;
    }
    
    public void distribute(){
        distribution.distribute();
    }
    
    public void setDistribution(Distribution distribution){
        this.distribution = distribution;
    }
}

