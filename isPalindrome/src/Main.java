import java.util.Scanner;
public class Main {

    public static void isPalindrome(int num){

        int newNum=0,tempNum = num;

        while(tempNum!=0){
            newNum = (newNum *10) + (tempNum%10);
            tempNum/=10;
        }
        if (num == newNum)
            System.out.println("Palindrome.");
        else
            System.out.println("Not palindrome.");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.print("Enter a number to check if palindrome: ");
        num = sc.nextInt();

        isPalindrome(num);
    }
}