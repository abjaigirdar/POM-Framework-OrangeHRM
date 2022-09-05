import org.testng.annotations.Test;

public class FirstTest extends BaseTest {

    @Test
    public void test1() {
        startLoginPage().loginToPIMPage();
    }


}
