/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum11062026;

/**
 *
 * @author nauva
 */
import java.util.Scanner;
import java.util.*;
public class CekArray {
     public static void main(String []args){
        Scanner input = new Scanner(System.in);
        int[] angka = {10,20,30,40,50};
        try{
        System.out.println("Mau ditampilakn array di indeks ke berapa =");
        int index = input.nextInt();
        System.out.println("Nilai Array adalah = "+angka[index]);
        System.out.println("Mau dibagi berapa ? ");
        int n = input.nextInt();
        int hasil = angka[index]/n;
        System.out.println("Hasil Pembagian = "+hasil );
        }
        catch(InputMismatchException e){
            System.out.println("Pastikan input berupa bilangan bulat!");
        }
        catch(ArithmeticException e){
            System.out.println("Angka Pembagian tidak boleh 0!");
        }
        catch(ArrayIndexOutOfBoundsException ex){
            System.out.println("Index diluar range array!");  
        }
        catch(Exception e){
            System.out.println("Error tidak terduga"+ e.getMessage());
                }    
        finally{
            System.out.println("----- Tampilkan  Array -----");
            // cara pertama
            for(int i=0; i<angka.length;i++)
        {
            System.out.print(""+angka[i]);
            System.out.println();
            //cara kedua
        }
            System.out.println("cara ke 2");
            System.out.println("Isi array = "+Arrays.toString(angka));
        }
         
        
    }
}
