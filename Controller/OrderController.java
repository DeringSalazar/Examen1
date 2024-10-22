/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Modelo.Customer;
import Modelo.IViewManagement;
import Modelo.Product;
import View.IView;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Student
 */
public class OrderController extends Thread {

    IView view;
    IViewManagement model;

    public OrderController(IView view, IViewManagement model) {
        this.view = view;
        this.model = model;
    }
    
    public void add(int id, String name, String phone, int idProd, String description, int cantidad){
        Customer customer;
        Product prod = null;
        
        if (phone != null) {
            customer = new Customer(id, name);
        }else{
            customer = new Customer(id, name, phone);
        }
        if (prod != null) {
            prod = new Product(id, description, cantidad);
        }
        if(model.add(customer, name)){
            view.showMessage("Se agrego correctamente un pedido");
        }else{
            view.showMessageError("No se agrego el pedido del cliente");
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            Logger.getLogger(OrderController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
