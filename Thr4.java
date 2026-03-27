/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package THR;

/**
 *
 * @author nauva
 */
import java.util.Scanner;
public class Thr4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angka;

        System.out.print("Masukkan bilangan genap = ");
        angka = scanner.nextInt();

        while (angka % 2 != 0) 
        {
            System.out.println("\nBilangan Ganjil, Coba lagi");
            System.out.print("\nMasukkan bilangan genap : ");
            angka = scanner.nextInt();
        }

        
        angka = angka + 1;

        System.out.println("Hasil = " + angka);

        
    }
}

