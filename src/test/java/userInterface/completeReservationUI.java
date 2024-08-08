package userInterface;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import util.config;

public class completeReservationUI extends config {

    public WebElement btn_dar_ultimo_paso = driver.findElement(By.xpath("//*[@id=\"bookForm\"]/div[5]/div/div[2]/button/span[1]"));
    public WebElement btn_completar_reserva = driver.findElement(By.xpath("//*[@id=\"bookForm\"]/div[4]/div/div[2]/button/span[2]"));
}
