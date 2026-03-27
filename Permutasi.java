
/*
 * Program : Permutasi
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
public class Permutasi {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n, r, i, permutasi, faktorial, faktorial1;
        System.out.print("Masukkan Angka 1 = ");
        n = input.nextInt();
        System.out.print("Masukkan Angka 2 = ");
        r = input.nextInt();
        faktorial = 1;
        faktorial1 = 1;

        for(i=1; i<=n; i++)
        {
            faktorial = faktorial * i;
        }
        for(i=1; i<=n; i++)
        {
            faktorial1 = faktorial1 * i;
        }

        permutasi = faktorial / faktorial1;
        System.out.print("Permutasi("+n+", "+r+") = "+ permutasi);

    }

}

