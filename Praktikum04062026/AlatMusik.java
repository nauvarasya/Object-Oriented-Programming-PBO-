/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum04062026;

/**
 *
 * @author nauva
 */
public abstract class AlatMusik {
    protected String nama;
    protected String jenis;
    
    public AlatMusik(String nama, String jenis){
        this.nama = nama;
        this.jenis = jenis;
    }
    
    public void info(){
        System.out.println("Nama Alat Musik : "+nama+". Jenis = "+jenis);
        
    }
    
    // Contoh Method polymorphism
    
    public abstract void mainkan();
    public abstract void stem();
}
