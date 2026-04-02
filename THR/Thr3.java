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
public class Thr3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int awal, akhir;
        int jumlah = 0;
        int total = 0;
        double rata = 0;

        System.out.print("Masukkan  Angka Awal = ");
        awal = scanner.nextInt();

        System.out.print("Masukkan Angka Akhir = ");
        akhir = scanner.nextInt();

        System.out.println("Deret Bilangan = ");

        for (int i = awal; i <= akhir; i++) 
        {
            if (i % 11 == 0 && i % 2 != 0) 
            {
                System.out.print(i + " ");
                total += i;
                jumlah++;
            }
        }

        if (jumlah != 0) {
             rata = (double) total / jumlah;
        } else {
            System.out.println("\nTidak Ada Bilangan");
        }

        
    }
}

