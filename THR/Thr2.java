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
public class Thr2 {
    public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    int harga, jumlah;
    char merek;
    double total, diskon, bayar;
    
    harga = 0;
    total = 0;
    diskon = 0;
    
    System.out.print("Masukkan Merek Susu = ");
    merek = in.next().charAt(0);
    
    System.out.print("Masukkan Jumlah = ");
    jumlah = in.nextInt();
    
    if (merek == 'x' || merek == 'X')
    {
        harga = 40000;
        total = harga * jumlah;
        if (jumlah >= 3)
        {
            diskon = total * 0.10;
        }
    }
    else if (merek == 'Y' || merek =='y')
    {
        harga = 50000;
        total = harga * jumlah;
        
        if (jumlah >= 2)
        {
            diskon = (harga * (jumlah-1))*0.15;
        }          
    }
    else if (merek == 'Z' || merek =='z')
    {
        harga = 60000;
        total = harga * jumlah;
        
        if (jumlah >= 2)
        {
            diskon = (harga * (jumlah-1))*0.15;
        }          
    }
    else
        {
            System.out.println("Merek Tidak Tersedia");
            return;
        }
    bayar = total - diskon;
    System.out.println("Total Pembelian = Rp\n"+total);
    System.out.println("Diskon = Rp\n"+diskon);
    System.out.println("Total Pembayaran = RP\n"+bayar);
    
    
    }
    
}
