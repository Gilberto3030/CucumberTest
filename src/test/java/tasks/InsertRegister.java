package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import org.openqa.selenium.remote.server.handler.FindElement;
import userinterface.ChoucairRegisterPage;
import userinterface.ChoucairWebPage;

public class InsertRegister implements Task {
    private ChoucairWebPage choucairWebPage;

    public static InsertRegister onThePage() {
        return Tasks.instrumented(InsertRegister.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(Click.on(ChoucairRegisterPage.JOIN_BUTTON),
                Enter.theValue("Gilberto").into(ChoucairRegisterPage.INPUT_USERNAME),
                Enter.theValue("Oses").into(ChoucairRegisterPage.INPUT_LASTNAME),
                Enter.theValue("osessprueba@gmail.com").into(ChoucairRegisterPage.INPUT_EMAIL),
                Click.on(ChoucairRegisterPage.INPUT_SELECT_MONTH),
                Click.on(ChoucairRegisterPage.SELECT_MONTH),
                Click.on(ChoucairRegisterPage.INPUT_SELECT_DAY),
                Click.on(ChoucairRegisterPage.SELECT_DAY),
                Click.on(ChoucairRegisterPage.INPUT_SELECT_YEAR),
                Click.on(ChoucairRegisterPage.SELECT_YEAR),
                Click.on(ChoucairRegisterPage.BUTTON_CONTINUE),


                Enter.theValue("22332333").into(ChoucairRegisterPage.INPUT_ZIP),
                Click.on(ChoucairRegisterPage.BUTTON_NEXT),


                Click.on(ChoucairRegisterPage.SELECT_MOBIL1),
                Click.on(ChoucairRegisterPage.SELECT_MOBIL),
                Click.on(ChoucairRegisterPage.SELECT_MODEL1),
                Click.on(ChoucairRegisterPage.SELECT_MODEL),
                Click.on(ChoucairRegisterPage.SELECT_O_SYSTEM1),
                Click.on(ChoucairRegisterPage.SELECT_O_SYSTEM),
                Click.on(ChoucairRegisterPage.BUTTON_NEXT2),

                Enter.theValue(" PruebaGilbertoChoucair1999").into(ChoucairRegisterPage.INPUT_PASS),
                Enter.theValue(" PruebaGilbertoChoucair1999").into(ChoucairRegisterPage.INPUT_PASS_CONFIRM),
                Click.on(ChoucairRegisterPage.CHECKBOX_1),
                Click.on(ChoucairRegisterPage.CHECKBOX_2),
                Click.on(ChoucairRegisterPage.BUTTON_COMPLETE_SETUP)
        ); }
}

