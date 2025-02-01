package Sayfalar;

import org.openqa.selenium.WebDriver;

public class AddMoney extends Sayfa{
    public AddMoney(WebDriver driver) {
        super(driver);
    }
    public final String moneyButton = "//div[@class='css-175oi2r r-1awozwy r-1fvujvx r-18u37iz r-tzz3ar r-1cmwbt1 r-1777fci r-tuq35u']/div[@class='css-175oi2r r-1i6wzkk r-lrvibr r-1loqt21 r-1otgn73 r-1awozwy r-169ebfh r-z2wwpe r-1777fci r-tsynxw r-16l9doz r-edyy15 r-iyfy8q']/div[.='Add money']";

    public final String cardNumber = "//div[@class='css-175oi2r r-150rngu r-eqz5dr r-16y2uox r-1wbh5a2 r-11yh6sk r-1rnoaur r-agouwx r-1pi2tsx r-13qz1uu']//div[2]//input[@class='css-11aywtz r-6taxm2 r-1eh6qqt r-z2wwpe r-rs99b7 r-h3s6tt r-1qhn6m8']";

    public final String cardHolder = "//div[@class='css-175oi2r r-150rngu r-eqz5dr r-16y2uox r-1wbh5a2 r-11yh6sk r-1rnoaur r-agouwx r-1pi2tsx r-13qz1uu']//div[4]/input[@class='css-11aywtz r-6taxm2 r-1eh6qqt r-z2wwpe r-rs99b7 r-h3s6tt r-1qhn6m8']";

    public final String expiryDate = "[placeholder='MM/YY']";

    public final String cvv ="(//div[@class='css-175oi2r r-150rngu r-eqz5dr r-16y2uox r-1wbh5a2 r-11yh6sk r-1rnoaur r-agouwx r-1pi2tsx r-13qz1uu']/div[@class='css-175oi2r']/div[@class='css-175oi2r']//input[@class='css-11aywtz r-6taxm2 r-1eh6qqt r-z2wwpe r-rs99b7 r-h3s6tt r-1qhn6m8'])[2]";

    public final String cardAmount = "//div[8]/input[@class='css-11aywtz r-6taxm2 r-1eh6qqt r-z2wwpe r-rs99b7 r-h3s6tt r-1qhn6m8']";

    public final String addButton = "//div[@class='css-175oi2r r-1i6wzkk r-lrvibr r-1loqt21 r-1otgn73 r-1awozwy r-169ebfh r-z2wwpe r-h3s6tt r-1777fci r-tsynxw r-13qz1uu']";


}
