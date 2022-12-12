import hooks.commun;
import org.testng.annotations.Test;
import pages.PageLogin;

public class test1 extends commun {
    @Test
    public void MonTest(){
        PageLogin test01 = new PageLogin(driver);
        test01.saisirLogin("standard_user");
        test01.saisirMDP("abc123");
        test01.cliquerBouton();


         }

}
