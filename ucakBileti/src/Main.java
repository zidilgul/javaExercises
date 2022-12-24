import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int km, age, type;
        double price,discount=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Mesafeyi km türünden giriniz: ");
        km = sc.nextInt();
        System.out.print("Yaşınızı giriniz: ");
        age = sc.nextInt();
        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş): ");
        type = sc.nextInt();
        if(km<=0 || age <=0 || (type!=1 && type!=2)){
            System.out.println("Hatalı giriş yaptınız!");
        }
        else{
            price = km * 0.10;
            if(age<12){
                discount = price * 50 / 100;
            }
            else if (age>=12 && age<=24){
                discount = price * 10 / 100;
            } else if (age>=65)
            {
                discount = price * 30 / 100;
            }
            price -=discount;
            if (type == 2){
                discount = price * 20 / 100;
                price-=discount;
                price*=2;
                System.out.println(discount);
            }


            System.out.println("Toplam Tutar = "+ price +"TL");
        }
    }
}