package task_3;
import java.util.Scanner;

/**
 * Klasa implementuje wiedzę o DW w środowisku Java ;P
 * Created by Anna on 2015-04-21.
 */
public class who {
    private final static String TWORCA="NAnna";
    public String companion;
    public String doctor;

    public static void showTworca() {
        System.out.println(TWORCA);
    }

    public static void main(String[] args) {
        int sezon;
        Scanner l=new Scanner(System.in);
        System.out.println("---właściciel---");
        who.showTworca();
        System.out.println("----------------");
        System.out.println("Ile znasz sezonów?");
        sezon=l.nextInt();
        who[] Mates = new who[sezon];
        Scanner w=new Scanner(System.in);

        for(int i=0;i<Mates.length;i++){
            Mates[i] = new who();
        }

        for(int j=0; j<Mates.length; j++){
            System.out.println("---Sezon "+(j+1)+"---");
            System.out.println("Podaj towarzyszkę:");
            Mates[j].companion=w.nextLine();
            System.out.println("Podaj Doktora");
            Mates[j].doctor=w.nextLine();
        }
        for(int j=0;j<Mates.length;j++){
            System.out.println((j+1)+". "+Mates[j].doctor+"+"+Mates[j].companion);
        }

    }

}

