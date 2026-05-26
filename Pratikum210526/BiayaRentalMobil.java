/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum210526;

/**
 *
 * @author nauva
 */
public class BiayaRentalMobil extends BiayaRental {
      private double hargaSewa;
      private double biayaSupir;

    public BiayaRentalMobil(String noPolisi, String merek, int lamaSewa, double hargaSewa, double biayaSupir) {
        super(noPolisi, merek, lamaSewa);
        this.hargaSewa = hargaSewa;
        this.biayaSupir = biayaSupir;
    }
  
    
   
    public double getHargaSewa() {
        return hargaSewa;
    }

    public void setHargaSewa(double hargaSewa) {
        this.hargaSewa = hargaSewa;
    }

    public double getBiayaSupir() {
        return biayaSupir;
    }

    public void setBiayaSupir(double biayaSupir) {
        this.biayaSupir = biayaSupir;
    }
    @Override
     public void prosesBiayaRental(){
         double totalBayar = lamaSewa*hargaSewa+biayaSupir;
         System.out.println("No Polisi               :"+noPolisi);
         System.out.println("Merek mobil             :"+merek);
         System.out.println("Berapa lama rental mobil:"+lamaSewa);
         System.out.println("Harga Sewa              :"+hargaSewa);
         System.out.println("Biaya Supir             :"+biayaSupir);
         System.out.println("Total Bayar rental mobil:"+totalBayar);
     }
   
    
}
