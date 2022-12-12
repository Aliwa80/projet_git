package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageLogin {


    public WebDriver driver;
        public PageLogin(WebDriver driver) {
            this.driver = driver;
        }


       public void saisirLogin(String log){
           WebElement champsLogin = driver.findElement(By.id("user-name"));
           champsLogin.sendKeys(log);
       }

        public void saisirMDP(String mdp) {
            WebElement champsMDP = driver.findElement(By.id("password"));
            champsMDP.sendKeys(mdp);
        }
        public void cliquerBouton() {
            WebElement btnLogin = driver.findElement(By.id("login-button"));
            btnLogin.click();
        }

      /*  public void afficherMessage() {
            WebElement affMess = driver.findElement(By.id("login-button"));
            affMess.getText();
        }*/
   }


