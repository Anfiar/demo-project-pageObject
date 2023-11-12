package by.itacademy.kishkevich;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebSiteTest {

    @Test
    public void webSiteTest() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.onliner.by/");

        String inputEnterLocator = "//*[@id=\"userbar\"]/div[1]/div/div/div[1]";
        By inputEnterBy = By.xpath(inputEnterLocator);
        WebElement inputEnterWebElement = driver.findElement(inputEnterBy);
        inputEnterWebElement.click();

        String titleAuthFormLocator = "//*[@id=\"auth-container\"]/div/div[2]/div/div[1]";
        By titleAuthFormBy = By.xpath(titleAuthFormLocator);
        WebElement titleAuthFormWebElement = driver.findElement(titleAuthFormBy);
        String actualResult = titleAuthFormWebElement.getText();

        String expectedResult = "Вход";
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void webSiteTest2() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://devby.io/");
        driver.manage().window().maximize();

        String inputEnterLocator = "/html/body/div[2]/header/div[1]/div[3]/a";
        By inputEnterBy = By.xpath(inputEnterLocator);
        WebElement inputEnterWebElement = driver.findElement(inputEnterBy);
        inputEnterWebElement.click();

        String titleAuthFormLocator = "/html/body/div[1]/div/div/div/div/ul/a[1]";
        By titleAuthFormBy = By.xpath(titleAuthFormLocator);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement titleAuthFormWebElement = driver.findElement(titleAuthFormBy);
        String actualResult = titleAuthFormWebElement.getText();

        String expectedResult = "Вход";
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void webSiteTest3() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://javarush.com/");
        driver.manage().window().maximize();

        String inputEnterLocator = "//*[@id=\"button_menu_start_learning_unauthorized_user\"]";
        By inputEnterBy = By.xpath(inputEnterLocator);
        WebElement inputEnterWebElement = driver.findElement(inputEnterBy);
        inputEnterWebElement.click();

        String titleAuthFormLocator = "//*[@id=\"id_button_jr_welcome_start_learning_1\"]";
        By titleAuthFormBy = By.xpath(titleAuthFormLocator);
        WebElement titleAuthFormWebElement = driver.findElement(titleAuthFormBy);
        String actualResult = titleAuthFormWebElement.getText();

        String expectedResult = "НАЧАТЬ";
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void webSiteTest4() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.onliner.by/");

        String inputEnterLocator = "//*[@id=\"userbar\"]/div[1]/div/div/div[1]";
        By inputEnterBy = By.xpath(inputEnterLocator);
        WebElement inputEnterWebElement = driver.findElement(inputEnterBy);
        inputEnterWebElement.click();

        String buttonEnterLocator = "//*[@id=\"auth-container\"]/div/div[2]/div/form/div[3]/button";
        By buttonEnterBy = By.xpath(buttonEnterLocator);
        WebElement buttonEnterWebElement = driver.findElement(buttonEnterBy);
        buttonEnterWebElement.click();

        String errorMessageLogin = "//*[@id=\"auth-container\"]/div/div[2]/div/form/div[1]/div/div[2]/div/div/div[2]/div";
        String errorMessagePassword = "//*[@id=\"auth-container\"]/div/div[2]/div/form/div[2]/div/div/div[2]/div";

        By errorMessageLoginBy = By.xpath(errorMessageLogin);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement errorMessageLoginWebElement = driver.findElement(errorMessageLoginBy);
        String actualResultErrorMessageLogin = errorMessageLoginWebElement.getText();

        By errorMessagePasswordBy = By.xpath(errorMessagePassword);
        WebElement errorMessagePasswordWebElement = driver.findElement(errorMessagePasswordBy);
        String actualResultErrorMessagePassword = errorMessagePasswordWebElement.getText();

        String expectedResultErrorMessageLogin = "Укажите ник или e-mail";
        String expectedResultErrorMessagePassword = "Укажите пароль";
        Assertions.assertEquals(expectedResultErrorMessageLogin, actualResultErrorMessageLogin);
        Assertions.assertEquals(expectedResultErrorMessagePassword, actualResultErrorMessagePassword);
    }

    @Test
    public void webSiteTest5() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.onliner.by/");

        String inputEnterLocator = "//*[@id=\"userbar\"]/div[1]/div/div/div[1]";
        By inputEnterBy = By.xpath(inputEnterLocator);
        WebElement inputEnterWebElement = driver.findElement(inputEnterBy);
        inputEnterWebElement.click();

        String inputLogin = "//*[@id=\"auth-container\"]/div/div[2]/div/form/div[1]/div/div[2]/div/div/div[1]/div/input";
        By inputLoginBy = By.xpath(inputLogin);
        WebElement inputLoginWebElement = driver.findElement(inputLoginBy);
        inputLoginWebElement.sendKeys("Nick");

        String buttonEnterLocator = "//*[@id=\"auth-container\"]/div/div[2]/div/form/div[3]/button";
        By buttonEnterBy = By.xpath(buttonEnterLocator);
        WebElement buttonEnterWebElement = driver.findElement(buttonEnterBy);
        buttonEnterWebElement.click();

        String errorMessagePassword = "//*[@id=\"auth-container\"]/div/div[2]/div/form/div[2]/div/div/div[2]/div";

        By errorMessagePasswordBy = By.xpath(errorMessagePassword);
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement errorMessagePasswordWebElement = driver.findElement(errorMessagePasswordBy);
        String actualResultErrorMessagePassword = errorMessagePasswordWebElement.getText();
        String expectedResultErrorMessagePassword = "Укажите пароль";
        Assertions.assertEquals(expectedResultErrorMessagePassword, actualResultErrorMessagePassword);
    }

    @Test
    public void webSiteTest6() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.onliner.by/");

        String inputEnterLocator = "//*[@id=\"userbar\"]/div[1]/div/div/div[1]";
        WebElement inputEnter = driver.findElement(By.xpath(inputEnterLocator));
        inputEnter.click();

        String inputPasswordLocator = "//*[@id=\"auth-container\"]/div/div[2]/div/form/div[2]/div/div/div[1]/div/input";
        WebElement inputPassword = driver.findElement(By.xpath(inputPasswordLocator));
        inputPassword.sendKeys("12345678");

        String buttonEnterLocator = "//*[@id=\"auth-container\"]/div/div[2]/div/form/div[3]/button";
        WebElement buttonEnter = driver.findElement(By.xpath(buttonEnterLocator));
        buttonEnter.click();

        String errorMessageLogin = "//*[@id=\"auth-container\"]/div/div[2]/div/form/div[1]/div/div[2]/div/div/div[2]/div";
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement errorMessageLoginWebElement = driver.findElement(By.xpath(errorMessageLogin));

        Assertions.assertEquals("Укажите ник или e-mail", errorMessageLoginWebElement.getText());
    }

    @Test
    public void webSiteTest7() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://devby.io/");

        DevByPage devByPage = new DevByPage();

        WebElement inputEnter = driver.findElement(By.xpath(devByPage.inputEnterLocator));
        inputEnter.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement inputLogin = driver.findElement(By.xpath(devByPage.inputLoginLocator));
        inputLogin.sendKeys("Nick");

        WebElement inputPassword = driver.findElement(By.xpath(devByPage.inputPasswordLocator));
        inputPassword.sendKeys("12345678");

        WebElement buttonEnter = driver.findElement(By.xpath(devByPage.buttonEnterLocator));
        buttonEnter.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement errorMessageAuth = driver.findElement(By.xpath(devByPage.errorMessageAuthLocator));

        Assertions.assertEquals("Неверный логин или пароль.", errorMessageAuth.getText());
    }

    @Test
    public void webSiteTest8() {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://av.by/");

        AvByPage avByPage = new AvByPage();

        WebElement buttonEnter = driver.findElement(By.xpath(avByPage.buttonEnterLocator));
        buttonEnter.click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        WebElement buttonMail = driver.findElement(By.xpath(avByPage.buttonMailLocator));
        buttonMail.click();

        WebElement inputLogin = driver.findElement(By.xpath(avByPage.inputLoginLocator));
        inputLogin.sendKeys("Nick");

        WebElement inputPassword = driver.findElement(By.xpath(avByPage.inputPasswordLocator));
        inputPassword.sendKeys("12345678");

        WebElement buttonSubmit = driver.findElement(By.xpath(avByPage.buttonSubmitLocator));
        buttonSubmit.click();

        WebElement errorMessageAuth = driver.findElement(By.xpath(avByPage.errorMessageAuthLocator));

        Assertions.assertEquals("Неверный логин или пароль. Если забыли пароль, восстановите его", errorMessageAuth.getText());
    }
}
