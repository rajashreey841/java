class Hello
{
    public static void main (String[] args)
    {
        int x = 5;
        int result = 0;
        // Using a ternary operator to determine the value of result based on the value of x
        result = (x % 2 == 0) ? 10 : 20;
        // Using ternary operator to assign value to result
        // The above code is equivalent to the following if-else statement
        // if (x % 2 == 0) {
        //     result = 10;
        // } else {
        //     result = 20;
        // }
        // Print the result 
        System.out.println("Result is: " + result);
    }
}
