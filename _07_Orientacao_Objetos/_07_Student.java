package _07_Orientacao_Objetos;

public class _07_Student {

  public String name;
  public double grade1;
  public double grade2;
  public double grade3;

  public double finalGrade(){
    return (grade1 + grade2 + grade3) / 3;
  }

  public String messageApproved(){
    double finalGrade = finalGrade();
    if(finalGrade >= 6.0){
      return "PASS";
    } else {
      return "FAILED" + "\nMISSING " + (6.0 - finalGrade) + " POINTS.";
    }
  }

}
