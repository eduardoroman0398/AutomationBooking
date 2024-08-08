package stepDefinitions;

import io.cucumber.java.en.And;
import taks.occupationTask;

public class occupationSD {

    @And("Seleccionamos la ocupacion con {}, {}, {}, {}")
    public void Seleccionamos_la_ocupacion_con(int adultos, int ninos, int edad_nino, int habitaciones) throws InterruptedException {
        occupationTask task = new occupationTask();
        task.ingresamos_ocupantes(adultos, ninos, edad_nino, habitaciones);
    }
}
