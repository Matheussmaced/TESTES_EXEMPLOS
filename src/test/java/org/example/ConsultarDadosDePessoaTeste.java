package org.example;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ConsultarDadosDePessoaTeste {
  @BeforeAll // antes de tudo abrir conexão
  static void configuraConexao() {
    BancoDeDados.iniciarConexao();

  }

  @BeforeEach // toda vez que um teste executar, antes dele executar, ele irá fazer isso
  void insereDadosParaTeste() {
    BancoDeDados.insereDados(new Pessoa("João", "Jose"));
  }

  @AfterEach // toda vez que um teste executar, depois dele executar, ele irá fazer isso
  void removeDadosParaTeste() {
    BancoDeDados.removeDados(new Pessoa("João", "Jose"));
  }

  @Test
  void validarDadosDeRetorno() {
    assertTrue(true);
  }

  @AfterAll // depois de tudo fechar conexão
  static void finalizarConexao() {
    BancoDeDados.finalizarConexao();

  }
}
