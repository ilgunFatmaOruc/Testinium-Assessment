package Sayfalar;

import org.openqa.selenium.WebDriver;

public class TransferMoney extends Sayfa{
    public TransferMoney(WebDriver driver) {
        super(driver);
    }

    public final String transferButton = "//div[@class='css-175oi2r r-1awozwy r-1fvujvx r-18u37iz r-tzz3ar r-1cmwbt1 r-1777fci r-tuq35u']/div[@class='css-175oi2r r-1i6wzkk r-lrvibr r-1loqt21 r-1otgn73 r-1awozwy r-169ebfh r-z2wwpe r-1777fci r-tsynxw r-16l9doz r-edyy15 r-iyfy8q']/div[.='Transfer money']";

    public final String amount = "[placeholder]";

    public final String sendButton =   "//div[text()='Send']";
            //"[.r-q0mhf2]";

    public final String outScreen = "//div[@class='css-146c3p1 r-lrvibr r-1loqt21']";


}
