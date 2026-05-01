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
public class MainAuthor {
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args){
    //TODO code application logic here
    
    Author Rin = new Author ("Peter Lee", "peter@nowhere.com", 'm');
    System.out.println(Rin);
    
    Rin.setEmail("peter@nowhere.com");
    System.out.println(Rin);
    System.out.println("Name:"+Rin.getName());
    System.out.println("Gender:"+Rin.getGender());
    System.out.println("Gmail:"+Rin.getEmail());
            
    }

}
