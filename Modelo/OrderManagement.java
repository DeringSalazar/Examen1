/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Student
 */
public class OrderManagement implements IViewManagement<Customer, Product>{
    private static OrderManagement instance;
    private final List<Customer> customerList;
    private final List<Product> productList;

    private OrderManagement() {
        customerList = new ArrayList<>();
        productList = new ArrayList<>();
    }

    public OrderManagement(List<Customer> customerList, List<Product> productList) {
        this.customerList = customerList;
        this.productList = productList;
    }
    
    
    public static OrderManagement getInstance(){
        if (instance == null) {
            instance = new OrderManagement();
        }
        return instance;
    }

    public Object get(Object element){
        
        return null;
        
    }

    @Override
    public boolean add(Customer element, Product eleme) {
        Customer customer = (Customer) get(element);
        Product product = (Product) get(element) ;
        
        if (customer != null && product != null) {
            return false;
        }
        customerList.add(customer);
        productList.add(product);
        return true;
    }

    @Override
    public Product get(Customer customer, Product producto) {
        for(Customer current : customerList){
            for(Product prod :  productList){
                if (current.getId() == customer.getId() && prod.getId() == producto.getId()) {
                    return prod;
                }
            }
        }
        return null;
    }

    @Override
    public boolean remove(Customer customer, Product producto) {
        if (customer != null && get(customer)!= null) {
            if (producto != null && get(customer)!=null) {
                customerList.remove(customer);
                productList.remove(producto);
                return true;
            }
        }
        return false;
    }

    @Override
    public Product set(Customer customer, Product producto) {
        if (customer!=null) {
            Customer current = (Customer) get(customer);
            if (producto!=null) {
                Product prod = (Product) get(current);
                if(current == null){
                    customerList.remove(current);
                    customerList.add(current);
                    productList.remove(prod);
                    productList.add(prod);
                }
            }
        }
        return null;
    }

    @Override
    public List getAll() {
        if(customerList.isEmpty()){
            if(productList.isEmpty()){
                return null;
            }
            return productList;
        }
        return customerList;
    }
    

}
