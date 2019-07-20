// Example. 10.1: PolymorphismTest

package chapter_10;

import chapter_09.BasePlusCommissionEmployee;
import chapter_09.CommissionEmployee;

/**
 *
 * @author Ytosko
 */
public class PolymorphismTest {

    public static void main(String[] args) {
        CommissionEmployee commissionEmployee = new CommissionEmployee("Sue", "Jones", "222-22-2222", 10000, .06);
        
        BasePlusCommissionEmployee basePlusCommissionEmployee = 
                new BasePlusCommissionEmployee("Bob", "Lewis", "333-33-3333", 5000, 0.04, 300);
        
        System.out.println("Call CommissionEmployee's toString with superclass reference "+
                "to superclass object \n"+commissionEmployee.toString());
        
        System.out.println("Call BasePlusCommissionEmployee's toString with superclass reference "+
                "to superclass object \n"+basePlusCommissionEmployee.toString());
        
        BasePlusCommissionEmployee commissionEmployee2 = basePlusCommissionEmployee;
         
        System.out.println("Call BasePlusCommissionEmployee's toString with superclass reference "+
                "to superclass object \n"+commissionEmployee2.toString());
        
    }
}
