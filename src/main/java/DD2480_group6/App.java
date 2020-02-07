package DD2480_group6;

/**
 * This is an App which contains three simple math methods.
 */

public class App 
{

    /**
     * Adds two plus two.
     * @return              an int equal to 4.
     */

    public int addTwoPlusTwo() {
        return 2+2;
    }

    /**
     * Multiplies two integers.
     * @param x1                an int, the first integer to multiply.
     * @param x2                an int, the second integer to multiply.
     * @return                  an int, the product of the two integers.
     */

    public int multiply(int x1, int x2) {
        return x1*x2;
    }

    /**
     * Obtains the n-th Fibonacci number.
     * @param n             a (preferrably positive) int, the subindex in the sequence of Fibonacci numbers (1, 1, 2, 3, 5, ... )
     * @return              an int, the n-th Fibonacci number.
     */

    public int fibonacci(int n) {
        if(n <= 1)
            return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
