import java.util.Scanner;
public class Main {

    static int fibonacci(int n){
            if (n == 1 || n == 2){
                return 1;
            }
                return fibonacci(n-1) + fibonacci(n-2);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Kaçıncı fibonacci elemanını görüntülemek istersiniz: ");
        n = sc.nextInt();

        System.out.print(fibonacci(n));

    }
}