package stepDefinitions;

import io.cucumber.java.en.And;
import taks.popupTask;

public class popupSD {

    @And("Cerramos el popup")
    public void cerramos_el_popup(){
        popupTask task = new popupTask();
        task.cerrar_ventana_emergente();
    }
}
