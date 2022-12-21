
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double kg, boy, vki;

        System.out.print("Lütfen boyunuzu metre cinsinden giriniz: ");
        boy = input.nextDouble();
        System.out.print("Lütfen kilonuzu kilogram cinsinden giriniz: ");
        kg = input.nextDouble();

        vki = kg / (boy*boy); //Kilo (kg) / Boy(m) * Boy(m)
        System.out.println("Vücut Kütle İndeksiniz: "+vki);
    }
}