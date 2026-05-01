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
public class MainPesawat {   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Membuat array pesawat
        
        Pesawat[]daftarPesawat= new Pesawat[3];
        
        //Mengisi elemen array
        daftarPesawat[0]=new Pesawat ("Boeing 737i",2015,true,180);
        daftarPesawat[1]=new Pesawat ("Airbus A320",2020,true,140);
        daftarPesawat[2]=new Pesawat ("Cessa 172",2008,false,4);
        
        //Menampilkan semua data pesawat
        for (int i = 0; i < daftarPesawat.length; i++){
            System.out.println("=== Data pesawat ke-"+(i+1)+"===");
            daftarPesawat[i].cetak();
            System.out.println();
    }
        
    }
    
}
