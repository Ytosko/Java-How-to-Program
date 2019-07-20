 // Example. 7.15: GradeBookTest
 
package chapter_07;

/**
 *
 * @author Ytosko
 */
public class GradeBookTest {

    public static void main(String[] args) {
        
        int[] gradesArray = { 87, 68, 94, 100, 83, 78, 85, 91, 76, 87 };
        
        GradeBook myGradeBook = new GradeBook(
                "CSE 297 Object Oriented Programming ", gradesArray);
        
        myGradeBook.displayMessage();
        myGradeBook.processGrades();
    }
}
