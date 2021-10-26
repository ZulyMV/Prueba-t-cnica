package co.com.choucair.certification.pruebatecnica.questions;

import co.com.choucair.certification.pruebatecnica.userinterface.UtestLastStepPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class AnswerPrueba implements Question<Boolean> {
    private String strquestion;

    public AnswerPrueba(String strquestion) {
        this.strquestion = strquestion;
    }

    public static AnswerPrueba toThe(String strquestion) {
        return new AnswerPrueba(strquestion);
    }

    @Override
    public Boolean answeredBy(Actor actor) {

        String AnswerPrueba = Text.of(UtestLastStepPage.SUCCESSFULLY_SIGNUP).viewedBy(actor).asString();
        return (strquestion.equals(AnswerPrueba))? true : false;
    }

    @Override
    public String getSubject() {
        return Question.super.getSubject();
    }
}
