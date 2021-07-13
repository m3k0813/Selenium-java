import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    private static ChromeDriver driver;

    public static void main(String[] args) throws InterruptedException {
        init();
        DaumLogin();
    }

    static public void init(){
        System.setProperty("webdriver.chrome.driver", "../selenium-java-3.141.59/chromedriver.exe");
        driver = new ChromeDriver();
    }

    static public void DaumLogin(){
        driver.get("https://logins.daum.net/accounts/signinform.do?url=https%3A%2F%2Fmail.daum.net%2F");

        driver.findElement(By.id("id")).sendKeys("");
        driver.findElement(By.id("inputPwd")).sendKeys("");
        driver.findElement(By.className("btn_comm")).click();
    }
}