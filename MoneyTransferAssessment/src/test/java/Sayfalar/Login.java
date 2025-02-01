package Sayfalar;

import org.openqa.selenium.WebDriver;

public class Login extends Sayfa{

    public Login(WebDriver driver) {
        super(driver);
    }

    public final String userName = "[placeholder='Username']";
    public final String password = "[placeholder='Password']";
    public final String loginButton = ".//div[@class='css-146c3p1 r-jwli3a r-1b43r93']";


}
