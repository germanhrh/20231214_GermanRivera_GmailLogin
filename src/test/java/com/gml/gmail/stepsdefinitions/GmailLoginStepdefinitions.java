package com.gml.gmail.stepsdefinitions;

import com.gml.gmail.pages.HomePage;
import com.gml.gmail.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GmailLoginStepdefinitions {

    LoginPage loginPage;
    HomePage homePage;

    @Given("Deseo abrir la pagina de gmail {string}")
    public void deseoAbrirLaPaginaDeGmail(String url) {
        loginPage.navegateTo(url);

    }
    @When("ingreso nombre de usuario {string} y password {string}")
    public void ingresoNombreDeUsuarioYPassword(String usuario, String passw) {
        loginPage.login(usuario,passw);

    }

    @Then("Vaalido que el logueo sea valido para el usuario {string}")
    public void vaalidoQueElLogueoSeaValidoParaElUsuario(String usuario) {
        homePage.validateTitle(usuario);

    }
}
