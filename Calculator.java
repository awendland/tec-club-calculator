
/**
 * Calculator object for providing basic mathematical functions
 * 
 * @author Alex Wendland 
 * @version 1.0
 */
public class Calculator
{

    /**
     * Create a blank Calculator object
     */
    public Calculator()
    {
    }

    /**
     * Add two numbers
     * 
     * @param  a    double of the first value
     * @param b double of the second value
     * @return     the sum of a and b 
     */
    public double add(double a, double b)
    {
        return a + b;
    }

    /**
     * Subtract one number from another
     * 
     * @param  a    double of the value to subtract from
     * @param b double of the quantity being removed
     * @return     the difference of a and b 
     */
    public double subtract(double a, double b)
    {
        return a - b;
    }

    /**
     * Multiply two numbers
     * 
     * @param  a    double of the first value
     * @param b double of the second value
     * @return     the product of  and b 
     */
    public double multiply(double a, double b)
    {
        return a * b;
    }

    /**
     * Divide one number into another
     * 
     * @param  a    double of the numerator
     * @param b double of the divisor
     * @return     the quotient of a and b 
     */
    public double divide(double a, double b)
    {
        return a / b;
    }

    /**
     * Raise one number to the power of another. This uses a simple for-loop style 
     * algorithm and cannot handle fractional exponents, only integers are supported.
     * 
     * @param  a    double value for the base
     * @param b int value for the exponent
     * @return     the result of a raised to the b 
     */
    public double power(double a, int b)
    {
        // Is b positive? Or is it negative?
        boolean isExpPos = b >= 0;

        // Take absolute value of b for looping purposes
        int absExp = isExpPos ? b : -b;

        // Store result in a variable. This variable will be updated with each iteration of the loop.
        double result = 1.0;

        for(int i = 0; i < absExp; i++) {
            result *= a;
        }

        // If b is positive, simply return the result
        if (isExpPos) {
            return result;
        } 
        // If exponent is negative, then return the inverse of the result.
        else {
            return 1.0 / result;
        }
    }
}
