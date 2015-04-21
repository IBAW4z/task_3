package task_3;
import java.util.Scanner;

public class MrBroccoli {

	public static void main(String[] args) {
		
		String autor = "Paulinka";
		System.out.println("Klasę założywszy: " + autor);
		// testuję, czy działa jak powinno
		
		String[][] tabs = new String[6][5];
		tabs [0][0]="Imię";
		tabs [1][0]="Nazwisko";
		tabs [2][0]="ImięOjca";
		tabs [3][0]="ImięMatki";
		tabs [4][0]="ImięPsa";
		tabs [5][0]="ImięChomika";
		
		System.out.println(tabs.length);
		System.out.println(tabs[1].length);

		 Scanner odczyt = new Scanner(System.in); //obiekt do odebrania danych od użytkownika 
		
		for(int col=1; col<tabs[0].length; col++){
			for(int row=0; row<tabs.length; row++){
				System.out.println("Wpisz kolejne " + tabs[row][0]);
				tabs[row][col] = odczyt.nextLine();
			}
		}
		
		for(int coll=1; coll<tabs[0].length; coll++){
			System.out.print(coll + " : ");
			for(int i=0; i<tabs.length; i++){
				System.out.print(tabs[i][coll] + " ");
			}
			System.out.println(" ");

		}
		
	}

}
