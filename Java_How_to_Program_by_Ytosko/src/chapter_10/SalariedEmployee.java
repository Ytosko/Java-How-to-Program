 // Example. 10.5: SalariedEmployee
 
 package chapter_10;

/**
 *
 * @author Ytosko
 */
public class SalariedEmployee extends Employee{

    private double weeklySalary;
    //private double baseSalary;
    
    public SalariedEmployee(String first, String last, String ssn, double salary) {
        super(first, last, ssn);
        setWeeklySalary(salary);
    }
    
    public void setWeeklySalary (double salary) {
        if(salary >= 0.0) {
            weeklySalary = salary;
        }
        else
            throw new IllegalArgumentException(
                    "weekly salary must be >= 0 ");
    }
    
    
    private double getWeeklySalary () {
        return weeklySalary;
    }
    
    @Override
    public double earnings() {
       return getWeeklySalary();
    }

    
    
    @Override
    public String toString() {
        return String.format("salaried employee: %s\n%s: $ %.2f",super.toString(),
                "Weekly Salary", getWeeklySalary());
        
    }

    

}
