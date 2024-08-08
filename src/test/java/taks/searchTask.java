package taks;

import userInterface.searchUI;
import util.config;

public class searchTask extends config {
    public void realizamos_la_busqueda() throws InterruptedException {
        searchUI ui = new searchUI();
        ui.btn_buscar.click();
    }
}
