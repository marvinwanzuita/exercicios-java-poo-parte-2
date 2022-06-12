package _07_Orientacao_Objetos;

import java.util.Locale;
import java.util.Scanner;

public class _07_Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    _07_Student student = new _07_Student();

    System.out.println();
    System.out.print("Enter student name: ");
    student.name = sc.nextLine();

    System.out.print("Enter the grade of the first test: ");
    student.grade1 = sc.nextDouble();

    System.out.print("Enter the grade of the second test: ");
    student.grade2 = sc.nextDouble();

    System.out.print("Enter the grade of the third test: ");
    student.grade3 = sc.nextDouble();

    System.out.println();
    System.out.println("FINAL GRADE = " + String.format("%.2f",student.finalGrade()));
    System.out.println(student.messageApproved());

  }
}
