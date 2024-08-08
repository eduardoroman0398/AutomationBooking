package userInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import util.config;

public class formUI extends config {

    public WebElement lblnombre = driver.findElement(By.xpath("//*[@id=\"firstname\"]"));

    public WebElement lblapellido = driver.findElement(By.xpath("//*[@id=\"lastname\"]"));

    public WebElement lblemail = driver.findElement(By.xpath("//*[@id=\"email\"]"));

    public WebElement lbltelefono = driver.findElement(By.xpath("//*[@id=\"phone\"]"));


}
