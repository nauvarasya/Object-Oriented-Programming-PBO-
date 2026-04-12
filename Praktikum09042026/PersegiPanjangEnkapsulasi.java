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
public class PersegiPanjangEnkapsulasi {///public acces modifier
    //atribut variabel
       private int panjang;
       private int lebar;
       private static int JumlahObjek = 0;
        
        //constructor kosong   
        PersegiPanjangEnkapsulasi()
        {
          JumlahObjek ++;
        }
        
        //constructor 2-overloading
        PersegiPanjangEnkapsulasi (int p, int l)
        {
            panjang=p;
            lebar=l;
            JumlahObjek ++;
        }
        
        //Getter dan Setter
        public void setPanjang(int PanjangBaru)
        {
            panjang=PanjangBaru;
        }
        public int getPanjang()
        {
            return panjang;
        }
        
        public void setLebar(int lebar)
        {
          this.lebar =lebar;
        }
        
        public int getLebar()
        {
            return lebar;
        }
        
        public static int  getJumlahObjek()
        {
            return JumlahObjek;
        }
        
        //method dengan nilai kembalian
        int HitungLuas()
        {
            return(panjang*lebar);
        }
         
        int HitungKel()
        {
            return(2*(panjang+lebar));
        }
        
        void TampilData()
        {
            System.out.println("Panjang persegi panjang= "+panjang);
            System.out.println("Lebar persegi panjang= "+lebar);
            System.out.println("Luas persegi panjang= "+HitungLuas());
            System.out.println("Keliling persegi panjang= "+HitungKel());
        }
    }
    


