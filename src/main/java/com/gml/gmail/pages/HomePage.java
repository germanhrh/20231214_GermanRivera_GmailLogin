package com.gml.gmail.pages;

import com.gml.gmail.actions.Action;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;

public class HomePage extends PageObject {
    //String titulo = "//title[contains(text(), '%s')]";
    String titulo = "//a[contains(text(),'%s')]";
    By title2;



    public void validateTitle(String strTitle) {

        title2 = By.xpath(String.format(titulo, strTitle));
        Action.esperarElemento(getDriver(),title2);
        assertEquals("El valor esperado: " + strTitle + " , es diferente a: " + Action.getElementText(getDriver(), title2)
                , strTitle,	Action.getElementText(getDriver(), title2));
    }
}
