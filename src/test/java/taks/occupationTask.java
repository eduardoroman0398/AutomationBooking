package taks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import util.config;

import java.sql.SQLOutput;

public class occupationTask extends config {

    public void ingresamos_ocupantes(int adultos, int ninos, int edad_nino, int habitaciones) throws InterruptedException {
        try {
            // Verificar si el botón para abrir el panel de ocupación está presente y visible
            WebElement ocupacionBoton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[data-testid='occupancy-config']")));
            ocupacionBoton.click();

            // Verificar si el panel de ocupación se abre correctamente
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='c3953d2910']")));
        } catch (Exception e) {
            System.out.println("No se pudo abrir el panel de ocupación: " + e.getMessage());
        }

        // Ajustar el numero de adultos
        ajustarAdultos(adultos);
        // Ajustar el numero de niños
        ajustarNinos(ninos);
        ajustarEdadNinos(edad_nino);
        // Ajustar el numero de habitaciones
        ajustarHabitaciones(habitaciones);

        // Cerrar el panel de ocupación
        WebElement botonListo = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\":ri:\"]/button")));
        botonListo.click();
    }

    public void ajustarAdultos(int adultos) {

        // Esperar y encontrar el input de adultos
        WebElement adultosInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\":ri:\"]/div/div[1]/div[2]/span")));
        int currentAdults = Integer.parseInt(adultosInput.getText());

        if (currentAdults == adultos) {
            System.out.println("El numero de ocupantes Adultos es: " + adultos);
            return;
        }

        while (currentAdults != adultos) {
            if (currentAdults < adultos) {
                WebElement botonIncrementar = driver.findElement(By.xpath("//*[@id=\":ri:\"]/div/div[1]/div[2]/button[2]"));
                botonIncrementar.click();
                currentAdults++;
                System.out.println("El numero de ocupantes Adultos es: " + adultos);
            } else {
                WebElement botonDisminuir = driver.findElement(By.xpath("//*[@id=\":ri:\"]/div/div[1]/div[2]/button[1]"));
                botonDisminuir.click();
                currentAdults--;
                System.out.println("El numero de ocupantes Adultos es: " + adultos);
            }
        }
    }

    public void ajustarNinos(int ninos) {
        WebElement ninosInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\":ri:\"]/div/div[2]/div[2]/span")));
        int currentChildren = Integer.parseInt(ninosInput.getText());

        while (currentChildren != ninos) {
            if (currentChildren < ninos) {
                WebElement botonIncrementar = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\":ri:\"]/div/div[2]/div[2]/button[2]")));
                botonIncrementar.click();
                currentChildren++;
                System.out.println("El numero de ocupantes Ninos es " + ninos);
            } else {
                WebElement botonDisminuir = driver.findElement(By.xpath("//*[@id=\":ri:\"]/div/div[2]/div[2]/button[1]"));
                botonDisminuir.click();
                currentChildren--;
                System.out.println("El numero de ocupantes Ninos es " + ninos);
            }
        }
    }

    public void ajustarEdadNinos(int edad_nino) throws InterruptedException {
        // Esperar a que el elemento select de edad esté presente y visible
        WebElement selectElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("select[name='age']")));

        // Crear un objeto Select para interactuar con el elemento select
        Select select = new Select(selectElement);
        Thread.sleep(1_000);

        // Seleccionar la opción correspondiente a la edad proporcionada
        select.selectByValue(String.valueOf(edad_nino));
        System.out.println("La edad del nino es: " + edad_nino);
    }

    public void ajustarHabitaciones(int habitaciones) {
        WebElement ocupacionBoton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("button[data-testid='occupancy-config']")));
        ocupacionBoton.click();
        WebElement habitacionesInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\":ri:\"]/div/div[5]/div[2]/span")));
        int currentRooms = Integer.parseInt(habitacionesInput.getText());

        if (currentRooms == habitaciones) {
            System.out.println("El numero de Habitaciones es: " + habitaciones);
            return;
        }

        while (currentRooms != habitaciones) {
            if (currentRooms < habitaciones) {
                WebElement botonIncrementar = driver.findElement(By.xpath("//*[@id=\":ri:\"]/div/div[5]/div[2]/button[2]"));
                botonIncrementar.click();
                currentRooms++;
                System.out.println("El numero de Habitaciones es: " + habitaciones);
            } else {
                WebElement botonDisminuir = driver.findElement(By.xpath("//*[@id=\":ri:\"]/div/div[5]/div[2]/button[1]"));
                botonDisminuir.click();
                currentRooms--;
                System.out.println("El numero de Habitaciones es: " + habitaciones);
            }
        }
    }
}
