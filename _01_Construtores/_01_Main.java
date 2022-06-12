package _01_Construtores;

import java.util.Locale;
import java.util.Scanner;

public class _01_Main {
  public static void main(String[] args) {

    System.out.println();
    System.out.println("Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta, o nome do\n" +
            "titular da conta, e o valor de depósito inicial que o titular depositou ao abrir a conta. Este valor de depósito\n" +
            "inicial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar no momento de abrir sua\n" +
            "conta, o depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero.\n" +
            "Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado. Já\n" +
            "o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, por\n" +
            "exemplo).\n" +
            "Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger\n" +
            "isso. O saldo só aumenta por meio de depósitos, e só diminui por meio de saques. Para cada saque\n" +
            "realizado, o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo não for\n" +
            "suficiente para realizar o saque e/ou pagar a taxa.\n" +
            "Você deve fazer um programa que realize o cadastro de uma conta, dando opção para que seja ou não\n" +
            "informado o valor de depósito inicial. Em seguida, realizar um depósito e depois um saque, sempre\n" +
            "mostrando os dados da conta após cada operação.");


    Scanner sc = new Scanner(System.in);

    System.out.println();
    System.out.print("Enter account number: ");
    int accountNumber = sc.nextInt();

    System.out.print("Enter account holder: ");
    sc.nextLine();
    String name = sc.nextLine();

    System.out.print("Is there a initial deposit: (y/n) ");
    char answer = sc.next().charAt(0);
    double deposit = 0;
    if (answer != 'n'){
      System.out.print("Enter initial deposit value: ");
      deposit = sc.nextDouble();
    }

    _01_Account account = new _01_Account(accountNumber, name, deposit);

    System.out.println();
    System.out.println("Account data: ");
    System.out.println(account);

    System.out.println();
    System.out.print("Enter a deposit value: ");
    account.depositAmount(sc.nextDouble());

    System.out.println("Updated account data:");
    System.out.println(account);

    System.out.println();
    System.out.print("Enter a withdraw value: ");
    account.withdrawAmount(sc.nextDouble());
    System.out.println("Updated account data:");
    System.out.println(account);


    sc.close();
  }
}
