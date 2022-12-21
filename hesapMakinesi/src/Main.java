import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int n1, n2, choice;
        Scanner sc = new Scanner(System.in);

        System.out.print("İlk sayıyı giriniz: ");
        n1 = sc.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        n2 = sc.nextInt();

        System.out.print("Yapılacak işlemi seçiniz.\nToplama için 1\nÇıkarma için 2\nÇarpma için 3\nBölme için 4\ntuşlayınız: ");
        choice = sc.nextInt();

        switch (choice){
            case 1:
                System.out.println(n1 + "+"+ n2 +"=" + (n1+n2));
                break;
            case 2:
                System.out.println(n1 + "-"+ n2 +"=" + (n1-n2));
                break;
            case 3:
                System.out.println(n1 + "*"+ n2 +"=" + (n1*n2));
                break;
            case 4:
                if(n2 == 0){
                    System.out.println("Bir sayı 0'a bölünmez");
                }
                else
                    System.out.println(n1 + "/"+ n2 +"=" + (n1/n2));
                break;
            default:
                System.out.println("Yanlış tuşlama yaptınız. Tekrar deneyin.");
        }
    }
}