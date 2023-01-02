import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num,sum=0;

        System.out.print("Bir sayı giriniz: ");
        num = sc.nextInt();

        while (num>0){
            sum += num%10;
            num /= 10;
        }

        System.out.println("Sayının basamakları toplamı = " +sum);

    }
}