package Lab_2;

import java.util.Scanner;

public class CalculateBMI {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter your weight(kg): ");
        float currentWeight = scanner.nextFloat();
        System.out.print("Please enter your height(m): ");
        float height = scanner.nextFloat();
        float BMI = currentWeight / (height * 2);
        System.out.println("Your BMI is " + BMI);

        if (BMI < 18.5){
            System.out.println("You are underweight");
            float increasedWeight = 18.5f * (height * 2)- currentWeight;
            System.out.println("You should increase weight(kg): " + increasedWeight);
        }
        else if (BMI >= 18.5 && BMI <=24.9) {
            System.out.println("You are normal");

        } else if (BMI >=25 && BMI <=29.9 ) {
            System.out.println("You are overweight");
            float decreasedWeight = currentWeight - 24.9f * (height * 2);
            System.out.println("You should decrease weight(Kg):  "+ decreasedWeight);
        } else {
            System.out.println("You are obese");
            float decreasedWeight = currentWeight - 24.9f * (height * 2);
            System.out.println("You should decrease weight(Kg):  "+ decreasedWeight);
        }
    }

}

