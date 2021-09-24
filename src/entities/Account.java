package entities;

import entities.exception.classException;

public class Account {

	private Integer number; // numero
	private String holder; // proprietário
	private Double balance; // saldo
	private Double withdrawlimt; // limite da conta

	public Account() {

	}

	public Account(Integer number, String holder, Double balance, Double withdrawlimt) {

		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawlimt = withdrawlimt;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}

	public Double getBalance() {
		return balance;
	}

	public Double getWithdrawlimt() {
		return withdrawlimt;
	}

	public void setWithdrawlimt(Double withdrawlimt) {
		this.withdrawlimt = withdrawlimt;
	}

	public void depositar(double depositar) {
		balance += depositar;
	}

	public void sacar(double sacar) {
		if (sacar > balance || sacar > withdrawlimt) {
			throw new classException("A quantia excede o limite de saque.");

		}
		if (sacar > balance) {
			throw new classException("Saldo insuficiente.");
		}
		balance -= sacar;
		
	}

	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Numero da conta: " + number);
		sb.append("\nNome do proprietario: " + holder);
		sb.append("\nValor da conta: " + balance);
		sb.append("\nLimite do saque: " + withdrawlimt);

		return sb.toString();
	}
}
