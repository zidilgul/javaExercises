import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfnums, min=0,max=0,num;
        System.out.print("Kaç tane sayı gireceksiniz: ");
        numberOfnums = sc.nextInt();

        for(int i = 1; i<=numberOfnums ; i++){
            System.out.print(i+". Sayıyı giriniz: ");
            num = sc.nextInt();
            while(i==1){
                max=num;
                min=num;
                break;
            }
            if(num>max)
                max=num;
            if (num<min)
                min=num;
        }
        System.out.println("En büyük sayı: "+ max);
        System.out.println("En küçük sayı: "+ min);
    }
}