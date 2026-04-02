/*
 * Program : Perulangan While
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
public class PerulanganWhile {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int x, banyak;
    banyak = 1;
    System.out.print("Masukkan Angka = ");
    x = input.nextInt();
    while(x > 10)
    {
        System.out.print("Masukkan Angka = ");
        x = input.nextInt();
        banyak = banyak + 1;
        
    }
    System.out.print("Jumlah angka yang di inputkan adalah = " + banyak);
    }
}

