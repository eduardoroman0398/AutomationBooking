package taks;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import userInterface.popupUI;
import util.config;

public class popupTask extends config {

    public void cerrar_ventana_emergente() {
        try {
            popupUI ui = new popupUI();
            wait.until(ExpectedConditions.elementToBeClickable(ui.popup));
            ui.popup.click();
        } catch (NoSuchElementException e) {
            // Si el popup no está presente, simplemente continuar sin errores
            System.out.println("No se encontró la ventana emergente, continuando con el siguiente paso.");
        }
    }
}