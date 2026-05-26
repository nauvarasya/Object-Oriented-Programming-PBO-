/*
 * Program : Praktikum21052026
 * Nama / Nim : Nauva Rasya Zulfi / 2501083006
 * 
 *
 */
package Pratikum210526;

/**
 *
 * @author nauva
 */
public class KaryawanKontrak extends Karyawan {
    private double uangMakan  = 300000;

    
    public KaryawanKontrak() {
    }

    public KaryawanKontrak(String nik, String nama) {
        super(nik, nama);
    }

    
    public double getUangMakan() {
        return uangMakan;
    }

    public void setUangMakan(double uangMakan) {
        this.uangMakan = uangMakan;
    }

      
    @Override
    public void prosesKaryawan() {
       System.out.println("Nik            :"+nik);
       System.out.println("Nama Karyawan  :"+nama);
       System.out.println("Uang Makan     :"+uangMakan);
      
       
    }
}
