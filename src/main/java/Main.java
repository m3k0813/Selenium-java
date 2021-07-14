import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Main {

    private static ChromeDriver driver;

    public static void main(String[] args) throws InterruptedException {
        init();
        DaumLogin();
    }

    static public void init() {
        System.setProperty("webdriver.chrome.driver", "../selenium-java-3.141.59/chromedriver.exe");
        driver = new ChromeDriver();
    }

    static public void DaumLogin() throws InterruptedException {
        driver.get("https://logins.daum.net/accounts/signinform.do?url=https%3A%2F%2Fmail.daum.net%2F");

        driver.findElement(By.id("id")).sendKeys("");
        driver.findElement(By.id("inputPwd")).sendKeys("");
        driver.findElement(By.className("btn_comm")).click();
        Thread.sleep(3000);

        List<WebElement> titles;
        titles = driver.findElements(By.cssSelector("#mailList a.link_subject"));
//        titles = driver.findElementsByCssSelector("div#mailList a.link_subject");
        System.out.println(titles.size());
        if (!titles.isEmpty()) {
            for (WebElement title : titles) {
                System.out.println(title.getText());
            }
        }
    }
}
