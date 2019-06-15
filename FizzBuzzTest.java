/*
 Write a program that will take an integer and print Fizz if the number is divisible by 3,
Buzz if the number is divisible by 5, FizzBuzz if the number is divisible by 3 and 5, 
and the number itself for all other cases.
 */

//Author: Reza Akhlaqi      6-14-2019


//declare the Package
package fizzbuzz;

//Declare the main methode
public class FizzBuzzTest {
    public static void main(String[] args) {
        
        //here we make 3 new variables (test1,2, and 3) for FizzBuzz 
        //new FizzBuzz(); means call the FizzBuzz Class and apply its methode
        FizzBuzz test1= new FizzBuzz();
        FizzBuzz test2= new FizzBuzz();
        FizzBuzz test3= new FizzBuzz();
        FizzBuzz test4= new FizzBuzz();

        //here make 3 string (Calc1,2,3) to be calculated for the three var of Test1,2,3
        String Calc1 = test1.FizzBuzz(9);
        String Calc2 = test2.FizzBuzz(10);
        String Calc3 = test3.FizzBuzz(15);
        String Calc4 = test4.FizzBuzz(16);
        
        //display the result of calculation according to FizzBuzz Class
        System.out.println(Calc1);
        System.out.println(Calc2);
        System.out.println(Calc3);
        System.out.println(Calc4);

    }
}
/* The output will be:
Fizz
Buzz
FizzBuzz
*/