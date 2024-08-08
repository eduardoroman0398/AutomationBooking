package userInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import util.config;

public class reserveUI extends config {
    public WebElement reserva_tu_apartamento = driver.findElement(By.xpath("//span[contains(text(), 'Reserva tu habitación en casa particular')]"));
    public WebElement reservar = driver.findElement(By.xpath("//*[@id=\"group_recommendation\"]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/a"));

    public WebElement reservare = driver.findElement(By.xpath("//*[@id=\"hprt-form\"]/div[5]/div[2]/div[2]/div[6]"));
}
