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
public class Thr5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int awal, akhir;

        System.out.print("Masukkan nomor awal : ");
        awal = scanner.nextInt();

        System.out.print("Masukkan nomor akhir : ");
        akhir = scanner.nextInt();

        System.out.println("Misi yang membuka portal rahasia:");

        
        for (int i = awal; i <= akhir; i++) {
            if (i % 3 == 0 && i % 4 == 0) 
            { 
                System.out.print(i + " ");
                
            }
             
        }
    }
}

