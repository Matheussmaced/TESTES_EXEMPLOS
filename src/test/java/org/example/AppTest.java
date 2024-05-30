package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

// ou faz a importação com *

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {

  @Test
  void validarLancamentos() {
    int[] primeiroLancamento = { 10, 20, 30, 40, 50 };
    int[] segundoLancamento = { 10, 20, 30, 40, 50 };

    Assertions.assertArrayEquals(primeiroLancamento, segundoLancamento); // ver
    // se o segundo é igual ao primeiro

    // pode ser escrito sem o Assertions, só importando o depois do .
    assertNotEquals(primeiroLancamento, segundoLancamento); // ver se o segundo é diferente do primeiro
  }

  @Test
  void validarSeObjetoEstaNulo() {
    Pessoa pessoa = null;

    Assertions.assertNull(pessoa);

    pessoa = new Pessoa("Matheus", "Macedo");

    assertNotNull(pessoa);
  }

  @Test
  void validarNumerosDeTiposDiferentes() {
    double valor = 5.0;
    double outroValor = 5.0;

    assertEquals(valor, outroValor); // ver se o valor é igual ao outro valor
  }
}