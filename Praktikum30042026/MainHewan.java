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
public class MainHewan {    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        hewan hewanUmum= new hewan ("Makluk");
        anjing anjingku= new anjing ("Mona");
        buaya buayaku= new buaya ("Buaya Darat");
        
        hewanUmum.tampilkanNama();
        hewanUmum.bersuara();
        
        
        System.out.println();
        
        anjingku.tampilkanNama();
        anjingku.bersuara();
        
        System.out.println();
        
        buayaku.tampilkanNama();
        buayaku.bersuara();
        
        System.out.println();
        
    }
}
