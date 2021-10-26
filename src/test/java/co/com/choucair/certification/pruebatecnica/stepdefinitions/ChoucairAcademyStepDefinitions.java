package co.com.choucair.certification.pruebatecnica.stepdefinitions;

import co.com.choucair.certification.pruebatecnica.model.AcademyUtestData;
import co.com.choucair.certification.pruebatecnica.tasks.*;
import co.com.choucair.certification.pruebatecnica.questions.AnswerPrueba;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

public class ChoucairAcademyStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^than Zuly wants to sign up for Utest$")
    public void thanZulyWantsToSignUpForUtest(){
        OnStage.theActorCalled("Zuly").wasAbleTo(OpenUp.thePage());
    }

    @When("^she clicks on the join today option$")
    public void sheClicksOnTheJoinTodayOption(List<AcademyUtestData> academyUtestData){
        OnStage.theActorInTheSpotlight().wasAbleTo(
                (Join.onThePage(
                    academyUtestData.get(0).getStrfirstname(),
                    academyUtestData.get(0).getStrlastname(),
                    academyUtestData.get(0).getStremailadress(),
                    academyUtestData.get(0).getStrmonth(),
                    academyUtestData.get(0).getStrday(),
                    academyUtestData.get(0).getStryear(),
                    academyUtestData.get(0).getStrlanguageuser())),
            (Location.onThePage(
                    academyUtestData.get(0).getStrcity(),
                    academyUtestData.get(0).getStrzip(),
                    academyUtestData.get(0).getStrcountry())),
            (Devices.onThePage(
                    academyUtestData.get(0).getStrcomputer(),
                    academyUtestData.get(0).getStrversion(),
                    academyUtestData.get(0).getStrlanguage(),
                    academyUtestData.get(0).getStrmobile(),
                    academyUtestData.get(0).getStrmodel(),
                    academyUtestData.get(0).getStrsystem())),
            (LastStep.onThePage(
                    academyUtestData.get(0).getStrpasword())));
    }

    @Then("^she must fill out the form$")
    public void sheMustFillOutTheForm(List<String> strquestion) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(AnswerPrueba.toThe(strquestion.get(1))));
    }
}
