/**Java döngüler ile
 * girilen sayıya kadar olan 4 ve 5'in
 * kuvvetlerini ekrana yazdıran program. */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        num = sc.nextInt();
        System.out.print("4'ün kuvvetleri: ");
        for (int i=1;i<=num;i=i*4){
            System.out.print(i+", ");
        }
        System.out.println();
        System.out.print("5'in kuvvetleri: ");
        for (int j=1 ;j<=num;j=j*5){
            System.out.print(j+", ");
        }
    }
}