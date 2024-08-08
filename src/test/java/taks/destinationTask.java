package taks;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import userInterface.destinationUI;
import util.config;

import static java.sql.DriverManager.getDriver;

public class destinationTask extends config {

    Actions actions = new Actions(driver);
    public void seleccionar_destino(String destino) throws InterruptedException {



        destinationUI ui = new destinationUI();
        wait.until(ExpectedConditions.elementToBeClickable(ui.lugar));
        ui.lugar.click();
        ui.lugar.sendKeys(destino);
        Thread.sleep(1_000);
        actions.sendKeys(Keys.DOWN).build().perform();
        actions.sendKeys(Keys.ENTER).build().perform();
    }

    private WebDriver getDriver() {
        return driver;
    }
}
