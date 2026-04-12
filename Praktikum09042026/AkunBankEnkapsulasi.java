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

public class AkunBankEnkapsulasi {
    private String norekening;
    private String nama;
    private double saldo;
    
    public AkunBankEnkapsulasi(){
    
    }
    public AkunBankEnkapsulasi(String norek, String nm, double sd)
    {
        norekening = norek;
        nama = nm;
        saldo = sd;
    }
    public String getNorekening()
    {
        return norekening;
    }
    public void setNoRekening(String norek)
    {
        this.norekening = norek;
    }
    public String getNama()
    {
        return nama;
    }
    public void setNama(String nm)
    {
        this.nama = nm;
    }
    public double getSaldo()
    {
        return saldo;
    }
    public void setSaldo(double sd)
    {
        this.saldo = sd;
    }
    public void deposit(double jumlah)
    {
        if(jumlah > 0)
        {
            saldo = saldo + jumlah;
            System.out.println("Deposit Rp."+jumlah+"Sukses");
        }
        else
        {
            System.out.println("Deposit Invalid");
        }
    }
    public void withdraw(double jumlah)
    {
        if(jumlah > saldo)
        {
            System.out.println("Saldo Tidak Mencukupi");
        }
        else if(jumlah > 0)
        {
            saldo = saldo - jumlah;
            System.out.println("Withdraw Sebesar Rp."+jumlah+"Sukses");
        }
        else 
        {
            System.out.println("Jumlah Invalid");
        }
    }
    public void TampilkanInfo()
    {
        System.out.println("Nama Nasabah :"+nama);
        System.out.println("No Rekening :"+norekening);
        System.out.println("Jumlah Saldo"+saldo);
    }
}
