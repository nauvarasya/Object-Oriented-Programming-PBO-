/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum04062026;

/**
 *
 * @author nauva
 */
public class Keyboard extends AlatMusik implements BisaDinyalakan {
    private boolean dayaTersambung;
    public Keyboard(boolean dayaTersambung,String nama, String jenis) {
        super(nama, jenis);
        this.dayaTersambung = dayaTersambung;
    }

    @Override
    public void mainkan() {
       System.out.println(nama+" dimainkan dengan menekan tuas.");
    }

    @Override
    public void stem() {
        System.out.println("Keyboard "+nama+" distem digital dengan aplikasi.");
    }

    @Override
    public void nyalakan() {
       System.out.println(nama+" dinyalakan.");
    }

    @Override
    public void matikan() {
       System.out.println(nama+" dimatikan.");
    }

    @Override
    public boolean cekListrik() {
        return dayaTersambung;
       
        
    }
    
    
}
