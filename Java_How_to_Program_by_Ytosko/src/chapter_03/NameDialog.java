// Example. 3.18: NameDialog

package chapter_03;


/**
 *
 * @author Ytosko
 */

import javax.swing.JOptionPane;

public class NameDialog {
    
    public static void main( String[] args ) {
        String name = 
                JOptionPane.showInputDialog( "What is Your Name?" );
        String message =
                String.format( "Welcome, %s, to Java Programming!", name);
        
        JOptionPane.showMessageDialog(null, message);
    }
}
