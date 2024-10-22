/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Student
 */
public abstract class State {
    Order order;

    public State(Order order) {
        this.order = order;
    }
    
    public abstract String onPending();
    public abstract String onDisable();
    public abstract String onReady();
    public abstract String onDeliver();
    
}
