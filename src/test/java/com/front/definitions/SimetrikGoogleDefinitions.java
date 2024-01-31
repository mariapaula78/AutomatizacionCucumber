package com.front.definitions;

import com.front.steps.SimetrikGoogleSteps;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SimetrikGoogleDefinitions {

    @Steps
    SimetrikGoogleSteps simetrikGoogleSteps;

    @Given("Un usuario desea realizar una busqueda en Google {string}")
    public void un_usuario_desea_realizar_una_busqueda_en_google(String UrlGoogle) {
        simetrikGoogleSteps.unUsuarioDeseaRealizarUnaBusquedaEnGoogle(UrlGoogle);
    }
    @When("Escribe la palabra Simetrik {string}")
    public void escribe_la_palabra_simetrik(String Simetrik) {
        simetrikGoogleSteps.escribeLaPalabraSimetric(Simetrik);
    }
    @When("Presiona Enter")
    public void presiona_enter() {
        simetrikGoogleSteps.presionaEnter();
    }
    @Then("Se muestran los resultados de Simetrik diferente a cero")
    public void se_muestran_los_resultados_de_simetrik_diferente_a_cero() {
        simetrikGoogleSteps.seMuestranLosResultadosDeSimetrikDiferenteCero();
       }
    }
