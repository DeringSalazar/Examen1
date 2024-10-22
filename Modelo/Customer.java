/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Student
 */
public class Customer {
    private int id;
    private String name;
    private String numberPhone;

    public Customer(int id, String name, String numberPhone) {
        this.id = id;
        this.name = name;
        this.numberPhone = numberPhone;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public Customer(int id) {
        this(id,"","");
    }

    public Customer() {
        this(0);
    }

    @Override
    public String toString() {
        return "Customer{" + "id=" + id + ", name=" + name + ", numberPhone=" + numberPhone + '}';
    }
    
    
}
