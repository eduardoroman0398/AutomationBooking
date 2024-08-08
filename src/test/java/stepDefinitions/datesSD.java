package stepDefinitions;

import io.cucumber.java.en.And;
import taks.datesTask;

public class datesSD {
    @And("Seleccionamos las fechas de {}, {}")
    public void seleccionamos_las_fechas(String fecha_entrada, String fecha_salida) throws InterruptedException {
        datesTask task = new datesTask();
        task.ingresamos_fechas(fecha_entrada, fecha_salida);
    }


}
