package Tests;
import Sayfalar.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;

public class AssessmentTests {
    WebDriver driver;
    Login login;
    OpenMoneyTransfer openMoneyTransfer;
    CreateanAccount createanAccount;
    CreateAccount createAccount;
    TransferMoney transferMoney;
    EditAccount editAccount;
    AddMoney addMoney;


    @BeforeEach
    void setup(){
        driver = new ChromeDriver();
        login = new Login(driver);
        openMoneyTransfer = new OpenMoneyTransfer(driver);
        createanAccount = new CreateanAccount(driver);
        createAccount = new CreateAccount(driver);
        transferMoney = new TransferMoney(driver);
        editAccount = new EditAccount(driver);
        addMoney = new AddMoney(driver);
        driver.get("https://catchylabs-webclient.testinium.com/signIn");
        driver.manage().window().maximize();
    }

    @Test
    public void setAccount() throws InterruptedException {


        login.waitLoadingElementCss(login.userName);
        login.infoInputCss(login.userName,"ilgunfatma.oruc");

        login.waitLoadingElementCss(login.password);
        login.infoInputCss(login.password,"Paratos102*");
        login.waitLoadingElementXpath(login.loginButton);
        login.butonClick(login.loginButton);

        Reporter.log("Login için username ve password elemanlarının açılan sayfada yüklenmeleri beklendi ve ilgili input alanlarına değerleri girilerek sisteme login olundu. ");


        openMoneyTransfer.waitLoadingElementXpath(openMoneyTransfer.openMoneyButton);
        openMoneyTransfer.butonClick(openMoneyTransfer.openMoneyButton);


        createanAccount.waitLoadingElementXpath(createanAccount.createanAccountButton);
        createanAccount.butonClick(createanAccount.createanAccountButton);


        createAccount.waitLoadingElementXpath(createAccount.accountName);
        createAccount.accountNameInput(createAccount.accountName,"Birinci Hesap");


        Thread.sleep(5000);
        createAccount.waitLoadingElementXpath(createAccount.createButton);
        createAccount.butonClick(createAccount.createButton);
}

    @Test
    public void moneyTransfer() throws InterruptedException {
        login.waitLoadingElementCss(login.userName);
        login.infoInputCss(login.userName,"ilgunfatma.oruc");
        login.waitLoadingElementCss(login.password);
        login.infoInputCss(login.password,"Paratos102*");
        login.waitLoadingElementXpath(login.loginButton);
        login.butonClick(login.loginButton);


        openMoneyTransfer.waitLoadingElementXpath(openMoneyTransfer.openMoneyButton);
        openMoneyTransfer.butonClick(openMoneyTransfer.openMoneyButton);

        createanAccount.waitLoadingElementXpath(createanAccount.createanAccountButton);
        createanAccount.butonClick(createanAccount.createanAccountButton);

        createAccount.waitLoadingElementXpath(createAccount.accountName);
        createAccount.accountNameInput(createAccount.accountName,"Birinci Hesap");


        Thread.sleep(5000);
        createAccount.waitLoadingElementXpath(createAccount.createButton);
        createAccount.butonClick(createAccount.createButton);

        Thread.sleep(5000);
        editAccount.waitLoadingElementXpath(editAccount.accountName);

        Thread.sleep(5000);
        transferMoney.waitLoadingElementXpath(transferMoney.transferButton);
        transferMoney.butonClick(transferMoney.transferButton);

        Thread.sleep(5000);
        transferMoney.waitLoadingElementCss(transferMoney.amount);
        transferMoney.infoInputCss(transferMoney.amount,"50");

        Thread.sleep(5000);
        transferMoney.waitLoadingElementXpath(transferMoney.sendButton);
        transferMoney.butonClick(transferMoney.sendButton);

    }

    @Test
    public void addMoneybyCreditCard() throws InterruptedException {


        login.waitLoadingElementCss(login.userName);
        login.infoInputCss(login.userName,"ilgunfatma.oruc");
        login.waitLoadingElementCss(login.password);
        login.infoInputCss(login.password,"Paratos102*");
        login.waitLoadingElementXpath(login.loginButton);
        login.butonClick(login.loginButton);


        openMoneyTransfer.waitLoadingElementXpath(openMoneyTransfer.openMoneyButton);
        openMoneyTransfer.butonClick(openMoneyTransfer.openMoneyButton);

        createanAccount.waitLoadingElementXpath(createanAccount.createanAccountButton);
        createanAccount.butonClick(createanAccount.createanAccountButton);


        createAccount.waitLoadingElementXpath(createAccount.accountName);
        createAccount.accountNameInput(createAccount.accountName,"Birinci Hesap");


        Thread.sleep(5000);
        createAccount.waitLoadingElementXpath(createAccount.createButton);
        createAccount.butonClick(createAccount.createButton);

        Thread.sleep(5000);
        addMoney.waitLoadingElementXpath(addMoney.moneyButton);
        addMoney.butonClick(addMoney.moneyButton);

        Thread.sleep(5000);
        addMoney.waitLoadingElementXpath(addMoney.cardAmount);
        addMoney.infoInputXpath(addMoney.cardAmount, "50");

        Thread.sleep(2000);
        addMoney.waitLoadingElementXpath(addMoney.cvv);
        addMoney.infoInputXpath(addMoney.cvv, "110");


        Thread.sleep(5000);
        addMoney.waitLoadingElementCss(addMoney.expiryDate);
        addMoney.infoInputCss(addMoney.expiryDate, "1026");

        Thread.sleep(5000);
        addMoney.waitLoadingElementXpath(addMoney.cardHolder);
        addMoney.infoInputXpath(addMoney.cardHolder, "İlgün Oruç");

        Thread.sleep(5000);
        addMoney.waitLoadingElementXpath(addMoney.cardNumber);
        addMoney.infoInputXpath(addMoney.cardNumber, "1234123412341234");


        Thread.sleep(5000);
        addMoney.waitLoadingElementXpath(addMoney.addButton);
        addMoney.butonClick(addMoney.addButton);


        Thread.sleep(5000);


    }

    @Test
    public void editAccountName() throws InterruptedException {


        login.waitLoadingElementCss(login.userName);
        login.infoInputCss(login.userName,"ilgunfatma.oruc");
        login.waitLoadingElementCss(login.password);
        login.infoInputCss(login.password,"Paratos102*");
        login.waitLoadingElementXpath(login.loginButton);
        login.butonClick(login.loginButton);


        openMoneyTransfer.waitLoadingElementXpath(openMoneyTransfer.openMoneyButton);
        openMoneyTransfer.butonClick(openMoneyTransfer.openMoneyButton);

        createanAccount.waitLoadingElementXpath(createanAccount.createanAccountButton);
        createanAccount.butonClick(createanAccount.createanAccountButton);


        createAccount.waitLoadingElementXpath(createAccount.accountName);
        createAccount.accountNameInput(createAccount.accountName,"Birinci Hesap");


        Thread.sleep(5000);
        createAccount.waitLoadingElementXpath(createAccount.createButton);
        createAccount.butonClick(createAccount.createButton);

        Thread.sleep(5000);
        editAccount.waitLoadingElementXpath(editAccount.editButton);
        editAccount.butonClick(editAccount.editButton);

        Thread.sleep(5000);
        editAccount.waitLoadingElementCss(editAccount.accountNameText);
        editAccount.deleteTextInput(editAccount.accountNameText);
        editAccount.infoInputCss(editAccount.accountNameText,"yeni");


        editAccount.waitLoadingElementXpath(editAccount.updateButton);
        editAccount.butonClick(editAccount.updateButton);
        Thread.sleep(5000);




    }



    @AfterEach
    public void closeDriver(){
        driver.close();
    }



}
