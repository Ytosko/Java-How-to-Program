// Example. 5.7: DoWhileTest

package chapter_05;

/**
 *
 * @author Ytosko
 */
public class DoWhileTest {

    public static void main(String[] args) {

        int counter = 1;

        do {
            System.out.printf("%d ", counter);
            ++counter;

        } while (counter <= 10);

        System.out.println();
    }
}
