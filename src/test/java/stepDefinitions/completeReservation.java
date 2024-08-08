package stepDefinitions;

import io.cucumber.java.en.And;
import taks.completeReservationTask;

public class completeReservation {
    @And("Click en dar el ultimo Paso y completar la reserva")
    public void completamos_los_ultimos_pasos(){
        completeReservationTask task = new completeReservationTask();
        task.dar_el_ultimo_paso();
        task.completar_la_reserva();
    }
}
