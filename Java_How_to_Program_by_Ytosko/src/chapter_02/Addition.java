//Example. 2.7: Addition

package chapter_02;

/**
 *
 * @author Ytosko
 */
import java.util.Scanner;

public class Addition {
    
    public static void main( String[] args ) {
        
        Scanner input = new Scanner( System.in );
        
        int number1;
        int number2;
        int sum;
        
        System.out.println( "Enter First Integer: " );
        number1 = input.nextInt();
        
        System.out.println( "Enter Second Integer: " );
        number2 = input.nextInt();
        
        sum = number1 + number2;
        
        System.out.println( "Sum Is: " +sum);
        
    }
    
}
