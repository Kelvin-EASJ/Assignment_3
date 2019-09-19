package Assignment_3_14;
//input: 1 or 2
//expected output: heads or tails
//actual output: correct and wrong
//result: Success

import java.util.Scanner;

public class Head_or_Tail {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Heads or Tails? ");
        int heads = input.nextInt();
        int tails = (int) (Math.random() *2);
        //result is a random outcome

        if (heads == tails) {
            System.out.println("You guessed... correct");
        } else {
            System.out.println("You guessed... wrong");
            //tested and the result is random
        }
    }
}
