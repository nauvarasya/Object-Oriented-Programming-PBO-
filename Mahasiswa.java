/*
 * Program : Praktikum02042026
 * Nama / Nim : Nauva Rasya Zulfi / 2501083006
 * 
 *
 */
package Praktikum02042026;

/**
 *
 * @author nauva
 */
public class Mahasiswa {
    /// atribut variabel
   String nama;
   String nobp;
   double tugas,UTS,UAS;
   
    /// constructor tanpa parameter
     Mahasiswa(){
    }

    /// constructor overloading dengan identitas + nilai
    Mahasiswa(double tgs,double uts,double uas){
       tugas=tgs;
       UTS=uts;
       UAS=uas;
    }

    /// method hitung nilai akhir
    double NilaiAkhir(){
        return((0.25 * tugas) + (0.35 *UTS)+ (0.40 *UAS));
   }

    /// method tampilkan data
    void TampilData(){
       System.out.println("Nama Mahasiswa   = " + nama);
       System.out.println("No BP            = " + nobp);
       System.out.println("Nilai TUGAS"+tugas);
       System.out.println("Nilai UAS= "+UAS);
       System.out.println("Nilai UTS= "+UTS);
       System.out.println("Total nilai  akhir mahasiswa= "+NilaiAkhir());
   }
}
