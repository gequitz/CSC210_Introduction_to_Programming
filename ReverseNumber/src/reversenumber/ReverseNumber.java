/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reversenumber;
import java.util.Scanner;


public class ReverseNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n, reverse = 0;
 
      System.out.println("Enter the number to reverse");
      Scanner in = new Scanner(System.in);
      n = in.nextInt();
 
      while( n != 0 )
      {
          reverse = reverse * 10;
          reverse = reverse + n%10;
          n = n/10;
      }
 
      System.out.println("Reverse of entered number is "+reverse);
   }

    }
    

