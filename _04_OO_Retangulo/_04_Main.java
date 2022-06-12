package _04_OO_Retangulo;

import java.util.Scanner;

public class _04_Main {

  public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);

    _04_Retangulo retangulo = new _04_Retangulo();

    System.out.println();
    System.out.println("Enter the height of the rectangle: ");
    retangulo.height = sc.nextDouble();

    System.out.println("Enter the width of the rectangle: ");
    retangulo.width = sc.nextDouble();

    System.out.println("-------------------------");
    System.out.println(retangulo);

  }
}
