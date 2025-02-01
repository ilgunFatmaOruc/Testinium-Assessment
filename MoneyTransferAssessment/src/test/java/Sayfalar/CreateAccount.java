package Sayfalar;

import org.openqa.selenium.WebDriver;

public class CreateAccount extends Sayfa{

    public CreateAccount(WebDriver driver) {
        super(driver);
    }

    //public final String selectXpath =
            //".//*[@style='height: 48px; border-width: 1px; border-color: rgb(195, 195, 195); border-radius: 4px; justify-content: space-between; flex-direction: row; align-items: center; padding-left: 8px; padding-right: 8px;']";
    //public final String checkingAccount = ".//option[@value='CHECKING']";
    //public final String savingAccount = ".//option[@value='SAVING']";
    public final String accountName =
            ".//input[@class='css-11aywtz r-6taxm2 r-1eh6qqt r-z2wwpe r-rs99b7 r-h3s6tt r-1qhn6m8']";
    public final String createButton = ".//div[@class='css-146c3p1 r-jwli3a r-1b43r93']";
}
