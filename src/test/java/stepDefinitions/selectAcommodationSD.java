package stepDefinitions;

import io.cucumber.java.en.And;
import taks.selectAcommodationTask;

public class selectAcommodationSD {
    @And("Seleccionamos el alojamiento {}")
    public void buscamos_alojamiento(String alojamiento) throws InterruptedException {
        selectAcommodationTask task = new selectAcommodationTask();
        task.seleccionamos_alojamiento(alojamiento);
    }
}
