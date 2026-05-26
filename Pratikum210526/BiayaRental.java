/*
 * Program : Praktikum21052026
 * Nama / Nim : Nauva Rasya Zulfi / 2501083006
 * 
 *
 */
package Pratikum210526;

/**
 *
 * @author nauva
 */
public abstract class BiayaRental {
  protected String noPolisi;
  protected String merek;
  protected int lamaSewa; 

    public BiayaRental() {
    }

    public BiayaRental(String noPolisi, String merek, int lamaSewa) {
        this.noPolisi = noPolisi;
        this.merek = merek;
        this.lamaSewa = lamaSewa;
    }

    public String getNoPolisi() {
        return noPolisi;
    }

    public void setNoPolisi(String noPolisi) {
        this.noPolisi = noPolisi;
    }

    public String getMerek() {
        return merek;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public int getLamaSewa() {
        return lamaSewa;
    }

    public void setLamaSewa(int lamaSewa) {
        this.lamaSewa = lamaSewa;
    }
    public abstract void prosesBiayaRental();
  

}
