# TestRepoForCI

## Description
This is a test program for our CI server.

## Dependencies
The dependencies for this project are handled by Maven. Consequently, you just need to make sure that Java JDK >8 and Maven are installed in your machine. For example from the standard repository:

```sudo apt install maven```

## Building and testing the program
On a terminal at the root of the project directory, the command `mvn test` will fetch the dependencies, compile the source code, run the tests located in `src/test` and output the results in the console.
