/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Student
 */
public class Order {
    Customer customer;
    Product product;
    int cant;
    boolean status;

    public Order(Customer customer, Product product, int cant, boolean status) {
        this.customer = customer;
        this.product = product;
        this.cant = cant;
        this.status = status;
    }

    public Order(Customer customer, Product product, int cant) {
        this.customer = customer;
        this.product = product;
        this.cant = cant;
        this.status = false;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    
    
}
        


