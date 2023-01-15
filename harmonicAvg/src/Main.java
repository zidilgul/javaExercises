import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Harmonik hesaplama için eleman sayısı giriniz: ");
        int item = sc.nextInt();
        double result = 0.0;

        for (int i = 1; i <= item; i++) {
            result += (1.0/i);
        }

        System.out.println("Harmonik seri sonucu: " + result);
        System.out.println("Harmonik serinin ortalaması: " + item/result);
        sc.close();
    }
}