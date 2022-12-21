import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int km;
        double pricePerKm = 2.20, total = 10;
    Scanner input = new Scanner(System.in);
        System.out.print("Mesafeyi KM cinsinden giriniz: ");
        km = input.nextInt();

        total += (pricePerKm*km);

        total = (total > 20) ? total : 20;

        System.out.println("Toplam tutar: " +total);
    }
}