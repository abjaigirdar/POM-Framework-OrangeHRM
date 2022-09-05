import org.testng.annotations.Test;

public class RecruitmentTest extends BaseTest{

    @Test
    public void test01() {
        startLoginPage()
                .loginToPIMPage()
                .navigateToRecruitmentPage()
                .selectJobTitleFromDropDown("QA Lead");
    }
    @Test
    public void test02() {
        startLoginPage()
                .loginToPIMPage()
                .navigateToRecruitmentPage()
                .selectJobTitleFromDropDown("QA Lead")
                .selectCheckBox("Joe Root");
    }
}
