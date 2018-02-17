/*
 * Determine if a credit card number is valid using Hans Luhn algorithm.
 */

package creditcardvalidation;
import java.util.Scanner;


public class CreditCardValidation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // valid number (Visa): 4388576018410707
        // valid number (Discover) : 6011000593748746
        // invalid number: 4388576018402626
        // invalid number: 6011000593748745
        System.out.print("Please enter a credit card number: ");
        Scanner input=new Scanner(System.in);
        long numb;
       
        numb = input.nextLong();
        
        if (isValid(numb)){
          System.out.print("The CC number: " + numb + " is valid."); 
          if (prefixMatched(numb,4))
            System.out.println(" This is a Visa card.");
          else if (prefixMatched(numb,5))
            System.out.println(" This is a Master card.");          
          else if (prefixMatched(numb,6))              
            System.out.println(" This is a Discover card.");
          else if (prefixMatched(numb,37))
            System.out.println(" This is an American Express card.");
        }
        else {
          System.out.println("The CC number " + numb + " is invalid.");    
        } 
        
        
        
    } 
    // return true if the card number is valid
    public static boolean isValid(long number){
        // Sum the results methods sumOfEvenPlaces and sumOfOddPlaces
		
		int sumOfAllPlaces = sumOfEvenPlaces(number) + sumOfOddPlaces(number);

		// Check if sumOfAllPlaces is divisable by 10 and if the 
                // number of digits is between 13 and 13 and if it has
                // the rigth prefix. If yes, change valid from false to true
		boolean valid = false ;
		if (getSize(number) >= 13 && getSize(number) <= 16 && sumOfAllPlaces % 10 == 0 )
                     if (prefixMatched(number,4) || prefixMatched(number,5) || prefixMatched(number,37) || prefixMatched(number,6)) {
			valid = true;
		} 

		return valid;

    } 
    
    
    // return this number if it is a single digit
    //otherwise return the sum of two digits
    public static int getDigit(int number) {
        if (number <= 9) {  
            return number;  
         } else if (number > 9) 
             return (number % 10 + number / 10);           

         return number;  

    }
    // Double every second digit from right to left. If the doubling
    // of a digit results in a two-digit number, add up the two digits 
    // to get a single-digit number. 
    public static int sumOfEvenPlaces(long number) {

		// Get rid of first digit (because we will extract only even placed digits)
		long reminder = number / 10;
		int sumOfDigits = 0;

		// While reminder is not 0, extract digits
		while (reminder > 0) {
			// Extract a single digit and double it
			int doubledDigit = 2 * (int) (reminder % 10);
			
			// Compute sum of double digits (if doubled digit > 10, 
			// use sum of digits in this sum)
			sumOfDigits += getDigit(doubledDigit);
			
			// Advance two digits to go to the next even placed number.
			reminder = reminder / 100;
		}

		return sumOfDigits;
	}

    
    // return sum of odd place digits in number
    public static int sumOfOddPlaces(long number) {

		long reminder = number;
		int sumOfDigits = 0;

		// While reminder is not 0, extract digits
		while (reminder > 0) {
			// Extract a single digit
			sumOfDigits += (int) (reminder % 10);
			
			// Advance two digits to go to the next odd placed number.			
			reminder = reminder / 100;
		}

		return sumOfDigits;
	}

    
    
    // return true if the digits d is a prefix for number
    public static boolean prefixMatched(long number, int d){
        boolean isPrefix = false;
        if (d < 10 && getPrefix(number, 1) == d )         
            isPrefix = true;
        else
            if (getPrefix(number, 2) == d)
             isPrefix = true;
        return isPrefix;
    } 
  
    //return the number of digits in d
   public static int getSize(long d){
        int numSize = 0;
        while (d > 0){
           
            d/=10; //  d=d/10
            numSize++; //  numSize = num Size + 1
            
        }
        return numSize;
        
        
    } 
    //return the first k number of digits from number. If this
    //number of digits in number is less than k, return number.
    public static long getPrefix(long numb, int k){
        if (getSize(numb) < k){
            return numb;
        }
        else{
            int size = getSize(numb);
            for (int i = 0; i < (size - k); i++){
                numb /=10; //  numb=numb/10;
            }
        }
        return numb;
    } 
  
}
    

