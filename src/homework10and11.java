import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class homework10and11 {
    public static void main(String[] args) {

        //Practical Assignment - Arrays in Java

        //Part 1
        //Create array with 5 elements, type int, initialize values.
        int[] firstArray = new int [5];
        firstArray[0] = 13;
        firstArray[1] = 5;
        firstArray[2] = 8;
        firstArray[3] = 21;
        firstArray[4] = 16;

        //Print first, last and any other element from array.
        System.out.println("First element: " + firstArray[0]);
        System.out.println("Last element: " + firstArray[4]);
        System.out.println("Any other (third) element: " + firstArray[2]);
        System.out.println();


        //Change program - initialization of values should use random numbers
        //?????

        int[] otherArray = {13, 5, 8, 21, 16};

        //Print all five elements and length of array
        System.out.println("The length of this array is: " + otherArray.length + " elements.");
        System.out.println("All five elements of this array: "+ otherArray[0] + ", " + otherArray[1] + ", " + otherArray[2] + ", " + otherArray[3] + ", " + otherArray[4]);
        System.out.println();

        //Calculate and output sum of all elements in array.
        int arraySum = otherArray[0] + otherArray[1] + otherArray[2] + otherArray[3] + otherArray[4];
        System.out.println("Sum of all elements is: " + arraySum);
        System.out.println();

        System.out.println("---BONUS TASK WITH USER INPUT---");

        //Add user input. Program should ask user to set first and last element in array. Others elements should have random values.

        Scanner scanner = new Scanner(System.in);
        int[] userInputArray = new int [4];

        System.out.println("Please type in the first array element (int): ");
        userInputArray[0] = scanner.nextInt();

        //Others elements should have random values.
        userInputArray[1] = (int)(Math.random()*100);
        userInputArray[2] = (int)(Math.random()*100);

        System.out.println("Please type in the second array element (int): ");
        userInputArray[3] = scanner.nextInt();

        //Output all elements
        System.out.println("The elements in this array are: " + userInputArray[0] + ", " + userInputArray[1] + ", " + userInputArray[2] + ", " + userInputArray[3]);

        //calculate sum of all elements
        int sumAll = userInputArray[0] + userInputArray[1] + userInputArray[2] + userInputArray[3];
        System.out.println("The sum of all these elements is: " + sumAll);

        //sum of elements that were set by user input
        int sumUser = userInputArray[0] + userInputArray[3];
        System.out.println("The sum of elements set by user input is: " + sumUser);



        //PART 2
        //Using teachers code as example create two dimensional array 3x5 and initiate values.
        //Output these in proper way.





        //BONUS 2
        //change type to float, add functionality that calculates sum-s in rows and in columns






        //Practical Assignment - Loops in Java. Part 1



    }
}
