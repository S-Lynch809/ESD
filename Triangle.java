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
public class Triangle {
    
    private int side1, side2, side3;
    
    public Triangle (int s1, int s2, int s3){
        side1 = s1;
        side2 = s2;
        side3 = s3;
    }
    
    public boolean is_scalene(){
        if ((side1 != side2) && (side1 != side3) && (side2 != side3))
            return true;
        else
            return false;
    }
    
    public boolean is_isosceles(){
        if (((side1 == side2) && (side1 != side3)) || 
            ((side1 == side3) && (side1 != side2)) ||
            ((side2 == side3) && (side2 != side1)))
            return true;
        else
            return false;
    }
    
    public boolean is_equilateral() {
        if ((side1 == side2) && (side2 == side3))
            return true;
        else
            return false;
    }
}
