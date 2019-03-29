// Praca domowa #1 - (C) Sebastian Muraszewski

import java.util.Map;
import java.util.HashMap;

public class StudentGrades {

  public static void main(String[] args) {
    Map<String,Double> winterSemester = new HashMap<>();
    winterSemester.put("Algorytmy i struktury danych", 5.0);
    winterSemester.put("Bazy danych", 3.0);
    winterSemester.put("Technologie internetowe", 4.5);
    winterSemester.put("Mikroekonomia", 5.0);
    winterSemester.put("Ekonometria przestrzenna", 4.0);

    if (winterSemester.containsKey("Ekonometria przestrzenna") == true){ //sprawdzanie po wartości Booleanowskiej
      System.out.println("Student realizował przedmiot o nazwie ekonometria przestrzenna.");
    }
    else{
      System.out.println("Student nie realizował przedmiotu o nazwie ekonometria przestrzenna.");
    }

    if (winterSemester.get("Ekonometria przestrzenna") != null){
      System.out.println("Student realizował przedmiot o nazwie ekonometria przestrzenna.");
    }
    else{
      System.out.println("Student nie realizował przedmiotu o nazwie ekonometria przestrzenna.");
    }

    int wsubjects = 0;
    for (String key: winterSemester.keySet()){ //zliczanie przedmiotów
      wsubjects += 1;
    }

    int wgrades = 0;
    for (Double value: winterSemester.values()){ //zliczanie ocen
      wgrades += 1;
    }

    if(wsubjects == wgrades){
      System.out.println("Liczba przedmiotów w semestrze zimowym jest równa liczbie ocen.");
    }
    else{
      System.out.println("Liczba przedmiotów w semestrze zimowym nie jest równa liczbie ocen.");
    }

    Map<String,Double> academicYear = new HashMap<>();
    academicYear.putAll(winterSemester);
    academicYear.put("Wstęp do programowania", 5.0);
    academicYear.put("Sieci", 3.5);
    academicYear.put("Mikroekonomia", 5.0);

    System.out.println("\nZrealizowane przedmioty w trakcie roku akademickiego:");
    for (Map.Entry<String, Double> entry : academicYear.entrySet()) {
      String subject = entry.getKey();
      System.out.println("* " + subject);
    }

    System.out.println("\nStudent zrealizował w trakcie roku akademickiego " + academicYear.size() + " przedmiotów.");

  }
}
