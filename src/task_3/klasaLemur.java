package task_3;
import java.util.Scanner;

public class klasaLemur{
	
	//licznik udupienia na najbliższy tydzień
	public static void main(String [] args){
		String dane[][];
		dane = new String[7][3];
		Scanner tmpS=new Scanner(System.in);
		
		//kategorie: dni tygodnia
		dane[0][0]="PONIEDZIAŁEK";
		dane[1][0]="WTOREK";
		dane[2][0]="ŚRODA";
		dane[3][0]="CZWARTEK";
		dane[4][0]="PIĄTEK";
		dane[5][0]="SOBOTA";
		dane[6][0]="NIEDZIELA";
				
		for (int i=0; i<dane.length; i++){
			System.out.println(dane[i][0]+" - co cię udupia?\n");
			dane [i][1]=tmpS.nextLine();
			System.out.println("Jak bardzo cię udupia? (skala 1-10)");
			dane[i][2]=tmpS.nextLine();
		}
		tmpS.close();
		
		//wyświetlanie tygodnia
		System.out.println("Twój udupiający tydzień przedstawia się następująco: \n");
		for (int i=0; i<dane.length; i++){
			System.out.println(dane[i][0]+" - "+dane[i][1]+" ("+dane[i][2]+")");
		}
		
		//wyliczenie stopnia udupienia
		int wspUdup=0;
		
		for (int i=0; i<dane.length; i++){
			try{
				wspUdup=wspUdup+Integer.parseInt(dane[i][2]);
			}
			catch (NumberFormatException exc) {
				wspUdup=wspUdup+0;
			}
		}
		
		//skomentowanie stopnia udupienia
		String koment;
		
		if (wspUdup<10)
			koment="Prokrastynuj w spokoju.";
		else if (wspUdup>10 && wspUdup<20)
			koment="Prokrastynuj w niepokoju.";
		else if (wspUdup>20 && wspUdup<30)
			koment="Lepiej nie prokrastynować. Co nie znaczy, że nie będziesz.";
		else if (wspUdup>30 && wspUdup<40)
			koment="Prokrastynacja zakazana. Pamiętaj, by nie dać się złapać.";
		else if (wspUdup>40 && wspUdup<50)
			koment="Prokrastynuj w panice";
		else
			koment="Prokrastynuj w spokoju. I tak jesteś udupiony.";
		System.out.println("\n Stopień udupienia w tym tygodniu wynosi "+wspUdup+". "+koment);
	}
}
