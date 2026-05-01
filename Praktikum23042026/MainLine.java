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
public class MainLine {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
    Point Rin = new Point(2,4);
    System.out.println(Rin);
     
    Line dummyLine = new Line(1, 2, 3, 4);
    System.out.println(dummyLine);
    dummyLine.setBeginXY(5,6);
    dummyLine.setEndXY(7,8);
     
    System.out.println("Line is: " + dummyLine);
    System.out.println("Begin Point: " + dummyLine.getBegin());
    System.out.println("End Point: " + dummyLine.getEnd());
    System.out.println("Begin X: " + dummyLine.getBegin().getX());
    System.out.println("Begin Y: " + dummyLine.getBegin().getY());
    System.out.println("End X: " + dummyLine.getEnd().getX());
    System.out.println("End Y: " + dummyLine.getEnd().getY());
    System.out.println("Length: " + dummyLine.getLength());
     

    }
}
