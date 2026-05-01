/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum30042026;

/**
 *
 * @author nauva
 */
public class Pesawat extends Udara {
    private int muatan;
    
    public Pesawat(){
        super();
    }
    
    public Pesawat(String nama,int thnProduksi,boolean mesin,int muatan){
    super(nama, thnProduksi, mesin);
    this.muatan= muatan; 
    }
    
    public void reset (String nama, int thnProduksi,boolean mesin,int muatan){
        setNama(nama);
        setthnProduksi(thnProduksi);
        setMesin(mesin);
        setMuatan(muatan);
    }
    
    public int getMuatan(){
    return muatan;
    } 
    public void  setMuatan(int muatan){
        this.muatan=muatan;
    }
    public String Kategori(int muatan){
        if(muatan<=50) 
                  return "Kecil";
             else if (muatan <=150)
                 return"Sedang";
             else 
                 return("Besar");
    }
    
    @Override
    public void cetak(){
        super.cetak();
        System.out.println("Muatan:"+muatan+"Penumpang");
        System.out.println("kategori:"+Kategori(muatan));
    }    
}
