package util;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;
import java.util.Set;

public class config {

    public static WebDriver driver;
    public static JavascriptExecutor js;

    public static WebDriverWait wait;

    public config() {
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        js = (JavascriptExecutor) driver;
    }

    public void ventanaActiva() {
        Set<String> identificadores = driver.getWindowHandles();
        for (String identificador : identificadores) {
            driver.switchTo().window(identificador);
        }
    }

    public static String URL = "https://booking.com/";


}
