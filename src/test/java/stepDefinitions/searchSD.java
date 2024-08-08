package stepDefinitions;

import io.cucumber.java.en.And;
import taks.searchTask;

public class searchSD {
    @And("Clickeamos en el boton buscar")
    public void clickeamom_en_boton_buscar() throws InterruptedException {
        searchTask task = new searchTask();
        task.realizamos_la_busqueda();
    }
}
