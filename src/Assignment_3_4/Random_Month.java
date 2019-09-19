package Assignment_3_4;
//Input: Month day and future day
//Expected output: actual date and future date
//Actual output: month day and future day allowing calculation
//result: Success

public class Random_Month {
    public static void main(String[] args) {
        int month = (int)((Math.random() * 12) + 1);
        //Math.random allows for a random selection of the different cases

        switch (month)
        {
            // this switch case randomely chooses.
            case 1: System.out.println("January ");
                break;
            case 2: System.out.println("Febuary ");
                break;
            case 3: System.out.println("March ");
                break;
            case 4: System.out.println("April ");
                break;
            case 5: System.out.println("May ");
                break;
            case 6: System.out.println("June ");
                break;
            case 7: System.out.println("July ");
                break;
            case 8: System.out.println("August ");
                break;
            case 9: System.out.println("September ");
                break;
            case 10: System.out.println("October ");
                break;
            case 11: System.out.println("November ");
                break;
            case 12: System.out.println("December ");

                System.out.println(month);

        }
    }
}
