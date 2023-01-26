package edu.juliandesouza.bootcampinter;

public class Math {
    
    public static void main(String [] args) {

        int a, b;
        a=5;
        b=6;

        String result = a==b ? "true" : "false";
        /*
         * Above you can see an example of a conditional ternary operator, 
         * when using == you compare two variable, ? meaning: if right so return this 
         * or attribut this to the variable and : meaning else
         */

        System.out.println(result);

        int anotherResult = a==b ? 1 : 0;
        /*
         * You can also use numbers instead of string to represent boolean here
         */
        
        System.out.println(anotherResult);

        String firstName = "Julian";
        String secondName = "Julian";

        System.out.println(firstName.equals(secondName));
        /*
         * To compare texts, strings, objects you can use equals
         */
         
    }

}
