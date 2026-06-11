/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum11062026;

/**
 *
 * @author nauva
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class CekAngka {
     public static void main(String[]args){
        // TODO code application logic here 
        Scanner input = new Scanner (System.in);
        int a,b;
        int hasil;
        try{
        System.out.print("Masukkan bilangan pertama : ");
        a = input.nextInt();
        System.out.print("Masukkan bilangan kedua : ");
        b = input.nextInt();
        hasil = a/b;
        System.out.println(a+"/"+b+" ="+hasil );
        //jika tidak tau penggunaan exception cukup bikin saja exception e + e message
        }
        catch(InputMismatchException e){
            System.out.println("Masukkan nilai berupa angka!");
        }
        catch(ArithmeticException e){
            System.out.println("nilai ke 2/penyebut tidak boleh 0!");
        }
        catch(Exception e){
            System.out.println("Error tidak terduga"+ e.getMessage());
                }    
        finally{
            System.out.println("Pengecekan nilai selesai");
        }
    }
}
