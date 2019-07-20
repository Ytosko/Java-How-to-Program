 // Example. 8.10: Book
 
package chapter_08;

/**
 *
 * @author Ytosko
 */
public enum Book {
    
    JHTP( "Java How To Programm", "2012" ),
    CHTP( "C How To programm", "2007"),
    JCR( "Java Compleate Reference ", "2006");
    private final String title;
    private final String copyRightYear;
    
    
    Book(String bookTitle, String year) {
        title = bookTitle;
        copyRightYear = year;
    }
    
    public String getTitle() {
        return title;
    }
    public String getCopyRightYear() {
        return copyRightYear;
    }
    
}
