package stepDefinitions;

import io.cucumber.java.en.And;
import taks.destinationTask;

public class destinationSD {

    @And("Ingresamos el lugar de destino {}")
    public void ingresamos_el_lugar_de_destino(String destino) throws InterruptedException {
        destinationTask task = new destinationTask();
        task.seleccionar_destino(destino);
    }
}
