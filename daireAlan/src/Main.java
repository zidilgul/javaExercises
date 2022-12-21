import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pi=3.14, aci, alan;
        int r;
        System.out.print("Dairenin yarıçap değerini giriniz: ");
        r = input.nextInt();
        System.out.print("Dairenin merkez açı değerini giriniz: ");
        aci = input.nextDouble();
        alan = (pi * (r*r) * aci)/360;
        System.out.println("Dairenin alanı: "+alan);
    }
}