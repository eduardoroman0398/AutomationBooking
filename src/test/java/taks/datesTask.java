package taks;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import userInterface.datesUI;
import util.config;

import java.time.Duration;

public class datesTask extends config {

    public static void scrollDown(WebDriver driver) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 250);"); // Desplazar 250 píxeles hacia abajo
    }
    public void ingresamos_fechas(String fecha_entrada, String fecha_salida) throws InterruptedException {
        scrollDown(driver);

        // Seleccionar la fecha de entrada
        seleccionarFecha(fecha_entrada);

        Thread.sleep(1_000);

        // Seleccionar la fecha de salida
        seleccionarFecha(fecha_salida);
    }

    public void seleccionarFecha(String fecha) {
        while (true) {
            try {
                // Intentar encontrar y hacer clic en la fecha deseada
                WebElement diaElemento = wait
                        .until(ExpectedConditions.elementToBeClickable(By.cssSelector("span[data-date='" + fecha + "']")));
                diaElemento.click();
                break; // Romper el bucle si la fecha se selecciona correctamente
            } catch (Exception e) {
                // Si no se encuentra la fecha, hacer clic en el botón "Mes siguiente"
                try {
                    WebElement botonMesSiguiente = wait
                            .until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[aria-label='Mes siguiente']")));
                    botonMesSiguiente.click();
                } catch (Exception ex) {
                    System.out.println("No se encontró el botón para el siguiente mes o la fecha no es seleccionable.");
                    break;
                }
            }
        }
    }
}
