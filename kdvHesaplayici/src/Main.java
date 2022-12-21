import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double tutar, kdv_tutar, kdv_oran, kdvli_tutar;
        Scanner input = new Scanner(System.in);

        System.out.print("Ücret tutarını giriniz: ");
        tutar = input.nextDouble();

        kdv_oran = (tutar<=1000 && tutar >= 0) ?  0.18 : 0.08;
        kdv_tutar = tutar*kdv_oran;
        kdvli_tutar = tutar + kdv_tutar;


        System.out.println("KDV'siz tutar: " + tutar);
        System.out.println("KDV oranı: %" + kdv_oran*100);
        System.out.println("KDV tutarı: " + kdv_tutar);
        System.out.println("KDV'li tutar: " + kdvli_tutar);

    }
}