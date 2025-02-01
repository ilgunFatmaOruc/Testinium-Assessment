package Sayfalar;

import org.openqa.selenium.WebDriver;

public class EditAccount extends Sayfa {
    public EditAccount(WebDriver driver) {
        super(driver);
    }

    public final String accountName = "//div[.='Account name']";

    public final String editButton ="//div[text()='Edit account']";

    public final String accountNameText = "[placeholder]";

    public final String updateButton = "//div[text()='UPDATE']";







}
