//Example. 4.15: Increment

package chapter_04;

/**
 *
 * @author Ytosko
 */
public class Increment {
    
    public static void main( String[] args ) {
        int c;
        
        c = 5;
        System.out.println( c );
        System.out.println( c++ );
        System.out.println( c );
        
        System.out.println();
        
        c = 5;
        System.out.println( c );
        System.out.println( ++c );
        System.out.println( c );
    }
}
