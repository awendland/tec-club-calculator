
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
}
