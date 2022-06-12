package _03_OO_Employee;

public class _03_Employee {

  public String name;
  public double grossSalary;
  public double tax;

  public double netSalary(){
    return grossSalary - tax;
  };

  public void increaseSalary(double porcentage){
    grossSalary += (grossSalary * (porcentage / 100));
  }

  @Override
  public String toString() {
    return "Employee{" +
            "name='" + name + '\'' +
            ", GrossSalary=" + grossSalary +
            ", tax=" + tax +
            '}';
  }
}
