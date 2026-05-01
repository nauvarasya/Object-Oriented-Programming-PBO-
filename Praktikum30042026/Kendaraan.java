/*
 * Program : Praktikum30042026
 * Nama / Nim : Nauva Rasya Zulfi / 2501083006
 * 
 *
 */
package Praktikum30042026;

/**
 *
 * @author nauva
 */
public class Kendaraan {
    private String nama;
    private int thnProduksi;

    public Kendaraan(){

    }

    public Kendaraan(String nama,int thnProduksi){
        this.nama= nama;
        this.thnProduksi=thnProduksi;
    }


    public String getNama(){
        return nama;
    }
    public void setNama(String nama){
        this.nama=nama;
    }
    public int getthnProduksi(){
        return thnProduksi;
    }
    public void setthnProduksi(int thnProduksi ){
        this.thnProduksi= thnProduksi;
    }
    public void cetak(){
        System.out.println("Nama kendaraan:"+nama);
        System.out.println("Tahun Produksi:"+thnProduksi);

    } 

}
