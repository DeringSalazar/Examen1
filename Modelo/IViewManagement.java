/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Modelo;

import java.util.List;

/**
 *
 * @author Student
 */
public interface IViewManagement <Customer, Product>{
    public boolean add(Customer element, Product eleme);
    public Product get(Customer element, Product eleme);
    public boolean remove(Customer element, Product eleme);
    public Product set(Customer element, Product eleme);
    public List getAll();
}
