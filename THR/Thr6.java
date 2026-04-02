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
public class Thr6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int umur, dekade;
        System.out.print("Masukkan umur PNP : ");
        umur = scanner.nextInt();

        if (umur % 10 == 0) 
        {
             dekade = umur / 10;
            System.out.println("Dekade PNP Ke " + dekade);
        } else 
        {
            System.out.println("Dies Natalis PNP Ke " + umur);
        }
    }
}

