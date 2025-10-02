/*
Name: Marcus Ceradini
Date: 10/2/2025
Description: Prints the even numbers on one line and the odd numbers on another
*/

import java.util.Scanner;
import java.util.Arrays;

public class Even_OddSplitter{

    public static int[] getEvens(int[] nums){
        int counter = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] % 2 == 0){
                counter++;
            }
        }

        int[] evens = new int[counter];
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
        int counter = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] % 2 != 0){
                counter++;
            }
        }

        int[] odds = new int[counter];
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

        for (int i = 0; i < userNums.length; i++){
            userNums[i] = input.nextInt();
        }
        

        int[] evens = getEvens(userNums);
        System.out.println("Even numbers: " + Arrays.toString(evens));

        int[] odds = getOdds(userNums);
        System.out.println("Odd numbers: " + Arrays.toString(odds));

        input.close();
    }

}
