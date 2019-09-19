package Assignment_3_35;
//input: even or odd number
//Expected ouput: either even or odd number
//actual output: 1 is an odd number and 2 is an even number
//result: Success

import java.util.Scanner;

public class Even_or_Odd_Number {

    public static void main(String[] args) {

        int x;
        System.out.println("Enter Even or Odd Integer");
        Scanner number = new Scanner(System.in);
        x = number.nextInt();

        if (x % 2 == 0)
        System.out.println(+ x+" is an even number");
        else if (x % 2 != 0)
            System.out.println(+ x+" is an odd number");



    }
}
