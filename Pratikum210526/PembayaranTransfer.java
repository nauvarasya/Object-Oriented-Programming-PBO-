/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum210526;

/**
 *
 * @author nauva
 */
public class PembayaranTransfer extends Pembayaran {
     private String namaBank;

    public PembayaranTransfer() {
    }

     
    public PembayaranTransfer(String namaBank, double jumlahBayar, String idTransaksi) {
        super(jumlahBayar, idTransaksi);
        this.namaBank = namaBank;
    }

    public String getNamaBank() {
        return namaBank;
    }

    public void setNamaBank(String namaBank) {
        this.namaBank = namaBank;
    }

    

    @Override
    public void prosesPembayaran() {
      System.out.println("Proses Pembayaran secara Transfer");
      System.out.println("Bank        : "+namaBank);
      System.out.println("Id Tranakasi:"+idTransaksi);
      System.out.println("Jumlah Bayar: Rp."+jumlahBayar);
    }
    
     
}
