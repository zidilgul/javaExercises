import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.print("Basamak sayısı giriniz: ");
        num = sc.nextInt();
        for(int i = num; i>0 ; i--){
            for(int j=i ; j>0 ;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}