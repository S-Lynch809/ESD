/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package triangles;
import java.util.Scanner;

/**
 *
 * @author slync
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the length of side 1: ");
        int side1 = input.nextInt();
        System.out.print("Enter the length of side 2: ");
        int side2 = input.nextInt();
        System.out.print("Enter the length of side 3: ");
        int side3 = input.nextInt();
        
        Triangle triangle = new Triangle (side1, side2, side3);
        
        if (triangle.is_scalene() == true)
            System.out.println("The triangle is a scalene triangle.");
        if (triangle.is_isosceles() == true)
            System.out.println("The triangle is an isosceles triangle.");
        if (triangle.is_equilateral() == true)
            System.out.println("The triangle is an equilateral triangle.");
    }
    
}
