import java.sql.*;

public class ProgramTests {
    public static void main(String[] args) {


        numbers dodaj = (a, b) -> a + b;
        numbers odejmij = (a, b) -> a - b;
        numbers pomnoz = (a, b) -> a * b;
        numbers podziel = (a, b) -> a / b;

        System.out.println(dodaj.oblicz(5,5));
        int x = dodaj.oblicz(10,90);
        System.out.println(x);
        System.out.println(odejmij.oblicz(5,5));
        System.out.println(pomnoz.oblicz(5,5));
        System.out.println(podziel.oblicz(5,5));


    }

}

