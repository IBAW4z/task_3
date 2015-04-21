package task_3;
import java.util.Scanner;
import java.util.Hashtable;
import java.util.Enumeration;

public class MojaTablica {
	public static void main(String[] args) {
 		
 		String slackNick = "aniametz";
 		
 		Hashtable<String, String> personalData = new Hashtable<String, String>();
 		
 		personalData.put("imiê", "");
 		personalData.put("nazwisko", "");
 		personalData.put("p³eæ", "");
 		personalData.put("wiek", "");
 		personalData.put("zawód", "");
 		personalData.put("miejsce zamieszkania", "");
 		personalData.put("nick", slackNick);
 		
 		Enumeration<String> keyIndex = personalData.keys();
 		
 		Scanner scanData = new Scanner(System.in);
 		String pomocnicza;
 		String zapis;
 		while(keyIndex.hasMoreElements())
 		{
 			pomocnicza = (String) keyIndex.nextElement();
 			System.out.println("WprowadŸ "+ pomocnicza +": ");
 			zapis = scanData.nextLine();
 			personalData.put(pomocnicza, zapis);
 		}
		
		scanData.close();
		
		System.out.println("Imiê: " + personalData.get("imiê"));
		System.out.println("Nazwisko: " + personalData.get("nazwisko"));
		System.out.println("Nick: " + personalData.get("nick"));
		System.out.println("P³eæ: " + personalData.get("p³eæ"));
		System.out.println("Wiek: " + personalData.get("wiek"));
		System.out.println("Zawód: " + personalData.get("zawód"));
		System.out.println("Miejsce zamieszkania: " + personalData.get("miejsce zamieszkania"));

}
}
