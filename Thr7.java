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
public class Thr7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int jamLembur, upahJam,  total;
        
        System.out.print("Masukkan jumlah jam lembur: ");
         jamLembur = in.nextInt();

        if (jamLembur > 50)
        {
            jamLembur = 50;
        }

        
        if (jamLembur <= 20) 
        {
            upahJam = 2000;
        } 
        else 
        {
            upahJam = 3000;
        }

         total = jamLembur * upahJam;

        System.out.println("Total upah lembur = Rp." + total);

        
    }

}
