/*
 * Program : Praktikum09042026
 * Nama / Nim : Nauva Rasya Zulfi / 2501083006
 * 
 *
 */
package Praktikum090426;

/**
 *
 * @author nauva
 */
import java.util.Scanner;
public class MainAkunBankEnkapsulasi {
    public static void main(String[]args)
   {
       AkunBankEnkapsulasi pp1 = new AkunBankEnkapsulasi();
       pp1.setNama("Nauva Rasya Zulfi");
       pp1.setNoRekening("000666000");
       pp1.setSaldo(9999999);
       pp1.TampilkanInfo();
       
       System.out.println();
       Scanner input = new Scanner(System.in);
       System.out.print("\nMasukkan Jumlah Deposit= ");
       double deposit = input.nextDouble();
       pp1.deposit(deposit);
       pp1.TampilkanInfo();
       System.out.print("\nMasukkan Jumlah Withdraw= ");
       double withdraw = input.nextDouble();
       pp1.withdraw(withdraw);
       pp1.TampilkanInfo();
       System.out.println();
        
       System.out.print("MAsukkan Jumlah Deposit= ");
       double depositt = input.nextDouble();
       System.out.print("Masukkan jumlah Withdraw= ");
       withdraw = input.nextDouble();
       AkunBankEnkapsulasi pp2 = new AkunBankEnkapsulasi("000666000","Nauva",9999999);
       pp2.deposit(depositt);
       pp2.withdraw(withdraw);
       pp2.TampilkanInfo();
        
   }
}
