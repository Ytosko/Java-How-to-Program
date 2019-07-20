// Example. 4.7: GradeBookTest

package chapter_04;

/**
 *
 * @author Ytosko
 */
public class GradeBookTest {
    public static void main( String[] args ) {
        GradeBook myGradeBook = new GradeBook(
                "CSE 297 Object Oriented Programming" );
        myGradeBook.displayMessage();
        myGradeBook.determineClassAverage();
    }
}
