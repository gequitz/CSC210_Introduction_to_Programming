/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package reverse;
import java.util.Scanner;


public class Reverse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    String s;
    System.out.print("Please enter a sentence : ");
    s=input.nextLine();
    
    
    System.out.println(Reverse(s));
        
    }
    private static String Reverse(String str){
        char charArray[] ;
        charArray = str.toCharArray();
        for (int i = 0; i< str.length(); i++){
            if (charArray[i] == ' '){
              //  System.out.println(str.substring(i+1)+ " " + str.substring(0,i));
               
                return Reverse(str.substring(i+1))+ str.substring(0, i)+ " ";
            }
        }
        return str + " "; 
        
    }
    
}
    
  
    
    

