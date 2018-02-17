/*
 * Extra credit assignment
 */

package randomsort;
import java.io.*;
import java.util.*;


public class RandomSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Generating 100 random numbers  (from 0 to 99):
        int [] randomInt = new int[100];
        System.out.print(" Random Numbers: ");
        Random randomGenerator = new Random();
        for (int i = 0; i < 100; i++){
            randomInt[i] =  randomGenerator.nextInt(100); 
            System.out.print(randomInt[i] + " ");
           
        }
        
        // writing random numbers to file
        try {
          File file = new File("test.txt");
          PrintWriter output = new PrintWriter(new FileWriter(file));
          
          for (int i = 0; i < 100; i ++){
              output.write(String.valueOf(randomInt[i]) + " ");            
          }        
          output.close();
          
        } catch (IOException e) {           
            System.err.println("Problem writing to the file. " + e.getMessage());
        }

        
        System.out.println(" ");
      
        int [] myIntegers = new int[100]; 
        int i = 0;
        try {
          Scanner fileScanner = new Scanner(new File("test.txt"));
          while (fileScanner.hasNextInt()){
            myIntegers[i] = fileScanner.nextInt();
            i++;
          }
         }catch (FileNotFoundException e){
                 System.out.println("Error while reading file :" 
                + e.getMessage()); 
        }
        
       // Sorting the array: 
       // Arrays.sort(myIntegers);  // can be done like that.
        mySort(myIntegers); // this is my own method
        System.out.print(" Sorted Numbers: ");
        for (int j=0; j < myIntegers.length; j++){
         System.out.print( myIntegers[j] + " ");
        }  
        
        
        // writing random numbers to file
        try {
          File file = new File("test_new.txt");
          PrintWriter output = new PrintWriter(new FileWriter(file));
          
          for (int k = 0; k < 100; k ++){
              output.write(String.valueOf(myIntegers[k]) + " ");            
          }        
          output.close();
          
        } catch (IOException e) {           
            System.err.println("Problem writing to the file. " + e.getMessage());
        } 

    }
    // Method to sort the array
    public static void mySort(int[] array) {
    
    
    for (int j = 0; j < array.length ; j++) {
        int a = array[j];
        int i = j - 1;
        while( i >=0 && array[i] > a){
            array[i+1] =  array[i];
            i = i - 1;            
        }
        array[i+1] = a;
    }
 }
}
