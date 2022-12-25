/**
 * Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın.
 * Her çıkarma işlemi sırasında ekrana son değeri yazdırın. Sayı negatif veya 0 olduktan
 * sonra tekrar 5 ekleyin. Yine her ekleme işleminde sayının son değerini ekrana yazdırın.
 */

import java.util.Scanner;

public class Main {
    static int desen(int n, boolean controller, int counter) {
        if (controller) {
            if (n > 0) {
                System.out.print(n + " ");
                counter++;
                return desen(n - 5, true, counter);
            } else {
                return desen(n, false, counter);
            }
        } else {
            System.out.print(n + " ");
            if (counter > 0) {
                counter--;
                return desen(n + 5, false, counter);
            } else {
                return 0;
            }
        }

    }
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);

        System.out.print("N Sayısı : ");
        n = input.nextInt();

        System.out.print("Çıktısı : ");
        desen(n, true, 0);
    }
}