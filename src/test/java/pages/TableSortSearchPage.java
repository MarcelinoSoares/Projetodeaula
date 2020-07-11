package pages;

import manager.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TableSortSearchPage {

    private WebDriver driver;
    private WebDriverWait wait;

    private By tableTitleSeletor = By.cssSelector(".text-left h2");

    public TableSortSearchPage(WebDriver driver){
        this.driver = driver;
        this.wait = DriverManager.getDriverWait();
    }

    public String getTableTitle(){
        return driver.findElement(tableTitleSeletor).getText();
    }
}
