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
public class anjing extends hewan{
  public anjing(String nama){
        super(nama);
    }
    
    @Override
    public void bersuara(){
        super.bersuara();
        System.out.println(nama +"berkata:gukguk");
        
    }    
}
