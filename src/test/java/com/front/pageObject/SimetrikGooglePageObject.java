package com.front.pageObject;

import net.serenitybdd.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class SimetrikGooglePageObject extends PageObject {

    String txtBuscadorGoogle = "//div[@class='o3j99 ikrT4e om7nvf']//div[@class='A8SBwf']//div[@class='RNNXgb']//div[@class='a4bIc']//textarea[@class='gLFyf']";
    String actionSearch ="//div[@class='o3j99 ikrT4e om7nvf']//form[@action='/search']//div[@class='a4bIc']//textarea[@class='gLFyf']";
    String lblresultadosBusqueda= "//div[@class='main']//div[@id='cnt']//div[@id='appbar']//div[@data-st-tgt='top']//div[@id='extabar']//div[@style='position:relative']//div[@id='slim_appbar']//div[@class='uCD6gd']//div[@class='LHJvCe']//div[contains(text(), 'Cerca de')]";
    public void escribeLaPalabraSimetric(String simetrik) {
        find(By.xpath(txtBuscadorGoogle)).sendKeys(simetrik);
        waitFor(2).seconds();
    }
    public void presionaEnter() {
        find(By.xpath(actionSearch)).sendKeys(Keys.ENTER);
        waitFor(1).seconds();
    }

    public void seMuestranLosResultadosDeSimetrikDiferenteCero() {
        String txtCantidadResultadosGoogle =find(By.xpath(lblresultadosBusqueda)).getText();
        String [] ValorNumero = txtCantidadResultadosGoogle.split(" ");
        String NumeroCapturado = ValorNumero[2];
        String QuitarCaracteres = NumeroCapturado.replace(".","");
        int ResultadoFinal = Integer.parseInt(QuitarCaracteres);
        Assert.assertNotEquals(0,ResultadoFinal);

    }
}
