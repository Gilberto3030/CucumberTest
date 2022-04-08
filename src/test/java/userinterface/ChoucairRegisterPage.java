package userinterface;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


public class ChoucairRegisterPage  extends PageObject{

    public static final Target JOIN_BUTTON =Target.the("Join Button today")
            .located(By.xpath("/html/body/ui-view/unauthenticated-container/div/div/unauthenticated-header/div/div[3]/ul[2]/li[2]/a"));

    public static final Target INPUT_USERNAME =Target.the("Where do we write the username")
            .located(By.id("firstName"));

    public static final Target INPUT_LASTNAME =Target.the("Where do we write the lastname")
            .located(By.id("lastName"));

    public static final Target INPUT_EMAIL =Target.the("Where do we write the password")
            .located(By.name("email"));

    public static final Target INPUT_SELECT_MONTH =Target.the("Where do we Select the month")
            .located(By.name("birthMonth"));

    public static final Target SELECT_MONTH =Target.the("Selected month")
            .located(By.xpath("//*[@id=\"birthMonth\"]/option[6]"));


    public static final Target INPUT_SELECT_DAY =Target.the("Where do we Select the day")
            .located(By.id("birthDay"));

    public static final Target SELECT_DAY =Target.the("Selected day")
            .located(By.xpath("//*[@id=\"birthDay\"]/option[11]"));

    public static final Target INPUT_SELECT_YEAR =Target.the("Where do we Select the year")
            .located(By.id("birthYear"));

    public static final Target SELECT_YEAR=Target.the("Selected year")
            .located(By.xpath("//*[@id=\"birthYear\"]/option[37]"));

    public static final Target BUTTON_CONTINUE=Target.the("Btn Continue")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[2]/a"));



    public static final Target INPUT_ZIP=Target.the("Where do we write the city")
            .located(By.id("zip"));



    public static final Target BUTTON_NEXT=Target.the("select country")
            .located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/div/a"));

    public static final Target SELECT_MOBIL1=Target.the("select mobil")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/div[1]/span"));


    public static final Target SELECT_MOBIL=Target.the("select mobil")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[1]/div[2]/div/ul/li/div[15]/span/div"));

    public static final Target SELECT_MODEL1=Target.the("select model")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/div[1]/span"));

    public static final Target SELECT_MODEL=Target.the("select model")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[2]/div[2]/div/ul/li/div[11]/span/div"));

    public static final Target SELECT_O_SYSTEM1=Target.the("select o. system")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/div[1]/span"));


    public static final Target SELECT_O_SYSTEM=Target.the("select o. system")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[1]/div[3]/div[2]/div[3]/div[2]/div/ul/li/div[3]/span/div"));


    public static final Target BUTTON_NEXT2=Target.the("next 2")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div[2]/div/a"));


    public static final Target INPUT_PASS=Target.the("Where do we write the pass")
            .located(By.id("password"));

    public static final Target INPUT_PASS_CONFIRM=Target.the("Where do we write the confirmpass")
            .located(By.id("confirmPassword"));

    public static final Target CHECKBOX_1=Target.the("check 1")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));

    public static final Target CHECKBOX_2=Target.the("check 1")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));

    public static final Target BUTTON_COMPLETE_SETUP=Target.the("complete setup")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div/div/a"));


}
