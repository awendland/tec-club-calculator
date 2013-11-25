import java.util.Scanner;
/**
 * Write a description of class UserInteraction here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UserInteraction
{
    public static void main(String[] args)
    {
        // Create Calculator object
        Calculator calc = new Calculator();

        // Initialize Scanner for taking user input
        Scanner in = new Scanner(System.in);

        // Display a request for user input
        print("Would you like to add, subtract, multiply, or divide?\na/s/m/d: ");

        // Wait on user input
        String ui = in.next();
        
        /* Following DRY-coding:
         * because all of the Calculator's functions require two numbers to be inputted,
         * this program shall ask for the input before the if-statements so that each
         * statement can simply use these values instead of having to ask for it in each
         * if-block.
         */
        print("First Number: ");
        double a = in.nextDouble();
        print("Second Number: ");
        double b = in.nextDouble();

        // Select course of action based on user input
        if (ui.equals("a")) {
            double result = calc.add(a, b);
            println(
                String.valueOf(a) +
                " + " +
                String.valueOf(b) +
                " = " +
                String.valueOf(result)
            );
        } else if (ui.equals("s")) {
            double result = calc.subtract(a, b);
            println(
                String.valueOf(a) +
                " - " +
                String.valueOf(b) +
                " = " +
                String.valueOf(result)
            );
        } else if (ui.equals("m")) {
            double result = calc.multiply(a, b);
            println(
                String.valueOf(a) +
                " * " +
                String.valueOf(b) +
                " = " +
                String.valueOf(result)
            );
        } else if (ui.equals("d")) {
            double result = calc.divide(a, b);
            println(
                String.valueOf(a) +
                " / " +
                String.valueOf(b) +
                " = " +
                String.valueOf(result)
            );
        }
    }
    
    /**
     * Convenience wrapper around the {@link System.out.print()} method. Prints a string form of the object.
     * 
     * @param o Object to print
     * 
     * @see java.io.PrintStream#print()
     */
    public static void print(Object o)
    {
        System.out.print(o);
    }

    /**
     * Convenience wrapper around the {@link System.out.println()} method. Prints a string form of the object, then a newline.
     * 
     * @param o Object to print
     * 
     * @see java.io.PrintStream#println()
     */
    public static void println(Object o)
    {
        System.out.println(o);
    }
}
