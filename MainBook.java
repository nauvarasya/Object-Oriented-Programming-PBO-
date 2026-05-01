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
public class MainBook {
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Author Rin = new Author("Peter Lee", "peter@nowhere.com", 'm');
        System.out.println(Rin);

        Book dummyBook = new Book("Algoritma dan Pemograman", Rin, 98000, 99);
        System.out.println(dummyBook);

        dummyBook.setPrice(120000);
        dummyBook.setQty(88);
        System.out.println("Name is:" + dummyBook.getName());
        System.out.println("Price is:" + dummyBook.getPrice());
        System.out.println("Qty is:" + dummyBook.getQty());
        System.out.println("Author is:" + dummyBook.getAuthor());
        System.out.println("Author's name is:" + dummyBook.getAuthor().getName());
        System.out.println("Author's email is:" + dummyBook.getAuthor().getEmail());
        System.out.println("Author's gender is:" + dummyBook.getAuthor().getGender());

        Book moreDummyBook = new Book("Java for more dummies", new Author("Peter Lee", "peter@nowhere.com", 'm'), 19.9, 8);
        System.out.println(moreDummyBook);
    }
}
