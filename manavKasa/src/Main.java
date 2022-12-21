import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double elma = 3.67, armut = 2.14, domates = 1.11, muz=0.95 , patlican = 5.0, toplam;

        System.out.print("Armut kaç kilo? : ");
        armut *= input.nextDouble();
        System.out.print("Elma kaç kilo? : ");
        elma *= input.nextDouble();

        System.out.print("Domates kaç kilo? : ");
        domates *= input.nextDouble();

        System.out.print("Muz kaç kilo? : ");
        muz *= input.nextDouble();

        System.out.print("Patlıcan kaç kilo? : ");
        patlican *= input.nextDouble();

        toplam = armut + elma + domates + muz + patlican;

        System.out.println("Toplam tutar: " +toplam + "TL");

    }
}