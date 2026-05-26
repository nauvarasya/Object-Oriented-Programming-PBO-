/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum210526;

/**
 *
 * @author nauva
 */
public class KaryawanTetap extends Karyawan {
    private int golongan;
    private double tunjangan;
    private double gajiPokok;

    public KaryawanTetap(int golongan, String nik, String nama) {
        super(nik, nama);
        this.golongan = golongan;
    }

    

    public double getTunjangan() {
        return tunjangan;
    }

    public void setTunjangan(double tunjangan) {
        this.tunjangan = tunjangan;
    }

    public double getGajiPokok() {
        return gajiPokok;
    }

    public void setGajiPokok(double gajiPokok) {
        this.gajiPokok = gajiPokok;
    }

    
    
    public int getGolongan() {
        return golongan;
    }

    public void setGolongan(int golongan) {
        this.golongan = golongan;
    }

    @Override
    public void prosesKaryawan() {
       switch(golongan){
           case 1:
               gajiPokok = 5000000;
               break;
           case 2:
               gajiPokok = 3000000;
               break;
           case 3:
               gajiPokok = 2000000;
               break;
              
        
        default:
        System.out.println("Golongan tidak tersedia");
       
       }
       tunjangan = 0.12 * gajiPokok;
       System.out.println("Nik            :"+nik);
       System.out.println("Nama Karyawan  :"+nama);
       System.out.println("Golongan ke-   :"+golongan);
       System.out.println("Gaji Pokok     :"+gajiPokok);
       System.out.println("Tunjangan      :"+tunjangan);
       System.out.println("Total Gaji     :"+(gajiPokok + tunjangan ));
       
    }

    
    
}