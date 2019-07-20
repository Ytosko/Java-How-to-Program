// Example. 3.4: GradeBook
package chapter_03;


/**
 *
 * @author Ytosko
 */
public class GradeBook02 {
    
    private String courseName;
    
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
