

package Assignment_3_5;
//input: Day and future day
//expected ouput: a future date
//actual output: a future date
//result: Success

import java.util.Scanner;

public class Future_date {

    public static void main(String[] args) {
        Scanner User_Input = new Scanner(System.in);
        System.out.println("Enter Current Day: ");
        int currentDay =  User_Input.nextInt(); //current date
        System.out.println("Enter the number of days since today: ");
        int futureDay = User_Input.nextInt(); //future date + current date = new date

        String dayString = "";

        switch (currentDay%7) {
            case 1:
                dayString = "Monday ";
                break;
            case 2:
                dayString = "Tuesday ";
                break;
            case 3:
                dayString = "Wednesday ";
                break;
            case 4:
                dayString = "Thursday ";
                break;
            case 5:
                dayString = "Friday ";
                break;
            case 6:
                dayString = "Saturday ";
                break;
            case 0:
                dayString = "Sunday ";
                break;
        }
                System.out.println("The current date is " + dayString + "and the future date will be " );

                int today = (currentDay + futureDay);

                switch (today%7) {
                    case 1:
                        dayString = "Monday ";
                        break;
                    case 2:
                        dayString = "Tuesday ";
                        break;
                    case 3:
                        dayString = "Wednesday ";
                        break;
                    case 4:
                        dayString = "Thursday ";
                        break;
                    case 5:
                        dayString = "Friday ";
                        break;
                    case 6:
                        dayString = "Saturday ";
                        break;
                    case 0:
                        dayString = "Sunday ";
                }
                        System.out.print(dayString);
        }
    }
