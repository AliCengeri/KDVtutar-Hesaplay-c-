import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ücreti giriniz : " );
        double ucret;
        ucret = input.nextDouble();
        boolean dusuk = (ucret<=1000);
        double kdvo = (dusuk) ? 0.18 : 0.08;
        double kdvtutari = ucret * kdvo;
        double kdvli = ucret + kdvtutari;
        System.out.println("KDV Tutarı :" + kdvtutari);
        System.out.println("KDV'li Tutar :" + kdvli);
        System.out.println("KDV oranı :" + kdvo);
        System.out.println("KDV'siz Tutar :" + ucret);
    }
}
