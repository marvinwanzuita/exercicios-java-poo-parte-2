package _06_OO_CurrencyConverter;

public class _06_CurrencyConverter {

  public static double dollarValue;

  public static double dollarAmount;

  public static double convertValueReais(){
    return (dollarAmount * dollarValue) + ((dollarAmount * dollarValue) * 0.06);
  }


}
