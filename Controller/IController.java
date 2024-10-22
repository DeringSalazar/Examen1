/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.util.List;

/**
 *
 * @author Student
 * @param <T>
 */
public interface IController <T>{
    public boolean add(T element);
    public T get(T element);
    public boolean remove(T elemet);
    public T set(T element);
    public List getAll();
}
