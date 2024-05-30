package org.example;

import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class ExceptionsTeste {
  @Test
  void validarCeneraioDeExcecaoNaTransferencia() {
    // validar no cenario de erro

    Conta contaOrigem = new Conta(123456, 0);
    Conta contaDestino = new Conta(123654, 100);

    TransferenciaEntreContas transferenciaEntreContas = new TransferenciaEntreContas();

    // aqui vamos cair no cenario de erro feito la na nossa transferenciaEntreContas

    // podemos usar tb assertNotThorw (ele verifica se aquilo não lançará uma
    // exceção)
    assertThrows(IllegalArgumentException.class,
        () -> transferenciaEntreContas.transfere(contaOrigem, contaDestino, -1));
  }
}
