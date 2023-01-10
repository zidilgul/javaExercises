import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double total=0;
        int n;
        System.out.print("Bir sayı giriniz: ");
        n = sc.nextInt();

        for (int i=1; i<=n; i++ ){

            total += 1.0/i;

        }
        System.out.print("Harmonik Sonuc: "+ total );

    }
}