package task_3;
import java.util.Scanner;
public class Szetlak {
	
	    public static void main(String[] args) {
	       
	        String imie = "Lila";
	        System.out.println("Klasa: "+imie);
	        String [][]dane = new String[7][2];
	        dane[0][0] = "imie: ";
	        dane[1][0] = "nazwisko: ";
	        dane[2][0] = "wiek: ";
	        dane[3][0] = "płeć: ";
	        dane[4][0] = "ulubiony kolor: ";
	        dane[5][0] = "ulubiona potrawa: ";
	        dane[6][0] = "ulubiona piosenka: ";
	       
	       
	        Scanner wpisz = new Scanner(System.in);
	        for(int ile=0; ile < dane.length; ile++){
	            System.out.println("Podaj "+dane[ile][0]);
	            dane[ile][1] = wpisz.nextLine() ;
	        }
	        wpisz.close();
	       
	        for(int ile=0; ile < dane.length; ile++){
	            System.out.println(dane[ile][0]+ " "+ dane[ile][1]);
	        }
	    };

	}




