/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum210526;

/**
 *
 * @author nauva
 */
public class PembayaranTunai extends Pembayaran{
  
    private double uang;


    public PembayaranTunai(double uang ,double jumlahBayar, String idTransaksi) {
        super(jumlahBayar, idTransaksi);
        this.uang=uang;
       
    }

    
    public double getUang() {
        return uang;
    }

    public void setUang(double uang) {
        this.uang = uang;
    }

    @Override
    public void prosesPembayaran() {
         System.out.println("Proses Pembayaran secara Tunai");
      System.out.println("Id Transaksi :"+idTransaksi);
      System.out.println("Jumlah bayar :"+jumlahBayar);
      System.out.println("Uang yang diberikan: Rp."+uang);
      if(uang>=jumlahBayar){
          double kembalian = uang-jumlahBayar;
          System.out.println("Proses Pembayaran Berhasil!");
          System.out.println("Uang Kembalian: Rp."+kembalian);
      }
      else{
          double kekurangan =jumlahBayar-uang;
          System.out.println("Proses Pembayaran Gagal!!");
          System.out.println("Uang Anda kurang sebanyak:Rp."+kekurangan);
      }
    }
    
    
    
}
