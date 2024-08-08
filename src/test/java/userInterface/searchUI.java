package userInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import util.config;

public class searchUI extends config {
    public WebElement btn_buscar = driver.findElement(By.xpath("//*[@id=\"indexsearch\"]/div[2]/div/form/div[1]/div[4]"));
}
