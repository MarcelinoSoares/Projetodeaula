package stepDefinitions;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.Entao;

public class StepDefinitions {

    @Dado("Estou na página de login")
    public void acessarAPáginaDeLogin() {
    }

    @Dado("Eu não preencho Nome")
    public void nãoPreencherOCampoNome() {
    }

    @Dado("Eu preencho E-mail com {string}")
    public void preencherOCampoEMailCom(String string) {
    }

    @Dado("Eu preencho Senha com {string}")
    public void preencherOCampoSenhaCom(String string) {
    }

    @Dado("Eu preencho Idade com {string}")
    public void preencherOCampoIdadeCom(String string) {
    }

    @Quando("Eu pressiono Cadastrar")
    public void clicarNoBotaoCadastrar() {
    }

    @Entao("Eu recebo a mensagem de erro {string}")
    public void receberAMensagemDeErro(String string) {
    }

    @Dado("Eu preencho Nome com {string}")
    public void preencherOCampoNomeCom(String string) {
    }

    @Dado("Eu não preencho E-mail")
    public void nãoPreencherOCampoEMail() {
    }

    @Dado("Eu não preencho Senha")
    public void nãoPreencherOCampoSenha() {
    }
}
