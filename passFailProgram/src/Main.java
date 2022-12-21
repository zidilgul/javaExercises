import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double avg=0;
        int math, physics, chem, tr, history, music, numberOfSubjects=0;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your mathematics grade: ");
        math = input.nextInt();
        if(math>=0 && math <=100 ){
            numberOfSubjects++;
            avg += math;
        }

        System.out.print("Enter your physics grade: ");
        physics = input.nextInt();
        if(physics>=0 && physics <=100 ){
            numberOfSubjects++;
            avg += physics;
        }


        System.out.print("Enter your chemistry grade: ");
        chem = input.nextInt();
        if(chem>=0 && chem <=100 ){
            numberOfSubjects++;
            avg += chem;
        }


        System.out.print("Enter your turkish grade: ");
        tr = input.nextInt();
        if(tr>=0 && tr <=100 ){
            numberOfSubjects++;
            avg += tr;
        }


        System.out.print("Enter your history grade: ");
        history = input.nextInt();
        if(history>=0 && history <=100 ){
            numberOfSubjects++;
            avg += history;
        }


        System.out.print("Enter your music grade: ");
        music = input.nextInt();
        if(music>=0 && music <=100 ){
            numberOfSubjects++;
            avg += music;
        }

        avg /=numberOfSubjects;

        System.out.println("Your grade average is "+ avg + "!");

        if (avg>=55){
            System.out.println("You passed!");
        }
        else
            System.out.println("You failed! See you next year.");

    }
}
