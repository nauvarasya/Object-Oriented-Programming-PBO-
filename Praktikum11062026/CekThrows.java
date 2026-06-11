/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum11062026;

/**
 *
 * @author nauva
 */
import java.util.Scanner;
public class CekThrows {
    // method exception
    public static void cekAngka(int a)throws Exception{
        //body throw
        if (a<0){
           throw new Exception("Nilai tidak boleh negatif!"); 
        }
        else if(a>100)
        {
            throw new Exception("Nlai tidak boleh lebih dari 100!");
        }
    }
    public static void main(String[]args){
        Scanner in  = new Scanner(System.in);
        System.out.print("Masukkan sebuah angka = ");
        int angka = in.nextInt();
        try{
        cekAngka(angka);
        System.out.println("Nilai berhasil disimpan");
    }   catch (Exception ex) {
          System.out.println("Error"+ex.getMessage());
        }
    }
}
