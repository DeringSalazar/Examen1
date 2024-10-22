/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Student
 */
public class Order extends State {
    Customer customer;
    Product product;
    int cant;
    String status;

    public Order(Customer customer, Product product, int cant, String status) {
        this.customer = customer;
        this.product = product;
        this.cant = cant;
        this.status = status;
    }

    public Order(Customer customer, Product product, int cant) {
        this.customer = customer;
        this.product = product;
        this.cant = cant;
        this.status = "";
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

    @Override
    public String onDisable() {
        return status = "Cancelado";
    }

    @Override
    public String onPending() {
        return status = "Pendiente";
    }

    @Override
    public String onReady() {
        return status = "Listo";
    }

    @Override
    public String onDelivered() {
        return status = "Entregado";
    }
}
        


