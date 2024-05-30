package org.example;

/**
 * Hello world!
 *
 */
public class Conta {
  private int numeroConta;
  private int saldo;

  public Conta(int numeroConta, int saldo) {
    this.numeroConta = numeroConta;
    this.saldo = saldo;
  }

  public int getNumeroConta() {
    return numeroConta;
  }

  public int getSaldo() {
    return saldo;
  }

}
