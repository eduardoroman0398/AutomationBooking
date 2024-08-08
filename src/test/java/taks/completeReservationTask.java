package taks;

import org.openqa.selenium.support.ui.ExpectedConditions;
import userInterface.completeReservationUI;
import util.config;

public class completeReservationTask extends config {
    completeReservationUI ui = new completeReservationUI();
    public void dar_el_ultimo_paso(){
        wait.until(ExpectedConditions.elementToBeClickable(ui.btn_dar_ultimo_paso));
        ui.btn_dar_ultimo_paso.click();
    }

    public void completar_la_reserva(){
        wait.until(ExpectedConditions.elementToBeClickable(ui.btn_completar_reserva));
        ui.btn_completar_reserva.click();
    }
}
