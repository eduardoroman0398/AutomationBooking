package taks;

import org.openqa.selenium.support.ui.ExpectedConditions;
import userInterface.formUI;
import util.config;

public class formTask extends config {
    formUI ui = new formUI();
    public void ingresarNombre(String nombre){
        wait.until(ExpectedConditions.elementToBeClickable(ui.lblnombre));
        ui.lblnombre.click();
        ui.lblnombre.sendKeys(nombre);
    }

    public void ingresarApellido(String apellido){
        wait.until(ExpectedConditions.elementToBeClickable(ui.lblapellido));
        ui.lblapellido.click();
        ui.lblapellido.sendKeys(apellido);
    }

    public void ingresarEmail(String email){
        wait.until(ExpectedConditions.elementToBeClickable(ui.lblemail));
        ui.lblemail.click();
        ui.lblemail.sendKeys(email);
    }

    public void ingresarTelefono(String telefono){
        wait.until(ExpectedConditions.elementToBeClickable(ui.lbltelefono));
        ui.lbltelefono.click();
        ui.lbltelefono.sendKeys(telefono);
    }
}
