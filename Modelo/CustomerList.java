/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.HashSet;

/**
 *
 * @author Student
 */
public class CustomerList {
    HashSet list = new HashSet<Customer>();

    public boolean add(Customer customer){
        list.add(customer);
        return true;
    }
    
    public Customer get(Customer customer){
            return customer;
    }
    
    public boolean remove(Customer customer){
        list.remove(customer);
        return true;
    }
    
    public String getAll(){
        return list.toString();
    }
    
    
}
