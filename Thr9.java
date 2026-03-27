/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package THR;

/**
 *
 * @author nauva
 */
import java.util.Scanner;
public class Thr9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i,n,j,k;
        
        System.out.print("Masukkan ukuran: ");
        n = in.nextInt();

        for (i = n; i >= 1; i--) 
        {
            for (k = 1; k < i; k++) {
                System.out.print("  "); 
            }

            for (j = i; j <= n; j++) 
            {
                System.out.print(j + " ");
            }

            System.out.println();
        }

        
    }

}
