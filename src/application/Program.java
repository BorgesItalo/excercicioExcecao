package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import entities.Account;
import entities.exception.classException;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Numero conta: ");
			int conta = sc.nextInt();

			System.out.print("Proprietário: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Saldo: ");
			double balance = sc.nextDouble();
			System.out.print("Limite de saque: ");
			double limit = sc.nextDouble();
			Account ac = new Account(conta, name, balance, limit);
			System.out.println("Voce deseja fazer algum saque ou deposito? [s/n]");
			char perg = sc.next().charAt(0);

			if (perg == 's') {
				System.out.println("Digite 1 - saque ou 2 - deposito");
				int opc = sc.nextInt();
				switch (opc) {
				case 1: {
					System.out.println("Digite o valor do saque");
					double sacar = sc.nextDouble();
					ac.sacar(sacar);
					System.out.println(ac.toString());
					break;
				}
				case 2: {

					System.out.println("Digite o valor do saque");
					double deposito = sc.nextDouble();
					ac.depositar(deposito);
					System.out.println(ac.toString());
					break;
				}
				default:
				}

			}
		} catch (classException e) {
			System.out.println("Unexpected value: " + e.getMessage());

		} catch (InputMismatchException e) {
			System.out.println("Unexpected value: Tipo da variavel incompativo");

		}

	}
}
