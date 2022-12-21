import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int a, b, c, cevre;
        double alan,u;

        System.out.println("Üçgenin kenar uzunluklarını giriniz.");
        System.out.print("1.Kenar: ");
        a = input.nextInt();
        System.out.print("2.Kenar: ");
        b = input.nextInt();
        System.out.print("3.Kenar: ");
        c = input.nextInt();

        cevre = a+b+c;
        u = cevre/2;
        alan = Math.sqrt(u*(u-a) * (u-b) * (u-c));

        System.out.println("Üçgenin çevresi: "+ cevre);
        System.out.println("Üçgenin alanı: "+ alan);
    }
}