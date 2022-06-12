package _06_OO_CurrencyConverter;


import java.util.Scanner;

public class _06_Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println();
    System.out.print("What is the dollar price: ");
    _06_CurrencyConverter.dollarValue = sc.nextDouble();

    System.out.print("How many dollars will be bought: ");
    _06_CurrencyConverter.dollarAmount = sc.nextDouble();

    System.out.print("Amouth to be paid in reais = " +
            String.format("%.2f", _06_CurrencyConverter.convertValueReais()));


  }
}
