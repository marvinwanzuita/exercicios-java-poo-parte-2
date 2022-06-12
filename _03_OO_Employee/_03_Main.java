package _03_OO_Employee;

import java.util.Locale;
import java.util.Scanner;

public class _03_Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    _03_Employee employee = new _03_Employee();

    System.out.println();
    System.out.print("Enter the employee's name: ");
    employee.name = sc.nextLine();

    System.out.print("Enter the employee's gross salary: ");
    employee.grossSalary = sc.nextDouble();

    System.out.print("Enter the tax amount: ");
    employee.tax = sc.nextDouble();

    System.out.println();
    System.out.println("Employee: " + employee.name + ", $ " +
            String.format("%.2f",employee.netSalary()));

    System.out.println();
    System.out.print("Which percentage to increase salary: ");
    employee.increaseSalary(sc.nextDouble());

    System.out.println();
    System.out.println("Updated data: " + employee.name + ", $ " +
            String.format("%.2f",employee.netSalary()));

  }
}