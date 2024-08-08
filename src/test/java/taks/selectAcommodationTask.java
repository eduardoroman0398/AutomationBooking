package taks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import util.config;

public class selectAcommodationTask extends config {
    public void seleccionamos_alojamiento(String alojamiento) throws InterruptedException {
        // Construir el XPath dinámicamente usando el nombre del alojamiento
        String busqueda = String.format("//div[@data-testid='property-card']//h3/a/div[contains(text(), '%s')]", alojamiento);

        // Esperar a que el elemento esté presente y visible
        WebElement alojamientoElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(busqueda)));

        // Hacer clic en el elemento del alojamiento
        alojamientoElement.click();
        System.out.println("El nombre del alojamiento seleccionado es: " + alojamiento);
        Thread.sleep(10_000);
    }
}
