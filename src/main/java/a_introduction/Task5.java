package a_introduction;

public class Task5 {
    public static void main(String[] args) {

        String imie = "Krystyna";
        int wiek = 3;

//        String q = wiek <= 5 ? "nie jest": "jest";



        System.out.println( imie + ", ma " + wiek + " lat i " + (wiek <= 5 ? "nie jest": "jest") + " pełnoletna" );

    }
}



/*## Conditionals
        ### Task 5
        Stwórz dwie zmienne:
        - String imie
        - int wiek

        Wydrkuj napis w postaci "Imię, ma x lat i jest/nie jest pełnoletni" w zależności od podanego parametru wieku.*/
