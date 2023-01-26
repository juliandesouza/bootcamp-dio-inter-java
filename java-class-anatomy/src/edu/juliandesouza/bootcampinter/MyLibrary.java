package edu.juliandesouza.bootcampinter;

public class MyLibrary {

    public static void main(String [] args) {

        String firstName = "Julian";
        String secondName = "de Souza teste";

        String [] emails = {"julian@gmail.com" , "julian@hotmail.com" , "julian@yahoo.com"};
        /*  example of array in Java */

        String fullName = fullName(firstName, secondName);
        /* variable = method (two parameters) */

        /*  One big difference between a variable (the first "fullName" up here) and a
        * method (the second one) it's the use of parentheses to input your parameter
        */

        System.out.println(" ");
        System.out.println(fullName);
        System.out.println(" ");
        System.out.println(emails);
        
    }

    public static String fullName(String firstName, String secondName) {
        return firstName . concat(" ").concat(secondName);
    }
}

/* 
* Java Beans - conventions of the language
* Don't short variable e Don't put them in plural, just array can be plural
*/