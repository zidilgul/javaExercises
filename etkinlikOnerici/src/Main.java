import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hava;

        System.out.print("Öneri almak için hava sıcaklığı giriniz: ");
        hava = sc.nextInt();

        if(hava > 25)
            System.out.println("Yüzmeye gidebilirsiniz.");
        else if (hava > 15)
            System.out.println("Pikniğe gidebilirsiniz.");
        else if (hava > 5)
            System.out.println("Sinemaya gidebilirsiniz.");
        else
            System.out.println("Kayak yapabilirsiniz.");
    }
}