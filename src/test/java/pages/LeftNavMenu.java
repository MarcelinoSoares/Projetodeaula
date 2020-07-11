package pages;

import manager.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LeftNavMenu {

    private WebDriver driver;
    private WebDriverWait wait;

    private By navMenuSeletor = By.cssSelector("#navbar-brand-centered");
    private By inputFormBtnSeletor = By.cssSelector(".nav > li:nth-child(1)");
    private By datePickerBtnSeletor = By.cssSelector(".nav > li:nth-child(2)");
    private By tableBtnSeletor = By.cssSelector(".nav > li:nth-child(3)");

    public LeftNavMenu(WebDriver driver){

        this.driver = driver;
        this.wait = DriverManager.getDriverWait();
    }

    public void clickOnInputFormButton() {
        findButtonFromNavMenu(inputFormBtnSeletor).click();
    }

    public void clickOnDatePickerButton() {
        findButtonFromNavMenu(datePickerBtnSeletor).click();
    }

    public void clickOnTableButton() {
        findButtonFromNavMenu(tableBtnSeletor).click();
    }

    public void clickOnFormButton(){
        WebElement navMenu = driver.findElement(navMenuSeletor);
        navMenu.findElement(inputFormBtnSeletor).click();
    }

    public TableSortSearchPage goToTableSortSearchPage(){
        this.clickOnTableButton();
        wait.until(ExpectedConditions.presenceOfElementLocated(tableSortSearchBtn));
        WebElement tableSubMenu = this.findButtonFromNavMenu(tableBtnSeletor).findElement(navSubMenu);
        tableSubMenu.findElement(tableSortSearchBtn).click();
        return new TableSortSearchPage(driver);
    }

    private WebElement findButtonFromNavMenu(By btnSeletor){
        WebElement navMenu = driver.findElement(navMenuSeletor);
        return navMenu.findElement(btnSeletor);
    }

}
