import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class FileScannerTest {
    private FileScanner fileScanner;

    @Before
    public void setUp() {
        this.fileScanner = new FileScanner("input.txt");
    }

    @Test
    public void testNextLine() {
        boolean actual = "Hello, how are you!1234a5".equals(fileScanner.nextLine());
        assertTrue(actual);
    }

    @Test
    public void testNextInt() {
        boolean actual = "12345".equals(fileScanner.nextInt());
        assertTrue(actual);
    }

}
