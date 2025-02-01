package Sayfalar;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Sayfa {
    WebDriver driver;


    public Sayfa(WebDriver driver){
        this.driver = driver;
    }

    public void waitLoadingElementCss(String elementCss){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(elementCss)));
    }
    public void waitLoadingElementXpath(String elementXpath){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(elementXpath)));
    }


    public void infoInputCss (String loginCssSelector, String loginText){
        driver.findElement(By.cssSelector(loginCssSelector)).sendKeys(loginText);
    }


    public void infoInputXpath (String xpathText, String infoText){
        driver.findElement(By.xpath(xpathText)).sendKeys(infoText);
    }


    public void butonClick(String xpathButton){
        driver.findElement(By.xpath(xpathButton)).click();
    }

    public void butonClickCss(String cssButton){
        driver.findElement(By.cssSelector(cssButton)).click();
    }

    public void accountNameInput (String accountNameXpath, String accountNameText){
        driver.findElement(By.xpath(accountNameXpath)).sendKeys(accountNameText);
    }


    public void deleteTextInput (String elementCss){
        driver.findElement(By.cssSelector(elementCss)).clear();
    }

    /*
    public void selectAccount (String selectAccount, int x){
       Select se = new Select(driver.findElement(By.xpath(selectAccount)));
       se.selectByIndex(x);
    }*/




}
