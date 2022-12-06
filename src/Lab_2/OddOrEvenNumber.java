package Lab_2;

import java.util.Scanner;

public class OddOrEvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number: ");
        int number = scanner.nextInt();

        if (number %2 == 0) {
            System.out.println("It's an even number.");
        }
            else {
            System.out.println("It's an odd number.");
            }
        }
    }

