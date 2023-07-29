package robos;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class GaiaRobo {

    public void abrirChromeS(){
        System.out.println("Vou abrir o navegadorS!");
        WebDriverManager.chromedriver().setup();
        ChromeDriver edudriver = new ChromeDriver();

        edudriver.get("https://www.saucedemo.com/");
    }

    public void fazerLogin(){
        System.out.println("Vou fazer login!");
    }

    public void lancarNota(){
        System.out.println("Vou lancar nota!");
    }
}
