Simple Four-Function Calculator
========

### Abstract
A basic Java program that consists of a Calculator class for handling basic calculation methods and a UserInteraction class for handling user input and commands.

### Purpose

This is a basic Java project created to demonstrate multiple core Java principles:

1. Classes vs. Objects
  * <code>static</code> declarations
  * Normal object methods
  * <code>new</code> statements
  * Instance variables
2. Looping
  * <code>while</code> loops
  * <code>for</code> loops
3. <code>if</code>, <code>else if</code>, and <code>else</code> logical statements
  * ternary operators
4. Variable types
  * <code>double</code>
  * <code>if</code>
  * <code>String</code>
  * <code>String[]</code>
5. DRY-coding
6. Separation of functionality from interaction
7. <code>String</code> manipulation and concatenation
8. Taking <code>Scanner</code> console input

###Overview
Two Classes, <code>UserInteraction</code> and <code>Calculator</code>. UserInteraction handles console input from a user and exposes the functionality setup in <code>Calculator</code>. <code>Calculator</code> contains 5 mathematical methods: <code>add(double, double)</code>, <code>subtract(double, double)</code>, <code>multiply(double, double)</code>, <code>divide(double, double)</code>, and <code>power(double, int)</code>.

All methods but <code>power(double, int)</code> simply return <code>{the first int} {the built in operation} {the second int}</code>, eg <code>int + int</code>. <code>power(double, double)</code> uses a custom <code>for</code> loop implementation that supports any real number as the base and can handle any positive or negative integer as the exponent.