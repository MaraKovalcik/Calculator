package GUI;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author ml
 */
import java.io.*;
import java.nio.charset.Charset;


// třída jSlovnik zpracovává sadu slovíček načtenou
// z textového souboru
public class jSoubor
{
    public String s = "";
// metoda konstruktoru
   jSoubor()
   {
      // do proměnné slovnik bude vytvořeno nové dynamické
      // pole (seznam) objektů - v našem případě budeme
      // načítat objekty-instance třídy jSlovicka
      
   }

   // metoda, která načte textový soubor jako stream, proud dat
   // soubor - je cesta k otevíranému souboru
   // charset - znaková sada použitá pro otevření souboru
   public Boolean nactiProudZeSouboru(File soubor,String charset) throws FileNotFoundException {
       s = "";
       // ošetření vyjímek
       try {
           // otevření proudu dat ze souboru
          InputStream inputStream = new FileInputStream(soubor);
          // objekt umožní načtení dat v konkrétní znakové sadě
          Reader reader = new InputStreamReader(inputStream, charset);
          //načtení bloku (bytu)z proudu dat
          int data = reader.read();
          //čte jednotlivé byty až do konce souboru(proudu)
          while(data != -1) {
              //přetypování čísla na znak a sestavení řetězce
             s=s+(char)data;
             data = reader.read();
          }
       }
       catch (IOException e)
       {
           return false;
       }
       return true;
  }

   public Boolean ulozProudDoSouboru(File soubor, String s, String charset) throws FileNotFoundException {
       //String radek = "";
       try {
          OutputStream outputStream = new FileOutputStream(soubor);
          Writer       writer      = new OutputStreamWriter(outputStream, charset);
          writer.write(s);
          writer.close();
       }
       catch (IOException e)
       {
           return false;
       }
       return true;
  }

   
   // metoda vrací celý slovnik (seznam všech načtených slovíček)
   public Boolean nactiZeSouboru(File soubor) throws FileNotFoundException {
       String radek = "";
       s = "";
       try {
          FileReader f = new FileReader(soubor);
          BufferedReader df = new BufferedReader(f); 
          while((radek = df.readLine())!= null) {
             s=s+radek+"\n";
          }
       }
       catch (IOException e)
       {
           return false;
       }
       return true;
  }

   // metoda ukládá obsah slovníku do textového souboru
   public Boolean ulozDoSouboru(File soubor, String s) {
       try {
       {
             FileWriter f = new FileWriter(soubor);
             BufferedWriter df = new BufferedWriter(f);
             df.flush();
             df.write(s);
             df.close();
         }
       }
       catch (IOException e)
       {
           return false;
       }
       return true;
  }
}
