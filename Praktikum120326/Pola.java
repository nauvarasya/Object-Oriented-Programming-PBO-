
/*
 * Program : Pola
 * Nama / Nim : Nauva Rasya Zulfi / 2501083006
 * 
 *
 */
package Praktikum120326;

/**
 *
 * @author nauva
 */
import java.util.Scanner;
public class Pola {
    public static void main (String[] args){
        int i,x,j,y;
        Scanner input = new Scanner (System.in);
        System.out.print("Masukkan Angka 1 = ");
        x = input.nextInt();
        System.out.print("Masukkan Angka 2 = ");
        y = input.nextInt();

        for(i=1; i<=x; i++){

            for(j=1; j<=y; j++){
                System.out.print("*");
            }
            System.out.print(" ");
        }


    }

}

