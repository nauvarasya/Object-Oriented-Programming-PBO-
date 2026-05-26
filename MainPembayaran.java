/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pratikum210526;

/**
 *
 * @author nauva
 */
import java.util.Scanner;
public class MainPembayaran {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        Pembayaran pembayaran = null;
        
        System.out.println("Sistem Pembayaran Toko Nisa");
        System.out.println("----------------------------");
        System.out.print("Masukkan Id Transaksi:");
        String id  = input.nextLine();
        
        System.out.print("Masukkan Total Pembayaran:");
        double jumlah = input.nextDouble();
        input.nextLine();//clear buffer
        
        System.out.println("\n Pilihan Metode Pembayaran");
        System.out.println("1. Pembayaran secara tunai");
        System.out.println("2. pembayaran secara transfer");
        System.out.println("3. Pembayaan Menggunakan kartu kredit");
        System.out.println("4. Penmbayaran menggunakan E-Wallet");
        System.out.print("Pilihan Anda(1-4):");
        int pil = input.nextInt();
        input.nextLine();
        
        switch(pil){
            case 1: System.out.print("Inputkan jumlah uang:");
                    double uang = input.nextDouble();
                    pembayaran = new PembayaranTunai(uang,jumlah,id);
                    break;
            case 2: System.out.print("Masukkan nama bank:");
                    String nama = input.nextLine();
                    pembayaran = new PembayaranTransfer(nama,jumlah,id);
                   
                  
            case 3: System.out.print("Masukkan nama kartu(Mastercard,Visacard:");
                    String namaKartu = input.nextLine();
                    System.out.print("Masukkan no Kartu:");
                    String no = input.nextLine();
                    pembayaran = new PembayaranKartuKredit(no,namaKartu,jumlah,id);
                    
            case 4: System.out.print("Masukkan nama E-Wallet(Ovo,Dana,ShoopeePay):");
                    String ewallet = input.nextLine();
                    pembayaran = new PembayaranTransfer(ewallet,jumlah,id);
                           
            default:         
            System.out.println("Pilihan tidak tersedia");
        }
        
        
        
        System.out.println("Konfirmasi pembayaran");
        pembayaran.prosesPembayaran();
        
        
        
        
        
    }
}