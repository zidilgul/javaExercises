import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1,n2,total=1;
        System.out.print("Enter a number: ");
        n1= sc.nextInt();
        System.out.print("Enter exponent: ");
        n2= sc.nextInt();
        for (int i=1 ; i<=n2 ; i++){
            total*=n1;
        }System.out.println("Result: "+ total);
    }
}