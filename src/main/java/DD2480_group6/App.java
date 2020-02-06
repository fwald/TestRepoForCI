package DD2480_group6;

/**
 * SIMPLE MATH PROGRAM
 * TO-DO: DOCUMENTATION
 */
public class App 
{
    public int addTwoPlusTwo() {
        return 2+2;
    }

    public int multiply(int x1, int x2) {
        return x1*x2;
    }

    public int fibonacci(int n) {
        if(n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
