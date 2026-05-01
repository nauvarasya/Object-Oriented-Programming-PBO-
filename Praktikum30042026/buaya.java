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
public class buaya extends hewan{
    public buaya(String nama){
        super(nama);
    }
    
    
    @Override
    public void bersuara(){
        super.bersuara();
        System.out.println(nama +"berkata:aku sayang kamu");
        
    }
}