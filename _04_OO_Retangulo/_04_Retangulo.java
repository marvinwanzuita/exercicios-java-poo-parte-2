package _04_OO_Retangulo;

public class _04_Retangulo {

  public double width;
  public double height;

  public double area(){
    return width * height;
  }

  public double perimeter() {
    return width + width + height + height;
  }

  public double diagonal(){
    return Math.sqrt(Math.pow(width, 2d) + Math.pow(height, 2d));
  }

  @Override
  public String toString() {
    return "AREA = " + String.format("%.2f",area()) +
            "\nPERIMETER = " + String.format("%.2f", perimeter()) +
            "\nDIAGONAL = " + String.format("%.2f",diagonal());
  }
}
