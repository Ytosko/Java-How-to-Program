// Example. 5.10: GradeBookTest

package chapter_05;

/**
 *
 * @author Ytosko
 */
public class GradeBookTest {

    public static void main ( String[] args ) {
        
        GradeBook myGradeBook = new GradeBook(
                "CSE 297 Object Oriented Programming");
        
        myGradeBook.displayMessage();
        myGradeBook.inputGrades();
        myGradeBook.displayGradeReport();
    }
}
