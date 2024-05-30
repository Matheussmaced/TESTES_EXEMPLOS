package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.Test;

public class AssumptionsTestes {
  // só vai ser executado em determinada circunstância

  @Test
  void validarAlgoSomenteNoUsuarioMatheus() {
    assumeTrue("M".equals(System.getenv("USER"))); // se o usuario for Matheus, ele me retorna true (usuario da
    // maquina)
    assertEquals(10, 5 + 5); // se for true, irá executar o teste
  }
}
