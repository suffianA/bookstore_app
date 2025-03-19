/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bookstore;

/**
 *
 * @author ali05
 */
public class Book {
    String name;
    double price;
    
    public void book(String name, double price){
        this.name = name;
        this.price = price;
    }
    
    public void setName(String n){
        this.name = n;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setPrice(double p){
        this.price = p;
    }
    
    public double getPrice(){
        return this.price;
    }
    
    
}
