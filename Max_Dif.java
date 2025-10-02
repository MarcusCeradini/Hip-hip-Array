/*
Name: Marcus Ceradini
Date: 10/2/2025
Description: Display the difference between the highest and lowest number in an array
*/

import java.util.Arrays;
import java.util.Scanner;

public class Max_Dif{


    public static int MaxDifference(int[] numbers) {
        
        // sorts the string from highest to lowest and takes the first and last integers
        Arrays.sort(numbers);
        System.out.println("Odd numbers: " + Arrays.toString(numbers));
        int min = numbers[0];
        int max = numbers[numbers.length - 1];

        // using the max and min gets the difference between the top and bottom numbers
        int result = max - min;


        return result;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter numbers (at least 2) seperated by spaces: ");
        String userInput = input.nextLine();

        // splits string by spaces and puts the numbers into an array
        String[] stringVersion = userInput.split(" ");
        //makes new array based off the length and converts them to ints
        int[] intVersion = new int[stringVersion.length];
        for (int i = 0; i < intVersion.length; i++){
            intVersion[i] = Integer.parseInt(stringVersion[i]);
        }


        int difference = MaxDifference(intVersion);
        System.out.println("Maxium difference: " + difference);
        


        input.close();
    }

}