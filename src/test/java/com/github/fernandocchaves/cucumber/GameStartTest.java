package com.github.fernandocchaves.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertTrue;

public class GameStartTest {
	private Game game;

	@Given("^começo um novo jogo$")
	public void começo_um_novo_jogo() throws Throwable {
		this.game = new Game();
	}

	@When("^vejo a seguinte mensagem na tela$")
	public void vejo_a_seguinte_mensagem_na_tela(String message) throws Throwable {
		String response = game.start();
		assertTrue(message.equals(response));
	}

	@Then("^inicio uma nova partida$")
	public void inicio_uma_nova_partida(String message) throws Throwable {
		String response = game.initialize();
		assertTrue(message.equals(response));
	}

}
