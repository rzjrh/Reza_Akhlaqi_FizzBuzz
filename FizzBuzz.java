/*
 Write a program that will take an integer and print Fizz if the number is divisible by 3,
Buzz if the number is divisible by 5, FizzBuzz if the number is divisible by 3 and 5, 
and the number itself for all other cases.
 */
/* This class is the driver class for the FizzBuzz.java class
 */
//here we use if-else-if conditions
package fizzbuzz;
public class FizzBuzz {
    public String FizzBuzz (int number) {
        if (number % 5==0 && number %3==0) {
            return "FizzBuzz";}
         else if (number % 3 ==0){
            return "Fizz";}
        else if (number % 5 ==0){
            return "Buzz";}
        else {
            return ("number"); 
        }
    
    }
    
}
