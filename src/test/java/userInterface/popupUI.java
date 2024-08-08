package userInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import util.config;

public class popupUI extends config {

    public WebElement popup = driver.findElement(By.xpath("//button[@aria-label=\"Ignorar información sobre el inicio de sesión.\"]"));
}
