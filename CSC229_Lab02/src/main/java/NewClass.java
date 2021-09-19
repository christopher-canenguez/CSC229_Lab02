/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author chriscanenguez
 */
import java.util.Scanner;  // Import the Scanner class

public class NewClass 
{
    // Variables for addTwoIntegers
    private String numsEntered;
    private String[] stringInput;
    private int num1, num2;
    
    // Variables for findMaxProduct
    private int numInts, firstMaxIndex, secondMaxIndex;
    
    public int addTwoIntegers()
    {
        Scanner scan = new Scanner(System.in); // Creating a scanner object.
        
        System.out.println("Please enter two non-negative integers here between 0 and 9 (Format:#1 #2): ");
        numsEntered = scan.nextLine(); // Reading string input from user.
        
        stringInput = numsEntered.split(" "); // Splitting string input from user, seperating both integers in string into indexes in array.
        
        num1 = Integer.parseInt(stringInput[0]); // Converting string input into integer type.
        num2 = Integer.parseInt(stringInput[1]); // Converting string input into integer type.
        
        return num1 + num2; // Return the sum of two integers.
        
    }
    
    public int findMaxProduct()
    {
        int result;
        
        Scanner scan = new Scanner(System.in); // Initialize scanner object.
        
        // Ask the user for how many integers they will enter into array.
        System.out.println("How many integers will you like to enter? Please enter an integer greater than or equal to 2 here: ");
        numInts = scan.nextInt();
        System.out.println(); // Empty line.
        
        // Intialize array of integers of desired size by user.
        int[] numArray = new int[numInts];
        
        // Enter each of the integers by user.
        for(int i = 0; i < numInts; i++)
        {
            System.out.println("Please enter integer #" + (i + 1) + " here: ");
            numArray[i] = scan.nextInt();
            System.out.println(); // Empty line.
        }
        
        // Set first and second max integers.
        firstMaxIndex = 0;
        secondMaxIndex = 1;
        
        // If there are only two elements in the array, will find product of both integers.
        if(numInts == 2)
        {
            result = numArray[firstMaxIndex] * numArray[secondMaxIndex];
            return result;
        }
        // Will traverse through array and find the first and second max integers.
        // Return product of both integers.
        else
        {
            for(int j = 2; j < numInts; j++)
            {
                if(numArray[j] > numArray[firstMaxIndex])
                {
                    secondMaxIndex = firstMaxIndex;
                    firstMaxIndex = j;
                }
            }
            result = numArray[firstMaxIndex] * numArray[secondMaxIndex];
            System.out.println(); // Empty line.
            return result;
        }
        
    }
    
    public static void main(String[] args)
    {
        // Create a NewClass object to use methods.
        NewClass nc1 = new NewClass();
        
        // Test #1
        // Addition of two integers method.
        System.out.println("Test #1: ");
        System.out.println(nc1.addTwoIntegers());
        System.out.println(); // Empty Line.
        
        // Test #2
        // Addition of two integers method.
        System.out.println("Test #2: ");
        System.out.println(nc1.addTwoIntegers());
        System.out.println(); // Empty Line.
        
        // Test #3
        // Addition of two integers method.
        System.out.println("Test #3: ");
        System.out.println(nc1.addTwoIntegers());
        System.out.println(); // Empty Line.
        
        // Test #1
        // Max pair wise product method.
        System.out.println("Test #1: ");
        System.out.println(nc1.findMaxProduct());
        System.out.println(); // Empty Line.
        
        // Test #2
        // Max pair wise product method.
        System.out.println("Test #2: ");
        System.out.println(nc1.findMaxProduct());
        System.out.println(); // Empty Line.
        
        // Test #3
        // Max pair wise product method.
        System.out.println("Test #3: ");
        System.out.println(nc1.findMaxProduct());
        System.out.println(); // Empty Line.
        
    }
}
