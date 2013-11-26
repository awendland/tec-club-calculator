import java.util.Scanner;
import java.util.List;
import java.util.Arrays;
/**
 * Write a description of class UserInteraction here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class UserInteraction
{

    static final List<String> CALCULATOR_CMDS = Arrays.asList(new String[]{"a", "s", "m", "d", "p"});

    public static void main(String[] args)
    {
        // Create Calculator object
        Calculator calc = new Calculator();

        // Initialize Scanner for taking user input
        Scanner in = new Scanner(System.in);

        /* Setup an infinite loop so that the user may run multiple calculations without
         * restarting this program
         */
        while(true) {

            // Display a request for user input
            print("Would you like to add, subtract, multiply, divide, or power?\na/s/m/d/p: ");

            // Wait on user input
            String ui = in.next();

            /* Use a list of the possible responses, "a" "s" "m" "d", to check if the 
             * user's response was valid
             */
            if (CALCULATOR_CMDS.contains(ui)) {

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

                /* Following DRY-coding:
                 * because each if-statement results in some variation of
                 * "{a} {operation} {b} = {result}", place the print statement at the end of all of
                 * the if-blocks and use variables initiated here to populate the text to be displayed
                 */
                String operation = "?";
                double result = Double.NaN;
                
                // Select course of action based on user input
                if (ui.equals("a")) {
                    operation = "+";
                    result = calc.add(a, b);
                } else if (ui.equals("s")) {
                    operation = "-";
                    result = calc.subtract(a, b);
                } else if (ui.equals("m")) {
                    operation = "*";
                    result = calc.multiply(a, b);
                } else if (ui.equals("d")) {
                    operation = "/";
                    result = calc.divide(a, b);
                } else if (ui.equals("p")) {
                    operation = "^";
                    result = calc.power(a, (int) b);
                }
                
                // Print expression and result to user
                println(
                    String.valueOf(a) +
                    " " + operation + " " +
                    String.valueOf(b) +
                    " = " +
                    String.valueOf(result)
                );
            }

            // Print a newline at the end of each loop to provide display clarity
            println("");
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
