/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum30042026;

/**
 *
 * @author nauva
 */
public class Udara extends Kendaraan{
    private boolean mesin;
    
    public Udara(){
        super();
    }
    
    public Udara(String nama,int thnProduksi, boolean mesin){
        super(nama,thnProduksi);
        this.mesin=mesin;
    }
    public boolean getMesin(){
    return mesin;
    } 
    public void  setMesin(boolean mesin){
        this.mesin=mesin;
    }
    
    
    @Override
    public void cetak(){
        
        System.out.println("Menggnakan Mesin:"+(mesin ?"ya":"Tidak"));
    }
            
       
}
