import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int month, day;

    while (true){
        System.out.print("Enter your birth month(ex:3): ");
        month = sc.nextInt();
        if (month<1 || month>12)
            System.out.println("Wrong number. Try again.");
        else
                break;
    }

        System.out.print("Enter your birth day: ");
        day = sc.nextInt();

        if(month==1){
            if(day>=1 && day<=21){
                System.out.println("Capricorn");
            }
            else
                System.out.println("Aquarius");

        }
        else if(month == 2){
            if(day>=1 && day<=19){
                System.out.println("Aquarius");
            }
            else
                System.out.println("Pisces");
        }
        else if(month == 3){
            if(day>=1 && day<=20){
                System.out.println("Pisces");
            }
            else
                System.out.println("Aries");
        }
        else if(month == 4){
            if(day>=1 && day<=20){
                System.out.println("Aries");
            }
            else
                System.out.println("Taurus");
        }
        else if(month == 5){
            if(day>=1 && day<=21){
                System.out.println("Taurus");
            }
            else
                System.out.println("Gemini");
        }
        else if(month == 6){
            if(day>=1 && day<=22){
                System.out.println("Gemini");
            }
            else
                System.out.println("Cancer");
        }
        else if(month == 7){
            if(day>=1 && day<=22){
                System.out.println("Cancer");
            }
            else
                System.out.println("Leo");
        }
        else if(month == 8){
            if(day>=1 && day<=22){
                System.out.println("Leo");
            }
            else
                System.out.println("Virgo");
        }
        else if(month == 9){
            if(day>=1 && day<=22){
                System.out.println("Virgo");
            }
            else
                System.out.println("Libra");
        }
        else if(month == 10){
            if(day>=1 && day<=22){
                System.out.println("Libra");
            }
            else
                System.out.println("Scorpio");
        }
        else if(month == 11){
            if(day>=1 && day<=21){
                System.out.println("Scorpio");
            }
            else
                System.out.println("Sagittarius");
        }
        else if(month == 12){
            if(day>=1 && day<=21){
                System.out.println("Sagittarius");
            }
            else
                System.out.println("Capricorn");
        }
    }
}