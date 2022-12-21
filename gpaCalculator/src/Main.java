import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double avg;
        int math, physics, chem, tr, history, music;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your mathematics grade: ");
        math = input.nextInt();

        System.out.print("Enter your physics grade: ");
        physics = input.nextInt();

        System.out.print("Enter your chemistry grade: ");
        chem = input.nextInt();

        System.out.print("Enter your turkish grade: ");
        tr = input.nextInt();

        System.out.print("Enter your history grade: ");
        history = input.nextInt();

        System.out.print("Enter your music grade: ");
        music = input.nextInt();

            avg = math + physics + chem + tr + history + music;
            avg /=6.0;

        System.out.println("Your grade average is "+ avg + "!");

        String state = (avg>=60)? "passed" : "failed";
        System.out.println("You "+ state + "!");


    }
}
