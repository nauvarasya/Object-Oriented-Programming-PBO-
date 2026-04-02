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
import java.util.Scanner;
public class MainPersegiPanjang {
  public static void main(String[] args){
    //TODO code application logic here
    //object ppl menggunakan constructor 1
    PersegiPanjang pp1 = new PersegiPanjang();
    pp1.panjang=10;
    pp1.lebar=7;
    System.out.println("Objek 1 menggunakan constructor 1");
    System.out.println("Akses Method dalam main class");
    System.out.println("Luas Perasegi Panjang = "+pp1.HitungLuas());
    System.out.println("Keliling = "+pp1.HitungKel());
    
    System.out.println();
    pp1.TampilData();
    
    //object pp2 menggunakan constructor 2
    PersegiPanjang pp2 = new PersegiPanjang(19,20);
    System.out.println("Objek 2 menggunakan constructor 2");
    System.out.println("Akses Method dalam main class");
    System.out.println("Luas Perasegi Panjang = "+pp2.HitungLuas());
    System.out.println("Keliling = "+pp2.HitungKel());
    
    System.out.println();
    pp2.TampilData();
   
    
    //object pp3 menggunakan constructor 3
    Scanner in = new Scanner(System.in);
    System.out.println("\nObjek 3 menggunakan constructor 3");
    System.out.println("Panjang dan lebar input user");
    System.out.println("Masukkan Panjang = ");
    int panjang = in.nextInt();
    System.out.println("Masukkan lebar = ");
    int lebar = in.nextInt();
    PersegiPanjang pp3 = new PersegiPanjang(panjang,lebar);
    
    pp3.TampilData();
    System.out.println();
   

  }
}
