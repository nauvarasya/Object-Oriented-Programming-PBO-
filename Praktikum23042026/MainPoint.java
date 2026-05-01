/*
 * Program : Praktikum23042026
 * Nama / Nim : Nauva Rasya Zulfi / 2501083006
 * 
 *
 */
package Praktikum23042026;

/**
 *
 * @author nauva
 */
public class MainPoint {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Point Rin = new Point(1,2);
       System.out.println(Rin);
       
        Rin.setX(5);
        Rin.setY(4);
        System.out.println(Rin);
        System.out.println("X :"+Rin.getX());
        System.out.println("Y: "+Rin.getY());
        int[] xy = Rin.getXY();
        System.out.println("XY : (" + xy[0] + "," + xy[1] + ")"); 
             
   } 
}
