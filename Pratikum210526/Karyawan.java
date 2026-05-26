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
public abstract class Karyawan {
    protected String nik;
    protected String nama;

    public Karyawan() {
    }

    public Karyawan(String nik, String nama) {
        this.nik = nik;
        this.nama = nama;
    }

    public String getNik() {
        return nik;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
    
       public abstract void prosesKaryawan();
}
