/*
 * Program : Praktikum02042026
 * Nama / Nim : Nauva Rasya Zulfi / 2501083006
 * 
 *
 */
package Praktikum02042026;

/**
 *
 * @author nauva
 */
public class PersegiPanjang {///public = access modifier ??
    ///atribut variabel
    int panjang, lebar;
    
    PersegiPanjang(){
    
    
    }
    
    //overloading
    PersegiPanjang(int p, int l){
        panjang=p;
        lebar=l;    
    }
    
    int HitungLuas(){
        return(panjang*lebar);
    }
    
   int HitungKel(){
       return(2*(panjang*lebar));
   }
   
   ///method tanpa kembalian
   void TampilData(){
   System.out.println("Panjang Persegi Panjang = "+panjang);
   System.out.println("Lebar Persegi Panjang = "+lebar);
   System.out.println("Luas Persegi Panjang = "+HitungLuas());
   System.out.println("Keliling             ="+HitungKel());
   } 
}
