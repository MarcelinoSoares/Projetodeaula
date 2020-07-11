import manager.DriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.LeftNavMenu;
import pages.MainPage;
import pages.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class main {

    //   public static void main(String[] args){

    WebDriver driver = DriverManager.getDriver();
    WebDriverWait wait = DriverManager.getDriverWait();

    @Test
    public void atividade20() throws InterruptedException{
        System.out.println("*** atividade 20 ***");
        driver.get("https://www.seleniumeasy.com/test/input-form-demo.html");
        WebElement contractform = driver.findElement(By.cssSelector("#contact_form"));
        WebElement firstname = contractform.findElement(By.cssSelector(".form-group input"));
        WebElement lastname = contractform.findElement(By.cssSelector(".form-group:nth-of-type(2) input"));
        WebElement email = contractform.findElement(By.cssSelector(".form-group:nth-of-type(3) input"));
        WebElement phone = contractform.findElement(By.cssSelector(".form-group:nth-of-type(4) input"));
        WebElement address = contractform.findElement(By.cssSelector(".form-group:nth-of-type(5) input"));
        WebElement city = contractform.findElement(By.cssSelector(".form-group:nth-of-type(6) input"));
        contractform.findElement(By.name("state")).sendKeys("Alaska");
        contractform.findElement(By.name("zip")).sendKeys("67890");
        contractform.findElement(By.name("website")).sendKeys("teste");
        WebElement hostingyes = contractform.findElement(By.cssSelector(".form-group:nth-of-type(10) .radio input"));
        contractform.findElement(By.name("comment")).sendKeys("comment");
        WebElement sendBtn = contractform.findElement(By.cssSelector(".form-group:last-child button"));

        firstname.sendKeys("Marcelino");
        lastname.sendKeys("Soares");
        email.sendKeys("test@test.com");
        phone.sendKeys("12345678");
        address.sendKeys("rua 123");
        city.sendKeys("recife");
        hostingyes.click();
        Thread.sleep(2000);
        sendBtn.click();
        Thread.sleep(2000);
        DriverManager.endSession();
    }

    @Test
    public void atividade21(){
        System.out.println("*** atividade 21 ***");
        driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
        WebElement ContractForm = driver.findElement(By.cssSelector("#task-table tbody tr:nth-child(4)"));
        System.out.println(ContractForm.getText());
        DriverManager.endSession();
    }

    @Test
    public void atividade22(){
        System.out.println("*** atividade 22 ***");
        driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
        WebElement thirdColumnHead = driver.findElement(By.cssSelector("#task-table thead th:nth-child(3)"));
        List<WebElement> thirdColumnBody = driver.findElements(By.cssSelector("#task-table tbody tr td:nth-child(3)"));
        System.out.println("HEADER 3: " + thirdColumnHead.getText());
        for (WebElement columnData : thirdColumnBody){
            System.out.println(columnData.getText());
        }
        DriverManager.endSession();
    }

    @Test
    public void atividade23() throws InterruptedException{
        System.out.println("*** atividade 23 ***");
        driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
        WebElement filterBtn = driver.findElement(By.cssSelector(".filterable .panel-heading button"));
        WebElement filters = driver.findElement(By.cssSelector(".filterable table .filters"));
        WebElement usernamefilter = filters.findElement(By.cssSelector("th:nth-child(2) input"));
        WebElement lastnamefilter = filters.findElement(By.cssSelector("th:nth-child(4) input"));

        filterBtn.click();
        usernamefilter.sendKeys("jaco");
        lastnamefilter.sendKeys("k");
        Thread.sleep(1000);

        WebElement firstrow = driver.findElement(By.cssSelector(".filterable tbody tr:not([style='display: none;'])"));
        System.out.println(firstrow.getText());
        Thread.sleep(2000);
        DriverManager.endSession();
    }

    @Test
    public void atividade24() throws InterruptedException{
    System.out.println("*** atividade 24 ***");
    driver.get("https://www.cesar.school/");
    WebElement docbody = driver.findElement(By.tagName("body"));
    WebElement toolbar = driver.findElement(By.className("toolbar-container"));
    List<WebElement> toolbarLinksElements = toolbar.findElements(By.cssSelector(".pull-left a"));
    for(WebElement linkElement: toolbarLinksElements){
        System.out.println("link for " + linkElement.getText().replace("|", "") + ":");
        System.out.println(linkElement.getAttribute("href"));
    }
    docbody.sendKeys(Keys.CONTROL,Keys.END);
    System.out.println("is the toolbar is displayed" +toolbar.isDisplayed());
    System.out.println("is the first link enabled" +toolbarLinksElements.get(0).isEnabled());

    Thread.sleep(2000);
    DriverManager.endSession();
    }

    @Test
    public void atividade25(){
      System.out.println("*** atividade25 ***");
      driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      driver.get("http://automationpractice.com/index.php");
    try {
        driver.findElement(By.cssSelector(".doesnotexist"));
    }catch (Exception e){
        System.out.println("EXCEPTION:" +e.getClass());
    }

    DriverManager.endSession();
    }

    @Test
    public void atividade26(){
        System.out.println("*** atividade 26 ***");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com/index.php");
        try {
            driver.findElement(By.cssSelector("#block_top_menu .submenu-container"));
        }catch (Exception e){
            System.out.println("EXCEPTION:" +e.getClass());
        }

        DriverManager.endSession();
    }

    @Test
    public void atividade27(){
        System.out.println("*** atividade 27 ***");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
        driver.get("http://automationpractice.com/index.php");
        try {
            driver.findElement(By.cssSelector("#block_top_menu .menu-content"));
        }catch (Exception e){
            System.out.println("EXCEPTION:" +e.getClass());
        }

        DriverManager.endSession();
    }

    @Test
    public void atividade28(){
        System.out.println("*** atividade 28 ***");
        driver.get("http://automationpractice.com/index.php");
        By elementNotVisibleSeletor = By.cssSelector("#block_top_menu .submenu-container");
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.visibilityOfElementLocated(elementNotVisibleSeletor));
        driver.findElement(elementNotVisibleSeletor);

        DriverManager.endSession();
    }

    @Test
    public void atividade29(){
        System.out.println("*** atividade 29 ***");
        driver.get("https://www.seleniumeasy.com/test/ajax-form-submit-demo.html");
        WebElement nameInput = driver.findElement(By.id("title"));
        WebElement commentInput = driver.findElement(By.id("description"));
        WebElement submitBtn = driver.findElement(By.id("btn-submit"));
        By tempImgSeletor = By.cssSelector("#submit-control img");
        By sucessMessage = By.cssSelector("#submit-control");


        nameInput.sendKeys("qualquer coisa");
        commentInput.sendKeys("qualquer coisa");
        submitBtn.click();

        wait.until(ExpectedConditions.stalenessOf(driver.findElement(tempImgSeletor)));
        System.out.println("SUCESS MSG:" +driver.findElement(sucessMessage).getText());
        DriverManager.endSession();
    }

    @Test
    public void atividade30(){
        System.out.println("*** atividade 30 ***");
        driver.get("https://www.seleniumeasy.com/test");
        WebElement botaoTableMenu = driver.findElement(By.cssSelector("#navbar-brand-centered .nav > li:nth-child(3)"));
        WebElement botaoTableSortSearch = botaoTableMenu.findElement(By.cssSelector(".dropdown-menu  li:nth-child(4)"));
        By seletorSearchInput = By.cssSelector("#example-filter input");
        By seletorLinhasTabela  = By.cssSelector("#example tbody tr");
        By seletorMensagemShowing = By.cssSelector("#example_info");


        botaoTableMenu.click();
        botaoTableSortSearch.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(seletorSearchInput));
        driver.findElement(seletorSearchInput).sendKeys("london");
        wait.until(ExpectedConditions.textToBePresentInElementLocated(seletorMensagemShowing,"filtered"));

        int quantidadelinhasatual = driver.findElements(seletorLinhasTabela).size();
        int quantidadelinhaesperada = 7;

        Assert.assertEquals(
                "a quatidade de linhas da tabela nao é igual a esperada",
                quantidadelinhaesperada,
                quantidadelinhasatual);

        DriverManager.endSession();
    }

    @Test
    public void atividade31(){
        System.out.println("*** atividade 31 ***");
        driver.get("http://automationpractice.com/index.php");

        DriverManager.endSession();
    }

    @Test
    public void atividade32(){
        System.out.println("*** atividade 32 ***");
        MainPage mainPage = new MainPage(driver);
        LeftNavMenu leftNavMenu = new LeftNavMenu(driver);
        String expectedTableTitle = "Table Sort And Search Demo";

        mainPage.accessPage();
        driver.get("https://www.seleniumeasy.com/test");
        driver.get(URL.MAIN_PAGE);

        String currentTableTitle = leftNavMenu.goToTableSortSearchPage().getTableTitle();
        Assert.assertEquals(expectedTableTitle,currentTableTitle);
        DriverManager.endSession();
    }
}
//}
// driver.get("https://www.seleniumeasy.com/test/table-search-filter-demo.html");
//        driver.manage().window().maximize();
//        System.out.println("What is the URL? " + driver.getCurrentUrl());
