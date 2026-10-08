package common;

import java.util.Objects;
import java.util.Scanner;

public class SemanticMachine3000 {

    public static void main(String[] args) {

        //Läser in text ifrån användaren -> Scanner
        TextCounter counter = new TextCounter();
        Scanner scan = new Scanner(System.in);

        while(counter.isRunning()) {
            counter.count(scan.nextLine());
        }

        //Hämta antal tecken och rader
        int letters = counter.getLetters();
        int rows = counter.getRows();
        //Skriv ut antal tecken och rader
        System.out.println(letters);
        System.out.println(rows);

    }
    //Kontrollerar om man har skrivit stop
    //Upprepar ovan tills vi har skrivit stop
}
