import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        System.out.println("Hello Friend!");
        System.out.println("I would like you to give me three separate integers!!!!");

        while (true) {
            System.out.println("Enter your first integer:  ");
            numbers.add(scan.nextInt());
            System.out.println("Enter your second integer:  ");
            numbers.add(scan.nextInt());
            System.out.println("Enter your third integer:  ");
            numbers.add(scan.nextInt());
            break;
        }

        System.out.println("Your integers are:  " + numbers);

        System.out.println();
    }


    public static void compare(ArrayList numbers) {

        numbers.get(0).











    }



}

