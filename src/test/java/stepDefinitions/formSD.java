package stepDefinitions;

import io.cucumber.java.en.And;
import taks.formTask;

public class formSD {
    @And("Rellenamos el formulario con {}, {}, {}, {}")
    public void rellenamos_formulario(String nombre, String apellido, String email, String telefono){
        formTask task = new formTask();
        task.ingresarNombre(nombre);
        task.ingresarApellido(apellido);
        task.ingresarEmail(email);
        task.ingresarTelefono(telefono);
    }

}
