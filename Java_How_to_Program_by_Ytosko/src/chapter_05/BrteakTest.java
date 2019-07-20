// Example. 5.12: BreakTest

package chapter_05;

/**
 *
 * @author Ytosko
 */
public class BrteakTest {
    
    public static void main( String[] args ) {
        
           int count;
           
           for(count =1; count <= 10; count++) {
               if(count == 5) {
                   break;
               }
               System.out.println(count);
           }
           
           System.out.println("\nBroke out of loop at count = " +count);
    }
}
