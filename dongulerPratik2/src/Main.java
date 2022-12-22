/** Java döngüler ile tek bir sayı girilene
 *  kadar kullanıcıdan girişleri kabul eden ve girilen
 *  değerlerden çift ve 4'ün katları olan sayıları toplayıp
 *  ekrana basan program. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num, toplam=0;

        while(true){
            System.out.print("Bir sayı giriniz: ");
            num= sc.nextInt();
            if(num % 2 != 0){
                System.out.println("Tek sayı girdiniz. Program sona erdi.");
                break;
            }
            else if(num % 4 == 0 && num != 0){
                toplam += num;
                System.out.println("Güncel Toplam: "+ toplam);
            }
        }
    }
}