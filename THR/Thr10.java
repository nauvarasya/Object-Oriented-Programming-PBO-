/*
 * Program : THR
 * Nama / Nim : Nauva Rasya Zulfi / 2501083006
 * 
 *
 */
package THR;

/**
 *
 * @author nauva
 */

import java.util.Scanner;
public class Thr10 {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        
        int tjn, kls, tkt, hrga, total, diskn, byr;
        hrga = 0;
        total = 0;
        diskn = 0;
        byr = 0;
        
        System.out.print("Tujuan \n1. Jakarta \n2. Yogya \n3. Surabaya");
        System.out.println();
        System.out.print("Masukkan Tujuan :");
        tjn = in.nextInt();
        System.out.print("1. Eksekutif \n2. Bisnis \n3. Ekonomi");
        System.out.println();
        System.out.print("Masukkan Kelas :");
        kls = in.nextInt();
        System.out.println();
        System.out.print("Masukkan Jumlah Tiket :");
        tkt = in.nextInt();
        
       switch(tjn)
        {
            case 1 -> 
            {
                switch(kls)
                {
                    case 1 -> hrga = 70000;
                    case 2 -> hrga = 40000;
                    case 3 -> hrga = 10000;
                }
            }

            case 2 -> 
            {
                switch(kls)
                {
                    case 1 -> hrga = 80000;
                    case 2 -> hrga = 50000;
                    case 3 -> hrga = 20000;
                }
            }

            case 3 -> 
            {
                switch(kls)
                {
                    case 1 -> hrga = 90000;
                    case 2 -> hrga = 60000;
                    case 3 -> hrga = 30000;
                }
            }
        }

        total = hrga * tkt;

        if(tkt >= 4 && ((tjn == 3 && kls == 1) || (tjn == 2 && kls == 3)))
        {
            diskn = total * 10 / 100;
        }

        byr = total - diskn;

        System.out.println("\nHarga tiket =Rp" + hrga);
        System.out.println("Total harga =Rp" + total);
        System.out.println("Diskon =Rp" + diskn);
        System.out.println("Total bayar =Rp" + byr);
    }
}    
