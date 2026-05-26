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
public class MainBiayaRental {
    public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    BiayaRental biayarental = null;
    
    System.out.println("Sistem Kendaraan rental");
    System.out.println("========================");
    System.out.print("Masukkan Nomor Polisi :");
    String no  = input.nextLine();
    System.out.print("Masukkan Merek :");
    String merk = input.nextLine();
    System.out.print("Masukkan berapa lama waktu rental : ");
    int lama = input.nextInt();
    
    System.out.println("Pilihlah jenis kendaraan rental");
    System.out.println("1. Mobil");
    System.out.println("2. Motor");
    System.out.println("3. Bis");
    System.out.print("Masukkan pilihan anda (1-3):");
    int pil = input.nextInt();
    
    switch(pil){
        case 1: 
              System.out.println("Mobil");
              System.out.print("Masukkan harga sewa mobil :");
              double hargaSewa = input.nextDouble();
              System.out.print("Masukkan biaya supir :");
              double biayaSupir = input.nextDouble();
              biayarental = new BiayaRentalMobil(no,merk,lama,hargaSewa,biayaSupir);
             break;
        case 2:
            System.out.println("Motor");
            System.out.print("Masukkan harga sewa motor :");
            double sewaMotor = input.nextDouble();
            biayarental = new BiayaRentalMotor(sewaMotor,no,merk,lama);
            break;
        case 3:
            System.out.println("Bis");
            System.out.print("Masukkan Kapsitas isi bis :");
            int kapasitas = input.nextInt();
            System.out.print("Masukkan harga sewa bis:");
            double sewaBis = input.nextDouble();
            biayarental = new BiayaRentalBis(kapasitas,no,merk,lama,sewaBis);
            break;
        default:    
        System.out.println("Pilihan tidak tersedia");             
    }
    System.out.println("Konfirmasi biaya rental");
    biayarental.prosesBiayaRental();
    
    
        
    
}
}
