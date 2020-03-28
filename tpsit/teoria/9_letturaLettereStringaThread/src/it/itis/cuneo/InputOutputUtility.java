package it.itis.cuneo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class InputOutputUtility {
  public static DateFormat dfDayHour = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
  public static DateFormat dfDay = new SimpleDateFormat("dd/MM/yyyy");

  private static InputStreamReader r = new InputStreamReader(System.in);
  private static BufferedReader br = new BufferedReader(r);


  public static String leggiNome(String outStr){
    String str=null;

    System.out.print(outStr);
    try {
      str = br.readLine();
    } catch (IOException e) {
      e.printStackTrace();
    }
    return str;
  }
}