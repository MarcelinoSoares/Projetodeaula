package pages;

import manager.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {

    private WebDriver driver;
    private WebDriverWait wait;
    private String pageURL = "https://www.seleniumeasy.com/test";

    private By siteNameSeletor = By.cssSelector("#name-and-slogan .site-name");
    private By siteSloganSeletor = By.cssSelector("#name-and-slogan .name-slogan");

    public MainPage(WebDriver driver){
        this.driver = driver;
        this.wait = DriverManager.getDriverWait();
    }

    public MainPage accessPage(){
        driver.get(pageURL);
        return this;
    }

    public String getSiteName(){
        return driver.findElement(this.siteNameSeletor).getText();
    }

    public String getSiteSlogan(){
        return driver.findElement(this.siteSloganSeletor).getText();
    }

    public void enviarTextoParaSearchInput(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(this.siteSloganSeletor));
        driver.findElement(this.siteSloganSeletor).sendKeys("adfdfdfff");
    }
}
