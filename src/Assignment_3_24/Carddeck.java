package Assignment_3_24;
//Input: draw a card
//Expected output: random card
//Actual output: random face card and number card
//result: Success

public class Carddeck {
    public static void main(String[] args) {
        final int CARDS_IN_DECK = 52;
        //choose a card
        int number = (int) (Math.random() * CARDS_IN_DECK);
        System.out.println("you drew... ");
        if (number % 13 == 0)
            System.out.println("Ace of");
        else if (number % 13 == 10)
            System.out.println("Jack of");
        else if (number % 13 == 11)
            System.out.println("Queen of");
        else if (number % 13 == 12)
            System.out.println("King of");
        else
            System.out.println((number%13) + " of");

        if (number / 13 == 0)
            System.out.println("Diamonds");
        else if (number / 13 == 1)
            System.out.println("Spades");
        else if (number / 13 == 2)
            System.out.println("Clubs");
        else if (number / 13 == 3)
            System.out.println("Hearts");

    }

}
