import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kullanici_adi, sifre;
        int hak = 3;
        int bakiye = 9000;
        int secim ;

        while (hak > 0){
            System.out.println("--------------------------");
            System.out.println("PK Kullanıcı Giriş Paneli");
            System.out.println("--------------------------");
            System.out.print("Kullanıcı Adı : ");
            kullanici_adi= input.nextLine();
            System.out.print("Parola : ");
            sifre = input.nextLine();

            if (kullanici_adi.equals("idil") && sifre.equals("admin")){
                System.out.println("--------------------------------------");
                System.out.println("Merhaba, "+kullanici_adi+" Patika Bankasına Hoşgeldiniz!");
                System.out.println("--------------------------------------");
                do {
                    System.out.println("1- Para yatırma\n" +
                            "2- Para çekme\n" +
                            "3- Bakiye sorgula\n" +
                            "4- Çıkış yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    secim = input.nextInt();
                    switch (secim){
                        case 1:
                            System.out.println("Bakiyeniz: "+bakiye);
                            System.out.print("Yatırmak istediğiniz para miktarı : ");
                            int tutar = input.nextInt();
                            bakiye += tutar;
                            System.out.println("---------------------------------------------------");
                            System.out.println("Güncel Bakiyeniz : " + bakiye);
                            System.out.println("---------------------------------------------------");
                            continue;
                        case 2:
                            System.out.println("Bakiyeniz: "+bakiye);
                            System.out.print("Çekmek istediğiniz para miktarı : ");
                            tutar = input.nextInt();
                            if (tutar > bakiye){
                                System.out.println("Bakiye Yetersiz!");
                            }else {
                                bakiye -= tutar;
                                System.out.println("---------------------------------------------------");
                                System.out.println("Güncel bakiyeniz : " + bakiye  );
                                System.out.println("---------------------------------------------------");
                            }
                            continue;
                        case 3:
                            System.out.println("---------------------------------------------------");
                            System.out.println("Bakiyeniz : " + bakiye );
                            System.out.println("---------------------------------------------------");
                    }

                }while (secim != 4);
                System.out.println("---------------------------------------------------");
                System.out.println("Hesabınızdan Çıkış Yapıldı. İyi Günler.");
                System.out.println("---------------------------------------------------");
                break;
            }else {
                hak--;
                System.out.println("Hatalı kullanıcı adı veya şifre girişi yaptınız. Tekrar deneyiniz.");
                if (hak == 0){
                    System.out.println("Heabınız bloke olmuştur!");
                }else{
                    System.out.println("Kalan Hakkınız : " +"|" +hak+"|");
                }
            }
        }
    }
}