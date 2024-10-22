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
public interface IViewManagement <T>{
    public boolean add(T element);
    public T get(T element);
    public boolean remove(T elemet);
    public T set(T element);
    public List getAll();
}
