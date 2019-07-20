// Example. 8.8: Employee

package chapter_08;

/**
 *
 * @author Ytosko
 */
public class Employee {

    private String firstName;
    private String lastName;
    private Date birthDate;
    private Date hireDate;
    
    public Employee(String first, String last, Date dateOfBirth,
            Date dateOfHire) {
        firstName = first;
        lastName = last;
        birthDate = dateOfBirth;
        hireDate = dateOfHire;
        
    }
   
    
    public String toString() {
        return String.format("%s, %s Hired: %s Birthday: %s", 
                lastName, firstName, hireDate, birthDate);
    }
    
}
