package task_3;
import java.util.Scanner;

public class KeepCalm {
	public static void main(String[] args){
		String autor = "agarenc";
		System.out.println("Popełniła "+autor);
		
		String[][] formularz = new String[6][2];
		formularz[0][0]="imię";
		formularz[1][0]="nazwisko";
		formularz[2][0]="email";
		formularz[3][0]="telefon kontaktowy";
		formularz[4][0]="miasto";
		formularz[5][0]="województwo";
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Podaj następujące dane");
		for (int i=0; i<formularz.length; i++){
			System.out.print(formularz[i][0]+": ");
			formularz[i][1]=input.nextLine();
		}
		
		input.close();
		
		System.out.println("Dane osobowe");
		for (int i=0; i<formularz.length; i++){
			System.out.println(formularz[i][0]+": "+formularz[i][1]);
		}
		
	}
}