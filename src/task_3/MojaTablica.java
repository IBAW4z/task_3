package task_3;
import java.util.Scanner;
import java.util.Hashtable;
import java.util.Enumeration;

public class MojaTablica {
	public static void main(String[] args) {
 		
 		String slackNick = "aniametz";
 		
 		Hashtable<String, String> personalData = new Hashtable<String, String>();
 		
 		personalData.put("imi�", "");
 		personalData.put("nazwisko", "");
 		personalData.put("p�e�", "");
 		personalData.put("wiek", "");
 		personalData.put("zaw�d", "");
 		personalData.put("miejsce zamieszkania", "");
 		personalData.put("nick", slackNick);
 		
 		Enumeration<String> keyIndex = personalData.keys();
 		
 		Scanner scanData = new Scanner(System.in);
 		String pomocnicza;
 		String zapis;
 		while(keyIndex.hasMoreElements())
 		{
 			pomocnicza = (String) keyIndex.nextElement();
 			System.out.println("Wprowad� "+ pomocnicza +": ");
 			zapis = scanData.nextLine();
 			personalData.put(pomocnicza, zapis);
 		}
		
		scanData.close();
		
		System.out.println("Imi�: " + personalData.get("imi�"));
		System.out.println("Nazwisko: " + personalData.get("nazwisko"));
		System.out.println("Nick: " + personalData.get("nick"));
		System.out.println("P�e�: " + personalData.get("p�e�"));
		System.out.println("Wiek: " + personalData.get("wiek"));
		System.out.println("Zaw�d: " + personalData.get("zaw�d"));
		System.out.println("Miejsce zamieszkania: " + personalData.get("miejsce zamieszkania"));

}
}
