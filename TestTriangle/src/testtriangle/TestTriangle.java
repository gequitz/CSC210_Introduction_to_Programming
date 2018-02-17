/*
 Testing triangle types
 */

package testtriangle;
import java.util.Scanner;

/**
 *
 * @author Gabriel Equitz
 */
public class TestTriangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        Scanner sc = new Scanner(System.in);  
        while (true){
          System.out.print("Read a new triangle? (-1 for no, 1 for yes) :");
          if (sc.nextInt() < 0) break;
          
          System.out.println("Enter the length of side A :"); 
          int a = sc.nextInt();
          System.out.println("Enter the length of side B :");
          int b = sc.nextInt();
          System.out.println("Enter the length of side C :");
          int c = sc.nextInt();  
          Triangle t1 = new Triangle(a, b, c);  //creating object
          System.out.println("Valid Triangle       :" + t1.isValid());
          System.out.println("Right Triangle       :" + t1.isRight());
          System.out.println("Scalene Triangle     :" + t1.isScalene());
          System.out.println("Isosceles Triangle   :" + t1.isIsosceles());
          System.out.println("Equilateral Triangle :" + t1.isEquilateral());
          
        }
    }
    
}
