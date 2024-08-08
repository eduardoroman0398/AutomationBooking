package taks;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import userInterface.reserveUI;
import util.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

import static java.sql.DriverManager.getDriver;

public class reserveTask extends config {
    reserveUI ui = new reserveUI();


    public void reserva_tu_apartamento() throws InterruptedException {
        ventanaActiva();
        wait.until(ExpectedConditions.elementToBeClickable(ui.reserva_tu_apartamento));
        ui.reserva_tu_apartamento.click();
    }


    public void reservar(){


    }

    public void reservare(){
        WebElement selectElement = driver.findElement(By.id("hprt_nos_select_1258739501_398435345_3_0_0"));

        // Crea una instancia de la clase Select
        Select select = new Select(selectElement);

        // Selecciona la opción por valor
        select.selectByValue("1");

        wait.until(ExpectedConditions.visibilityOf(ui.reservare));
        ui.reservare.click();
    }
}
