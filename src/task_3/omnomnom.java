package task_3;
import java.util.Scanner;

public class omnomnom {public static void main(String[] args) {
	String autor="AsPossible";
	System.out.println(autor);
	
	
	String [][]lodówka = new String[8][3];
	lodówka [0][0]="jajka";
	lodówka [1][0]="parówki";
	lodówka [2][0]="brokuł";
	lodówka [3][0]="udko z kurczaka";
	lodówka [4][0]="bułki";
	lodówka [5][0]="kalafiora";
	lodówka [6][0]="pomidory";
	lodówka [7][0]="jogurt";
	
	Scanner wczytanie = new Scanner(System.in);
	
	System.out.println("Na poniższe pytania odpowiadaj tak lub nie:");
   
	for(int row=0; row < lodówka.length; row++){
		lodówka [row][1] = " ";
		System.out.print("Czy masz w lodówce: " + lodówka [row][0] + "? Podaj ilość: ");
		lodówka [row][1] = wczytanie.nextLine();
		
	}
	
	for(int row=0; row < lodówka.length; row++){
	        System.out.println(lodówka [row][0] + " ilość: " + lodówka [row][1]);    
	}
	
}
}

