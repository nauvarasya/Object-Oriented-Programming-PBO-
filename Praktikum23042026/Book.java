/*
 * Program : Praktikum23042026
 * Nama / Nim : Nauva Rasya Zulfi / 2501083006
 * 
 *
 */
package Praktikum23042026;

/**
 *
 * @author nauva
 */
public class Book {
     private  final String name;
    private  final Author Author;
    private double price;
    private int Qty;
    
    Book( String name, Author Author, double price, int Qty){
        this.name = name;
        this.Author = Author;
        this.price = price;
        this.Qty = Qty;
    }
    public String getName(){
        return name;
    }
    public  Author getAuthor(){
        return Author;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public void setQty(int qty){
        this.Qty = qty;
    }
    public int getQty(){
        return Qty;
    }
    public String toString(){
        return "'"+name + "'by"+Author;
    }
    
}
