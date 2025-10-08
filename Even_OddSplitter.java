/*
Name: Marcus Ceradini
Date: 10/2/2025
Description: 3 parts. 1: Prints the even numbers on one line and the odd numbers on another
    2: Prints Shuffle playlist
    3: Display the difference between the highest and lowest number in an array
*/

import java.util.Scanner;
import java.util.Arrays;

public class Even_OddSplitter{

    public static int[] getEvens(int[] nums){

        // counts number of even numbers
        int counter = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] % 2 == 0){
                counter++;
            }
        }

        // makes an array based off the number of evens numbers there are
        int[] evens = new int[counter];

        // fills the array with the even numbers
        int tick = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 == 0){
                evens[tick] = nums[i];
                tick++;
            }
        }
        return evens;
    }


    public static int[] getOdds(int[] nums){
        // counts number of odd numbers
        int counter = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] % 2 != 0){
                counter++;
            }
        }

        // makes an array based off the number of odd numbers there are
        int[] odds = new int[counter];

        // fills the array with the even numbers
        int tick = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] % 2 != 0){
                odds[tick] = nums[i];
                tick++;
            }
        }
        return odds;
    }


    public static void main(String[] args){
        Scanner input = new Scanner(System.in);


        System.out.print("Enter 15 integers with one space between each integer: ");
        int[] userNums = new int[15];

        // only gets the ints in the string
        for (int i = 0; i < userNums.length; i++){
            userNums[i] = input.nextInt();
        }


        // prints out even and odd arrays without brackets
        int[] evens = getEvens(userNums);
        System.out.print("Even numbers: ");
        for (int num: evens){
            System.out.print(num + " ");
        }

        int[] odds = getOdds(userNums);
        System.out.print("Odd numbers: ");
        for (int num: odds){
            System.out.print(num + " ");
        }

        input.close();
    }

}
