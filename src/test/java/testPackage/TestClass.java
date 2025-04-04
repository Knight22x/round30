package testPackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestClass {
    @Test
    public void test() {
        WebDriver driver = new FirefoxDriver();
    }

}
