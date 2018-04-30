/*
Anna Pack 
Assignment #3 - Menu Driven Application
Extra Credit Attempted
Help received from Computer Lab tutors: Ian Taylor & Kyle Burgi, 1-1 tutor Blake Noel, 
                   & friend Roque Alexandre Goncalves.
*/


import java.util.Scanner;
import java.util.ArrayList;

public class IntFun
{
public static void main(String[] args)
  {
     int option;
     int num = 0;
     int optionOne;

     Scanner kb = new Scanner(System.in);
     System.out.println("Please enter a non-negative integer: ");
     num = kb.nextInt();


     while(num < 0)
       {
        System.out.println("I am sorry that is not a non-negative integer.");
        System.out.println("");
        System.out.println("Please enter a non-negative integer: ");
        num = kb.nextInt();
       }
            
      //ask for initial do while
      option = displayMenu(kb);
     //start dowhile 
     do
     {
     
     
      
     if(option == 1)
     {
      num = getNum(kb);
     
     }
     
     else if(option == 2)
     {
      optionTwo(num);
     }
     
     else if(option == 3)
     {
      optionThree(num); 
     }
     
     else if(option == 4)
     {
      optionFour(num);
     }
     
     else if (option == 5)
     {
     //quitting
        System.out.println();
        System.out.println("Thank you. Have a nice day.");
        break;
     }
     option = displayMenu(kb);
     }while(option>0);

}
   private static int displayMenu(Scanner kb)
   {
   int menuOption = 0;
   System.out.println("Please choose one of the following options: ");
   System.out.println("1: Enter a new number");
   System.out.println("2: Print the number of odd digits, even digits, and zeroes in the integer");
   System.out.println("3: Print the prime numbers between 2 and the integer.");
   System.out.println("4: Print the sum of the digits of the integer. ");
   System.out.println("5: Quit");
   
   menuOption = kb.nextInt();
   while ( menuOption < 1 || menuOption > 5) 
   {
      System.out.println("Sorry that is not an option. Please choose again: ");
      menuOption = kb.nextInt();
   }
   return menuOption;
      
   }
   
   private static int getNum(Scanner kb)
   {
   System.out.println("Enter a number: ");
   return kb.nextInt();
   }

 private static void optionTwo(int num)
 {
   int calcNum = num;
   int even = 0;
   int odd = 0 ;
   int zeroes = 0;
   while(calcNum > 0)
   {
   
      if(calcNum % 10 == 0)
      {
         zeroes++;
      }
      
      else if(calcNum % 2 == 0)
      {
      even++;
      }
      
      else
      {
      odd++;
      }
      
      calcNum = calcNum/10;
   
   }
   
   System.out.println("Evens: " + even);
   System.out.println("Odds: " + odd);
   System.out.println("Zeroes: " + zeroes);
 }
 
 private static void optionThree(int num) //Extra Credit attempted here
 {
   int i = 2;
   int newNum = num;
   //String primeNumbers = ""; 
   ArrayList <Integer> primeNumbers = new ArrayList(); //It is the same as you line above, but creating a empty array
   
   for ( i = 2; i <= num; i++) 
   {
      int counter = 0; 
      for (newNum = i; newNum >= 1; newNum --)
      {
         if (i%newNum == 0)
         {
            counter = counter + 1; 
         }
      }
      if (counter == 2)
      {
         primeNumbers.add(i); //this line will intert the prime number i into the array
      //primeNumbers = primeNumbers + i + " ";
      }
   }
   System.out.println("Prime numbers from 2 to the integer are: "); 
   //System.out.println(primeNumbers);
   for(int j = 0; j < primeNumbers.size(); j++){
      System.out.print(primeNumbers.get(j) + " ");
   } 
   System.out.println(" ");
 }
 
 private static void optionFour (int num) 
 {
   int sum = 0; 
   while (num != 0)
   {
      sum += num % 10; 
      num /= 10;
   } 
   System.out.println("The sum of digits of the integer is: ");
   System.out.println(sum);
    
  } 

}