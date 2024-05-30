package org.example;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

// @TestMethodOrder(MethodOrderer.OrderAnnotation.class) // -> deve ser colocado @Order(sequencia que voce quer) em cada metodo testado 
// @TestMethodOrder(MethodOrderer.MethodName.class) // -> vai validar o nome do metodo(escolhendo em ordem alfabetica)
// @TestMethodOrder(MethodOrderer.Random.class) // -> executar os testes randomicamente
@TestMethodOrder(MethodOrderer.DisplayName.class) // oque vai valer é o nome do display name (ordem alfabetica)

public class EscolherOrdemTeste {

  // @Order(4)
  @DisplayName("A")
  @Test
  void validaFluxoA() {
    assertTrue(true);
  }

  // @Order(3)
  @DisplayName("B")
  @Test
  void validaFluxoB() {
    assertTrue(true);
  }

  // @Order(2)
  @DisplayName("C")
  @Test
  void validaFluxoC() {
    assertTrue(true);
  }

  // @Order(1)
  @DisplayName("D")
  @Test
  void validaFluxoD() {
    assertTrue(true);
  }
}
