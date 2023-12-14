package com.gml.gmail.pages;

import com.gml.gmail.actions.Action;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {
    By userName = By.name("identifier");
    By password = By.name("Passwd");
    By btnSiguiente = By.xpath("//*[contains(text(), 'Siguiente')]");

    public void navegateTo(String url) {
        Action.navegateToUrl(getDriver(), url);
    }

    public void login(String strUserName, String strPassword) {
        Action.sendData(getDriver(), userName, strUserName);
        Action.esperarElemento(getDriver(),btnSiguiente);
        Action.clickElement(getDriver(), btnSiguiente);
        Action.sendData(getDriver(), password, strPassword);
        Action.esperarElemento(getDriver(),btnSiguiente);
        Action.clickElement(getDriver(), btnSiguiente);

    }
}
