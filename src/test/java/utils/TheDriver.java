package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TheDriver {

    private WebDriver driver;

    public TheDriver(){
        String driverPath = "C:\\Users\\juandavid.camacho\\Documents\\Curso TAE\\Test Automation\\Proyecto_Final\\proyectoFinal_CamachoG\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", driverPath);
        driver = new ChromeDriver();
    }

    public WebDriver getDriver() {
        return driver;
    }
}
