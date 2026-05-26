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
import java.util.Scanner;
public class MainKaryawan {
    public static void main(String[]args){
      Scanner input = new Scanner(System.in);
      Karyawan karyawan = null;
      System.out.println("Sistem Pengkajian Karyawan ");
      System.out.println("---------------------------");
      
      System.out.print("Masukkan Nama :");
      String na =input.nextLine();
      
      System.out.print("Masukkan Nik :");
      String nk = input.nextLine();
      
      System.out.println("Pilihan Divisi");
      System.out.println("1.Karyawan Tetap");
      System.out.println("2.Karyawan Kontrak");
      System.out.print("Pilihan Divisi(1-2) : ");
      int pil = input.nextInt();
       
      switch(pil){
          case 1:
                System.out.println("Karyawan Tetap:");
                System.out.print("Masukkan golongan :");
                int golongan= input.nextInt();
                karyawan = new KaryawanTetap(golongan,nk,na);
                break;
          case 2:
               System.out.println("Karyawan Kontrak");
               karyawan = new KaryawanKontrak(nk,na);
               break;
          default:
          System.out.println("Pilihan tidak tersedia");     
      }
     
      System.out.println("Kondirmasi Gaji Karyawan");
      karyawan.prosesKaryawan();
      
    }
}