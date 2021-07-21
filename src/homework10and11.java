import jdk.swing.interop.SwingInterOpUtils;

import java.util.Scanner;

public class homework10and11 {
    public static void main(String[] args) {

        //Practical Assignment - Arrays in Java

        //Part 1
        //Create array with 5 elements, type int, initialize values.
        int[] firstArray = new int[5];
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

        int[] otherArray = {((int) (Math.random() * 100d)), ((int) (Math.random() * 100d)), ((int) (Math.random() * 100d)), ((int) (Math.random() * 100d)), ((int) (Math.random() * 100d))};

        //Print all five elements and length of array
        System.out.println("The length of this array is: " + otherArray.length + " elements.");
        System.out.println("All five elements of this array: " + otherArray[0] + ", " + otherArray[1] + ", " + otherArray[2] + ", " + otherArray[3] + ", " + otherArray[4]);
        System.out.println();

        //Calculate and output sum of all elements in array.
        int arraySum = otherArray[0] + otherArray[1] + otherArray[2] + otherArray[3] + otherArray[4];
        System.out.println("Sum of all elements is: " + arraySum);
        System.out.println();

        //Calculating the same with a loop FOR
        int arraySumL = 0;
        for (int i = 0; i < otherArray.length; i++) {
            arraySumL += otherArray[i];
        }
        System.out.println("Sum of all elements using LOOP is: " + arraySumL);
        System.out.println();

        System.out.println("---BONUS TASK WITH USER INPUT---");

        //Add user input. Program should ask user to set first and last element in array. Others elements should have random values.

        Scanner scanner = new Scanner(System.in);
        int[] userInputArray = new int[4];

        System.out.println("Please type in the first array element (int): ");
        userInputArray[0] = scanner.nextInt();

        //Others elements should have random values.
        userInputArray[1] = (int) (Math.random() * 100d);
        userInputArray[2] = (int) (Math.random() * 100d);

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
        System.out.println("--------------------------------------");


        //CLASS TASK
        //Create a simple 1 dimensional array of 10 integers. Select the values yourself
        //1) In a for loop print all odd values
        //2)  Calculate and print sum of all odd values
        System.out.println("CLASS TASK");
        System.out.println();
        int[] newArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int counter = 0;
        for (int i = 0; i < newArray.length; i++) {
            if (newArray[i] % 2 != 0) {
                System.out.println("The odd elements of the array are: " + newArray[i]);
                counter += newArray[i];

            }
        }
        System.out.println("The sum of all odd values in the array is: " + counter);

        //BONUS
        //find the smallest value in the array
        //Find the largest element in the array

        int smallest = Integer.MAX_VALUE;

        for (int i = 0; i < newArray.length; i++) {
            if (smallest > newArray[i]) {
                smallest = newArray[i];
            }
        }
        System.out.println("The smallest value is: " + smallest);

        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < newArray.length; i++) {
            if (largest < newArray[i]) {
                largest = newArray[i];
            }
        }
        System.out.println("The largest value is: " + largest);


    }

}
