import java.util.Scanner;
public class Main {

    static int usHesapla(int taban, int us){
        while (us != 0)
        return taban * usHesapla(taban, us-1);

        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int taban, us;
        System.out.print("Taban değeri giriniz: ");
        taban = sc.nextInt();
        System.out.print("Üs değerini giriniz: ");
        us = sc.nextInt();
        System.out.println("Sonuç: "+ usHesapla(taban,us));

    }
}