package stepDefinitions;

import io.cucumber.java.en.And;
import taks.reserveTask;

public class reserveSD {
    @And("Reservamos el alojamiento")
    public void reservar_alojamiento() throws InterruptedException {
        reserveTask task = new reserveTask();
        task.reserva_tu_apartamento();
        task.reservare();
    }
}
