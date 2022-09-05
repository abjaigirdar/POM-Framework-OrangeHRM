import browser.Browser;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(value = TestListener.class)
public class PIMPageTest extends BaseTest {

    @Test
    public void test1() {
        startLoginPage()
                .loginToPIMPage()
                .searchEmployeeID("0083")
                .validateFirstAndLastName("Joe","Root");
    }
}
