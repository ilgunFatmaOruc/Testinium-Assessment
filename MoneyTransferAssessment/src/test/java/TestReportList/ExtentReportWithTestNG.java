package TestReportList;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;


public class ExtentReportWithTestNG {

    ExtentSparkReporter spark;
    ExtentReports extent;
    WebDriver driver = null;


    @BeforeTest
    public void setUpTest() {

        spark = new ExtentSparkReporter("Extentreport.html");
        extent = new ExtentReports();
        extent.attachReporter(spark);

        System.setProperty("webdriver.chrome.driver", "C://Users//ilgun.oruc//Downloads//test//chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("localhost:3000");

    }

    @Test
    public void test1() throws Exception{

        ExtentTest test = extent.createTest("Assessment Test Report", "Projede hesap oluşturma, hesaba para transferi ve kredi kartından para yükleme fonksiyonları test edilmiştir.");

        driver.get("https://www.google.com");
// log(Status, details)
        test.log(Status.INFO, "This step shows usage of log(status, details)");

        // info(details)
        test.info("This step shows usage of info(details)");

        // log with snapshot
        test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("screenshot.png").build());

        // test with snapshot
        test.addScreenCaptureFromPath("screenshot.png");
    }

    @AfterTest
    public void tearDownTest(){
        driver.close();
        driver.quit();
        System.out.println("Test Completed Successfully");
        extent.getReport();
        extent.flush();}
}
