// Example. 4.7: GradeBookTest

package chapter_04;

/**
 *
 * @author Ytosko
 */
public class GradeBookTest02 {
    
    public static void main( String[] args ) {
        GradeBook02 myGradeBook = new GradeBook02(
                "CSE 297 Object Oriented Programming" );
        myGradeBook.displayMessage();
        myGradeBook.determineClassAverage();
    }
}
