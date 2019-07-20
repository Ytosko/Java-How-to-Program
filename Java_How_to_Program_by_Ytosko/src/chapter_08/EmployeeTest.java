// Example. 8.9: EmployeeTest

package chapter_08;

/**
 *
 * @author Ytosko
 */
public class EmployeeTest {
    
    public static void main(String[] args) {
        Date birth = new Date(01, 01, 1995);
        Date hire = new Date(9, 11, 2011);
        
        Employee employee = new Employee("The ", "Ytosko", birth, hire);
        System.out.println(employee);
    }
}
