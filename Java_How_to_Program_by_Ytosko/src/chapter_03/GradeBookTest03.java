// Example. 3.8: GradeBookTest
package chapter_03;


/**
 *
 * @author Ytosko
 */
public class GradeBookTest03 {
    
    public static void main( String[] args ) {
        
        GradeBook03 gradeBook1 = new GradeBook03(
                "CSE 297 Object Oriented Programming" );
        
        GradeBook03 gradeBook2 = new GradeBook03(
                "CSE 310 Numerical Analysis and Concreate Mathematics" );
        
        System.out.printf( "gradeBook1 Course Name Is: \n%s\n",
                gradeBook1.getCourseName());
        
        System.out.printf( "gradeBook2 Course Name Is: \n%s\n",
                gradeBook2.getCourseName());
        
    }
    
}
