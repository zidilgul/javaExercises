/**Klavyeden girilen bir sayının mükemmel
 *  sayı olup/olmadığını bulan ve sayı mükemmel
 *  sayı ise ekrana “mükemmel sayıdır.” değilse
 *  “mükemmel sayı değildir.” ifadelerini ekrana yazan program.
 *  Mükemmel Sayı Nedir ?
 *  Bir sayının kendisi hariç pozitif
 *  tam sayı çarpanları (kalansız bölen sayıların)
 *  toplamı kendisine eşit olan sayıya mükemmel sayı denir. */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,toplam=0;
        System.out.print("Bir sayı giriniz: ");
        num = sc.nextInt();

        for(int i = 1 ; i<num ; i++){
            if(num%i ==0)
                toplam+=i;
        }

        if (toplam == num)
            System.out.println("Mükemmel sayıdır.");
        else
        System.out.println("Mükemmel sayı değildir.");

    }
}