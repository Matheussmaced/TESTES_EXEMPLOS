package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledIfEnvironmentVariable;

public class CondicionaisTeste {
  // só vai ser executado em determinada circunstância

  @Test

  // se o usuario for Matheus, ele me retorna true (usuario da maquina)
  // ao contrario seria DisabledIfEnvironmentVariable
  @EnabledIfEnvironmentVariable(named = "USER", matches = "M")

  void validarAlgoSomenteNoUsuarioMatheus() {
    assertEquals(10, 5 + 5); // se for true, irá executar o teste
  }
}
