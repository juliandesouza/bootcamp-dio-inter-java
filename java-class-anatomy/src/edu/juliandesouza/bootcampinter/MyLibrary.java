package edu.juliandesouza.bootcampinter;

public class MyLibrary {

    public static void main(String[] args) {

        String firstName = "Julian";
        String secondName = "de Souza teste";

        String fullName = fullName(firstName, secondName);
        /// variable = method (two parameters)

        /// One big difference between a variable (the first "fullName" uphere) and a
        /// method (the second one) it's the use of parentheses to input your parameter
        
        System.out.println(" ");
        System.out.println(fullName);
        System.out.println(" ");
    }

    public static String fullName(String firstName, String secondName) {
        return firstName.concat(" ").concat(secondName);
    }

}
