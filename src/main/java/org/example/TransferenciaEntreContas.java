package org.example;

public class TransferenciaEntreContas {
  public void transfere(Conta contaOrigem, Conta contaDestrino, int valor) {
    if (valor <= 0) {
      throw new IllegalArgumentException("valor deve ser maior que zero");
    }
  }
}
