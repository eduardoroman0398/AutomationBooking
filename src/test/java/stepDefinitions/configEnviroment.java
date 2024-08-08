package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import taks.configEnviromentTask;

import java.util.Set;


public class configEnviroment  {

    @Before
    public void setUp()  {
        configEnviromentTask tst = new configEnviromentTask();
        tst.browser();
    }



    @After
    public void tearDown(){
        configEnviromentTask tst = new configEnviromentTask();
        tst.tear();
    }



    @Given("Ingresar la url de la pagina {}")
    public void Environment_Intelica(String ambiente) throws InterruptedException {
        configEnviromentTask test = new configEnviromentTask();
        test.Enviroment(ambiente);
    }



}
