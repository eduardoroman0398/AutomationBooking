package userInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import util.config;

public class datesUI extends config {

    public WebElement calendario = driver.findElement(By.cssSelector("button[data-testid='date-display-field-start']"));

}
