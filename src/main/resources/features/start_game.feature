Feature: Começar o jogo
  Para poder passar o tempo
  Como Jogar
  Quero poder começar um novo jogo

  Scenario: Começo de um novo jogo com sucesso
    Ao começar o jogo, é mostrada a mensagem inicial para o jogador

    Given começo um novo jogo
    When vejo a seguinte mensagem na tela
    """
    Bem vindo ao jogo da forca!
    """
    Then inicio uma nova partida
    """
    Partida iniciada!
    """