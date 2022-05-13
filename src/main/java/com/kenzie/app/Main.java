package com.kenzie.app;

import java.util.Arrays;

public class Main {
    /***********************/
    /* For Loops           */
    /***********************/

    public static void exerciseOne(){
        // ----------------------------------------------------------------------------------------------
        System.out.println("Exercise One"); // Do not modify the lines like this before each exercise, these are to make the console output more readable :)
        // - Change the following loop.
        //   The loop below will run twice, logging 0 and 1 to the console.
        //   Modify the loop so that it runs 10 times, logging 0 to 9 to the console.
        //
        // Write your code here


        for (int index = 0; index < 10; index++) {
            System.out.print(index);
            System.out.print(" ");
        }
        System.out.println();



    }

    public static void exerciseTwo(){
        // ----------------------------------------------------------------------------------------------
        System.out.println("Exercise Two");
        // - Create another for loop
        // - Make your loop count from 1 to 20, logging each number to the console.
        //   1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
        //   (This should include the number 20, but not include the number 0)
        //
        // Write your code here
        for (int index = 1; index <= 20; index++){
            System.out.print(index);
            System.out.print(" ");
        }
        System.out.println();


    }

    public static void exerciseThree(){
        // ----------------------------------------------------------------------------------------------
        System.out.println("Exercise Three");
        // - Create another for loop
        // - Make your loop count from 2 to 20, logging only EVEN numbers to the console.
        //   2 4 6 8 10 12 14 16 18 20
        //   (This should include the number 20, and the number 2, but not include the number 0)
        //
        // Write your code here
        for(int index =2; index <= 20; index=index+2){
            System.out.print(index);
            System.out.print(" ");
        }
        System.out.println();



    }
    public static void exerciseFour(){
        // ----------------------------------------------------------------------------------------------
        // The following exercises will use the numbers array below
        // - First fix this int array to have the proper syntax for declaring an array

        int[] numbers = {22,15, 10, 19, 36, 2, 5, 20};

        // ----------------------------------------------------------------------------------------------
        System.out.println("Exercise Four");
        // - Create another for loop
        // - Have your loop iterate through every number in the numbers array, printing the number to the console.
        //
        // Write your code here
        for(int index = 0; index < numbers.length; index++){
            System.out.print(numbers[index]);
            System.out.print(" ");
        }
        System.out.println();



    }
    public static void exerciseFive(){
        // ----------------------------------------------------------------------------------------------
        System.out.println("Exercise Five");
        // - Create another for loop
        // - Have your loop iterate through every number in the numbers array,
        //   printing out numbers LESS THAN (but not including) 20.
        //
        // Write your code here
        int [] numbers = {22, 15, 10, 19, 36, 2, 5, 20};
        int twenty = 20;

        for(int index = 0; index < numbers.length; index++){
            if(numbers[index] < twenty){
                System.out.print(numbers[index]);
                System.out.print(" ");
            }


        }
        System.out.println();


    }
    public static void exerciseSix(){
        // ----------------------------------------------------------------------------------------------
        System.out.println("Exercise Six");
        // - Using a loop, multiply every number in the numbers array together.
        // - Print the result to the console.
        // - Hint: This should output 451440000
        // - Hint 2: Remember that 0 times anything is 0.  So your result variable should not start at zero :)
        //
        // Write your code here
        int [] numbers = {22, 15, 10, 19, 36, 2, 5, 20};

        int result = 1;

        for(int i = 0; i < numbers.length; i++){
        // 1 * 22 = 22 * 15 * 10 etc etc etc
        result *= numbers[i];

        }
        System.out.print(result);
        System.out.println();

    }

    public static void exerciseSeven(){
        // ----------------------------------------------------------------------------------------------
        System.out.println("Exercise Seven");
        // - Using a loop, find the largest number in the numbers array.
        // - Print it to the console.
        // - Hint: The largest number is 36, so that's what your code should output.
        //   (But don't hardcode that, find it with a loop...)
        //
        // Write your code here
        int [] numbers = {22, 15, 10, 19, 36, 2, 5, 20};

        //create variable that will hold the first int in the array
        int maxNumber = numbers[0];

        //iterate through array
        for(int i = 0; i < numbers.length; i++)
        {
            //is number at this index larger than the number at index 0
            if(numbers[i] > maxNumber){
                //if so store number in maxNumber
                maxNumber = numbers[i];
            }

            //System.out.println(maxNumber);
        }
        System.out.print(maxNumber);

        System.out.println();




    }
    public static void exerciseEight(){
        // ----------------------------------------------------------------------------------------------
        System.out.println("Exercise Eight");
        // - Using two loops, filter out every number smaller than 10 from the numbers array.
        // - 1) You can loop through once to find the size of your new array.
        // - 2) Initialize a new array with the length obtained from step 1.
        // - 3) Loop through numbers array again to put numbers larger than or equal to 10 into the new array.
        // - 4) Print your new array to the console. 
        // Note: check out the Arrays.toString() method!
        // Write your code here
        int [] numbers = {22, 15, 10, 19, 36, 2, 5, 20};
        //first loop through array to get size of the second array
        int sizeOfNewArray = 0;
        for(int index=0; index < numbers.length; index++){
            //look for numbers in array equal to or greater than 10
            if (numbers[index] >= 10){
                sizeOfNewArray++;
            }
        }
        //second loop searches through original array
        int[] greaterThanOrEqual10 = new int[sizeOfNewArray];
        //need counter for this array
        int newIndex = 0;
        for(int index=0; index < numbers.length; index++){
            //find numbers >= 10
            if(numbers[index] >= 10){
                greaterThanOrEqual10[newIndex] = numbers[index];
                newIndex++;
            }
        }
        System.out.print(Arrays.toString(greaterThanOrEqual10));

        System.out.println();



    }

    public static void main(String[] args) {

        exerciseOne();
        exerciseTwo();
        exerciseThree();
        exerciseFour();
        exerciseFive();
        exerciseSix();
        exerciseSeven();
        exerciseEight();

        // When you are done with all of the exercises, check your console output to make sure it
        // matches the expected output of each exercise and remove any extraneous System.out.println()
        // statements from your code.

    }
}
