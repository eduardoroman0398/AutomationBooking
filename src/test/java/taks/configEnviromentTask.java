package taks;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import util.config;

import java.util.Objects;
import java.util.Set;

public class configEnviromentTask extends config {


    public void browser()   {
        System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") + "/src/main/java/drivers/msedgedriver.exe");
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        driver = new EdgeDriver(edgeOptions);//edgeOptions
        driver.manage().window().maximize();
    }


    public void tear(){
        driver.quit();
    }

    public void Enviroment(String ambiente) throws InterruptedException {
        if(Objects.equals(ambiente, "URL")){
            driver.get(URL);
            System.out.println("Ambiente de Prueba: "+ ambiente);
            Thread.sleep(3_000);
        }
    }



}


