package zadaniedomowe2;

import java.util.Scanner;

public class ZadDom2 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    String x = scanner.nextLine();
    String y = scanner.nextLine();

    try {
      Integer.parseInt(x);
    } catch (NumberFormatException e) { //złapanie wyjątku
      System.out.println("Prosimy o podanie wartości liczbowych");
      x = scanner.next();
    }
    finally {
      System.out.println("Program jest w trakcie przetwarzania.");
    }


    try {
      Integer.parseInt(y);
    } catch (NumberFormatException e) { //złapanie wyjątku
      System.out.println("Prosimy o podanie wartości liczbowych.");
      y = scanner.next();
    }


    try {
      dzielenie(Integer.parseInt(x), Integer.parseInt(y));
    } catch (ArithmeticException e){
      System.out.println("Dzielenie przez zero nie jest możliwe. Podaj drugą liczbę jeszcze raz.");
      y = scanner.next();
    }

    if (Integer.parseInt(y) < 5){
      System.out.println(dzielenie(Integer.parseInt(x), Integer.parseInt(y)));
    } else if (Integer.parseInt(y) >= 5) {
      System.out.println(mnozenie(Integer.parseInt(x), Integer.parseInt(y)));
    }

  }

  public static int dzielenie(int a, int b){
    return a/b;
  }

  public static int mnozenie(int m, int n){
    return m*n;
  }


}
