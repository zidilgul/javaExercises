import java.util.Scanner;
public class Main {

    static int isAsal(int sayi,int y){
        if (y<sayi){
            if (sayi%y!=0){
                return(isAsal(sayi,++y));
            }else {
                return 0;
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int sayi;
        System.out.print("Sayı giriniz :");
        sayi=scanner.nextInt();
        if (sayi!= 1 && isAsal(sayi,2)==1){
            System.out.println(sayi+" sayısı asaldır.");
        }else{
            System.out.println(sayi+" sayısı asal değildir.");
        }
    }
}