// Example. 3.7: GradeBook
package chapter_03;


/**
 *
 * @author Ytosko
 */

public class GradeBook03 {
    
    private String courseName;
    
    public GradeBook03( String name ) {
        courseName = name;
    }
    
    public void setCourseName( String name ) {
        
        courseName = name;
    }
    
    public String getCourseName() {
        return courseName;
    }
    
    public void displayMessage() {
        
        System.out.printf( "Welcome to the grade book for\n%s!\n", 
                getCourseName() );
        
    } 
    
}
