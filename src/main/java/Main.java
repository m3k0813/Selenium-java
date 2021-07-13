import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "../selenium-java-3.141.59/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://logins.daum.net/accounts/signinform.do?url=https%3A%2F%2Fmail.daum.net%2F");
        Thread.sleep(1000);

        driver.findElement(By.id("id")).sendKeys("id");
        driver.findElement(By.id("inputPwd")).sendKeys("pwd");
        driver.findElement(By.className("btn_comm")).click();
    }
}