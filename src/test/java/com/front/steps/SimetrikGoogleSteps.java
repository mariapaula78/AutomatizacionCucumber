package com.front.steps;

import com.front.pageObject.SimetrikGooglePageObject;
import net.thucydides.core.annotations.Step;

public class SimetrikGoogleSteps extends SimetrikGooglePageObject {

    SimetrikGooglePageObject simetrikGooglePageObject;
    @Step
    public void unUsuarioDeseaRealizarUnaBusquedaEnGoogle(String urlGoogle) {
        simetrikGooglePageObject.openAt(urlGoogle);
    }
    @Step
    public void escribeLaPalabraSimetric(String simetrik) {
        simetrikGooglePageObject.escribeLaPalabraSimetric(simetrik);
    }
    @Step
    public void presionaEnter() {
        simetrikGooglePageObject.presionaEnter();
    }
    @Step
    public void seMuestranLosResultadosDeSimetrikDiferenteCero() {
        simetrikGooglePageObject.seMuestranLosResultadosDeSimetrikDiferenteCero();
    }
}
