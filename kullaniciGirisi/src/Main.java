import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String username, password;

        System.out.print("Kullanıcı adınız: ");
        username = sc.nextLine();
        System.out.print("Parolanız: ");
        password = sc.nextLine();

        if(username.equals("admin")  && password.equals("admin123")){
            System.out.println("Kullanıcı girişi başarılı!");
        }
        else
            System.out.println("Kullanıcı adı veya parola hatalı! Tekrar deneyin.");
    }
}