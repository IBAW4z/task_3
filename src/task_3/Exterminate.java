package task_3;
import java.util.Scanner;

public class Exterminate {

	public static void main(String[] args) {
		String owner="Andziorek";
		System.out.println(owner);
		System.out.println("test znaków diakrytycznych: ZAŻÓŁĆ GĘŚLĄ JAŹŃ");
		
		String [][]matrix = new String[7][2];
		matrix [0][0]="Imię";
		matrix [1][0]="Nazwisko";
		matrix [2][0]="Rok urodzenia";
		matrix [3][0]="Adres e-mail";
		matrix [4][0]="Numer buta";
		matrix [5][0]="Kot";
		matrix [6][0]="Kawa?";
		
		Scanner in = new Scanner(System.in);
		
		for(int row=0; row < matrix.length; row++){
			matrix [row][1] = " ";
			System.out.println("Podaj: " + matrix [row][0]);
			matrix [row][1] =  in.nextLine();
		}
		
		for(int row=0; row < matrix.length; row++){
			System.out.println(matrix [row][0] + " " + matrix [row][1]);
		//ToBeContinued
	}
}
}
