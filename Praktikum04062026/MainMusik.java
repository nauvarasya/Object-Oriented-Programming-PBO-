/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum04062026;

/**
 *
 * @author nauva
 */
public class MainMusik {
    public static void main(String[] args){
        Gitar gitar = new Gitar(6,"Gitar Klasik","Petik");
        Keyboard keyboard = new Keyboard(true,"Yamaha PSR", "Elektronik");
        
        System.out.println("\n------INFO Keyboard-------");
        keyboard.info();
        keyboard.nyalakan();
        keyboard.mainkan();
        keyboard.stem();
        keyboard.matikan();
        
    }
}
