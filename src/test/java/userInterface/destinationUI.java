package userInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import util.config;

public class destinationUI extends config {

    public WebElement lugar = driver.findElement(By.id(":rh:"));
}
