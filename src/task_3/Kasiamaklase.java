package task_3;
import java.util.Scanner;

public class Kasiamaklase {

	public static void main(String[] args) {
		String boss_name = "Kasia";
		String boss_surname = "Sobczyk";
		String boss = boss_name+boss_surname;
		System.out.println(boss);
		
		String[][] tablica = new String[6][2];
		tablica [0][0] = "Imię";
		tablica [1][0] = "Nazwisko";
		tablica [2][0] = "Kolor włosów";
		tablica [3][0] = "Wzrost";
		tablica [4][0] = "IQ";
		tablica [5][0] = "Waga";
		
		Scanner in = new Scanner(System.in); //obiekt do odebrania danych
		
		for(int i=0; i< tablica.length; i++)
		    for(int j=0; j< tablica[i].length; j++){
		    	     
		    	System.out.println("Podaj.." +tablica[i][0] );
		    	String wartosc = in.nextLine();  // wpisanie wartości      
	 }
		
	      for(int i=0; i< tablica.length; i++){ //wypisanie wartości z tablicy
	    	    for(int j=0; j< tablica[i].length; j++)
	    	        System.out.print(tablica[i][j]);
	    	    System.out.println();
	    	}
		
		}
}
