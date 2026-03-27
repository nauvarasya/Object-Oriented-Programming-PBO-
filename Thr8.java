/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package THR;

/**
 *
 * @author nauva
 */

public class Thr8 {
    public static void main(String[] args) {
        
        int i,c;

        for ( i = 1; i <=5; i++) 
        {
            for (c = 1; c <=5 ; c++) 
            {
                if (i == 1 || i == 5 || i == c) 
                {
                    System.out.print("0 ");
                }
                else 
                {
                    System.out.print("x ");
                }
            }
            System.out.println();
        }
    }
}
