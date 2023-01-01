import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,r,totaln=1,totalr=1,totalnr=1;
        Scanner inp= new Scanner(System.in);
        System.out.print("n ve r değerlerini giriniz");
        System.out.print("n: "); n=inp.nextInt();
        System.out.print("r: "); r=inp.nextInt();
        if (n<r) {
            System.out.print("n değeri r değerinden küçük olamaz.Tekrar giriniz.");
        }else{
            for (int i=1;i<=n;i++){
                totaln*=i;
            }
            for (int i=1;i<=r;i++){
                totalr*=i;
            }
            for (int i=1;i<=n-r;i++){
                totalnr*=i;
            }
            System.out.print("Kombinasyon: "+totaln/(totalr*totalnr));
        }
    }
}