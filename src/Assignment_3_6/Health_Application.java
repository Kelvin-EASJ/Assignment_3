package Assignment_3_6;
//input: Weight, Feet and Pounds
//expected output: BMI
//actual output: BMI
//result: Success

import java.util.Scanner;

public class Health_Application {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //User input Weight in Pounds
        System.out.println("Enter weight in pounds: ");
        double weight = input.nextDouble();

        //User input inches
        System.out.println("Enter height in inches: ");
        double inches = input.nextDouble();

        //User input feet
        System.out.println("Enter height in feet: ");
        double feet = input.nextDouble();


        final double POUND_PER_KILOGRAMS = 0.45359237; //Constant value
        final double FEET_PER_METERS = 0.3048; // Constant value
        final double INCH_PER_METERS = 0.0254; // Constant value


        //Calculate BMI
        double WeightinPounds = weight * POUND_PER_KILOGRAMS;
        double HeightinInches = inches * INCH_PER_METERS;
        double HeightinFeet = feet * FEET_PER_METERS;
        double BMI = WeightinPounds / (HeightinInches + HeightinFeet);

        //Results
        System.out.println("BMI is " + BMI);
        if (BMI < 18.5)
            System.out.println("Underweight");
        else if (BMI < 25)
            System.out.println("Normal weight");
        else if (BMI < 30)
            System.out.println("overweight");
        else
            System.out.println("Morbidly obese");
    }

}
