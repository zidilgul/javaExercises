/** 3 ve 4 e tam bölünen sayıların ortalaması. */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num,numberOfNums=-1; //0'ı ortalamaya katmasın diye -1 den başlattık.
        double avg=0;
        System.out.print("Bir sayı giriniz: ");
        num = sc.nextInt();
        for(int i = 0 ; i<=num; i++){
            if(i % 12 == 0){
                avg += i;
                numberOfNums++;
            }
        }
        avg = avg!=0 ?  avg/numberOfNums : avg;
        System.out.printf("3 ve 4 e bölünen sayıların ortalaması: %.2f",avg);
    }
}