/*
 * Program : Praktikum09042026
 * Nama / Nim : Nauva Rasya Zulfi / 2501083006
 * 
 *
 */
package Praktikum090426;

/**
 *
 * @author nauva
 */
import java.util.Scanner;
public class MainPersegiPanjangEnkapsulasi {
      public static  void main(String[]args){
        System.out.print("\nJumlah Objek: "+ PersegiPanjangEnkapsulasi.getJumlahObjek());
        PersegiPanjangEnkapsulasi pp1 = new PersegiPanjangEnkapsulasi();
        pp1.setPanjang(10);
        pp1.setLebar(7);
        System.out.println("\nakses method dalam main class ");
        System.out.println("Luas persegi panjang= "+pp1.HitungLuas());
        System.out.println("Keliling persegi panjang= "+pp1.HitungKel());
        
        System.out.println();
        pp1.TampilData();
        
        //object pp2 menggunakan constructor 2
        System.out.println("Object 2 menggunakan constructor 2 ");
        PersegiPanjangEnkapsulasi pp2 = new PersegiPanjangEnkapsulasi(19,20);
        System.out.println("\nakses method dalam main class ");
        System.out.println("Luas persegi panjang= "+pp2.HitungLuas());
        System.out.println("Keliling  persegi panjang=  "+pp2.HitungKel());
        
        System.out.println();
        pp1.TampilData();
        //object pp3 menggunakan constructor 2
        System.out.println("\nObject 3 menggunakan constructor 3");
        System.out.println("Panjang dan Lebar input user");
        
        
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan panjang= ");
        int p=in.nextInt();
        
        System.out.print("Masukkan lebar= ");
        int l=in.nextInt();
        
        PersegiPanjangEnkapsulasi pp3 = new PersegiPanjangEnkapsulasi(p,l);
        pp3.TampilData();
        System.out.print("Jumlah Objek: "+ PersegiPanjangEnkapsulasi.getJumlahObjek());

     }
}