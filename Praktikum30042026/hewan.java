/*
 * Program : Praktikum30042026
 * Nama / Nim : Nauva Rasya Zulfi / 2501083006
 * 
 *
 */
package Praktikum30042026;

/**
 *
 * @author nauva
 */
public class hewan {
  protected String nama;
    
    public hewan (String nama){
        
        this.nama=nama;
    }
    
    public void bersuara(){
        System.out.println("Bersuaraa....");
    }
    public void tampilkanNama(){
        System.out.println("Nama hewan :"+nama);
    }
        
}
