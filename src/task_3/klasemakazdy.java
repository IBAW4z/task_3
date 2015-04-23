package task_3;
import java.util.Scanner;

public class klasemakazdy {
	 public static void main(String[] args) {
	        //zmienne
	        String nick = "happyme";
	        Scanner input = new Scanner(System.in);
	       
	        //autor
	        System.out.println("Utworzona przez: "+nick);
	        //tablica formularza
	        String [][]formularz = new String[7][2];
	        formularz[0][0] = "imie: ";
	        formularz[1][0] = "nazwisko: ";
	        formularz[2][0] = "wiek: ";
	        formularz[3][0] = "wzrost: ";
	        formularz[4][0] = "kolor wlosow: ";
	        formularz[5][0] = "rok urodzenia: ";
	        formularz[6][0] = "miejscowość urodzenia: ";
	       
	       
	       
	        //wypelnienie formularza
	        for(int i=0; i < formularz.length; i++){
	            System.out.println("Podaj "+formularz [i][0]);
	            formularz [i][1] = input.nextLine() ;
	        }
	        input.close();
	         
	        //wyswietlenie danych
	        for(int i=0; i < formularz.length; i++){
	            System.out.println(formularz [i][0]+ " "+ formularz [i][1]);
	        }
	    };

	
}
