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
        float side1 = input.nextFloat();
        System.out.print("Enter the length of side 2: ");
        float side2 = input.nextFloat();
        System.out.print("Enter the length of side 3: ");
        float side3 = input.nextFloat();
        
        Triangle triangle = new Triangle (side1, side2, side3);
        System.out.println("Is the Triangle scalene? " + triangle.is_scalene());
        System.out.println("Is the Triangle Isosceles? " + triangle.is_isosceles());
        System.out.println("Is the Triangle Equilateral? " + triangle.is_equilateral());
    }
    
}
