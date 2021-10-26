package co.com.choucair.certification.pruebatecnica.questions;

import co.com.choucair.certification.pruebatecnica.userinterface.UtestLastStepPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AnswerPrueba implements Question<Boolean> {
    private String strquestion;

    public String getStrquestion() {
        return strquestion;
    }

    public void setStrquestion(String strquestion) {
        this.strquestion = strquestion;
    }

        public AnswerPrueba(String strquestion) {
        this.strquestion = strquestion;
    }

    public static AnswerPrueba toThe(String question) {
        return new AnswerPrueba(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String Sucess;
        Target SUCCESSFULLY_SIGNUP=Target.the("").
                        located(By.xpath("//h1"));
        try {
            Sucess= Text.of(UtestLastStepPage.SUCCESSFULLY_SIGNUP).viewedBy(actor).asString();
        }catch (Exception excepcion){
            return true;
        }

        if(strquestion.equals(SUCCESSFULLY_SIGNUP)){
            result=false;
        }else{
            result=true;
        }
        return result;
    }

    @Override
    public String getSubject() {
        return Question.super.getSubject();
    }
}
