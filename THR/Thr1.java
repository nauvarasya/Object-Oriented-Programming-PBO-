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
public class Thr1 {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        int total_halaman, x, bayar, uang_diterima, sisa_halaman, sisa_uang;
        
        total_halaman=50;
        bayar=15000;
        
        System.out.print("Masukkan jumlah yang di print = ");
        x=in.nextInt();
        
        uang_diterima = x * bayar;
        sisa_halaman = total_halaman - x;
        sisa_uang = sisa_halaman * bayar;
        
        System.out.print("\nUang yang diterima =" + uang_diterima);
        System.out.print("\nUang yang masih bisa didapatkan = " + sisa_uang);
    }
    
}
